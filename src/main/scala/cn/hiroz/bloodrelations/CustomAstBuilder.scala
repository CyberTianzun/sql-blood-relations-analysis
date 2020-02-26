package cn.hiroz.bloodrelations

import org.apache.spark.sql.catalyst.parser.{AstBuilder, SqlBaseParser}

class CustomAstBuilder extends AstBuilder {

    val cacheTableNames = scala.collection.mutable.Set[String]()
    val productTableNames = scala.collection.mutable.Set[String]()

    override def visitCacheTable(ctx: SqlBaseParser.CacheTableContext): AnyRef = {
        System.out.println("Found alias tablename: " + ctx.tableIdentifier.getText)
        cacheTableNames.add(ctx.tableIdentifier.getText)
        if (ctx.query() == null) {
            return null
        }
        this.plan(ctx.query)
    }

    override def visitCreateView(ctx: SqlBaseParser.CreateViewContext): AnyRef = {
        System.out.println("Found new view: " + ctx.tableIdentifier.getText)
        productTableNames.add(ctx.tableIdentifier().getText)
        super.visitCreateView(ctx)
    }

    override def visitCreateTable(ctx: SqlBaseParser.CreateTableContext): AnyRef = {
        throw new RuntimeException("!!!")
        super.visitCreateTable(ctx)
    }

    override def visitCreateHiveTable(ctx: SqlBaseParser.CreateHiveTableContext): AnyRef = {
        System.out.println("Found new table: " + ctx.createTableHeader().tableIdentifier().getText)
        productTableNames.add(ctx.createTableHeader().tableIdentifier().getText)
        super.visitCreateHiveTable(ctx)
    }

}
