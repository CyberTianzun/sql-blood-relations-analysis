package cn.hiroz.bloodrelations

import java.io.{File, IOException}
import java.nio.charset.Charset

import com.google.common.io.Files
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import org.apache.spark.sql.catalyst.analysis.UnresolvedRelation
import org.apache.spark.sql.catalyst.parser.{SqlBaseLexer, SqlBaseParser}
import org.apache.spark.sql.catalyst.plans.logical.{InsertIntoTable, LogicalPlan, SubqueryAlias, With}

import scala.collection.JavaConverters._

class ScriptParser(val filepath: String, val env: Map[String, String]) {

    var cacheTableNames = scala.collection.mutable.Set[String]()
    var referenceTableNames = scala.collection.mutable.Set[String]()
    var productTableNames = scala.collection.mutable.Set[String]()

    def parse(): Unit = {
        try {
            var raw = Files.toString(new File(this.filepath), Charset.defaultCharset)
            raw = raw.replaceAll("/\\*+", "/*")
            if (env != null) {
                env.foreach(kv => {
                    raw = raw.replaceAll("\\$\\{" + kv._1 + "}", kv._2)
                })
            }
            parseScript(raw)
        } catch {
            case e: IOException =>
                e.printStackTrace()
        }
    }

    private def parseScript(raw: String): Unit = {
        val statementSplitter = new StatementSplitter(raw)
        import scala.collection.JavaConversions._
        for (statement <- statementSplitter.getCompleteStatements) {
            parseStatement(statement.statement)
        }
    }

    private def parseStatement(statement: String): Unit = {
        println(statement)
//        printTokens(statement)
        val lexer = new SqlBaseLexer(new CaseInsensitiveStream(CharStreams.fromString(statement)))
        val parser = new SqlBaseParser(new CommonTokenStream(lexer))
        val bb = parser.singleStatement
        val astBuilder = new CustomAstBuilder()
        val logicalPlan = astBuilder.visitSingleStatement(bb)

        if (logicalPlan != null) {
            println(logicalPlan.treeString)
            visitLogicalPlan(logicalPlan)
        }

        cacheTableNames = cacheTableNames ++ astBuilder.cacheTableNames
        productTableNames = productTableNames ++ astBuilder.productTableNames
        referenceTableNames = referenceTableNames -- cacheTableNames

        println()
    }

    private def printTokens(statement: String) = {
        val lexer = new SqlBaseLexer(new CaseInsensitiveStream(CharStreams.fromString(statement)))
        lexer.getAllTokens.asScala.foreach(token => println(token.getText + " " + token.getType))
    }

    private def visitLogicalPlan(logicalPlan: LogicalPlan): Unit = {
        logicalPlan match {
            case relation: UnresolvedRelation =>
                println("Found reference: " + relation.tableName)
                referenceTableNames.add(relation.tableName)
            case subquery: SubqueryAlias =>
                println("Found alias tablename: " + subquery.alias)
                cacheTableNames.add(subquery.alias)
            case insertIntoTable: InsertIntoTable =>
                if (insertIntoTable.table.isInstanceOf[UnresolvedRelation]) {
                    println("Found product: " + insertIntoTable.table.asInstanceOf[UnresolvedRelation].tableName)
                    productTableNames.add(insertIntoTable.table.asInstanceOf[UnresolvedRelation].tableName)
                }
            case withCtx: With =>
                for ((name, child) <- withCtx.cteRelations) {
                    println("Found alias tablename: " + name)
                    cacheTableNames.add(name)
                    visitLogicalPlan(child)
                }
            case _ =>

        }
        for (child <- logicalPlan.children) {
            visitLogicalPlan(child)
        }
    }

}
