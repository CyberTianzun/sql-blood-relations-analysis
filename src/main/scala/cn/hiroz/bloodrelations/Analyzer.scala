package cn.hiroz.bloodrelations

import java.io.File

import scala.collection.mutable.ArrayBuffer

object Analyzer {

    val env = prepareEnvVariable()

    def main(args: Array[String]) = {
        val root = "/Users/hiro/workspace/tasks/cn"

        var taskList = ArrayBuffer[String]()
        val referenceTableNamesMap = scala.collection.mutable.Map[String, Set[String]]()
        val productTableNamesMap = scala.collection.mutable.Map[String, Set[String]]()
        val taskDependeniesMap = scala.collection.mutable.Map[String, ArrayBuffer[String]]()
        val taskDependeniesMap2 = scala.collection.mutable.Map[String, ArrayBuffer[String]]()

        val file = new File(root)
        val children = file.listFiles
        for (child <- children) {
            if (child.isDirectory) {
                val taskName = child.getName
                val (referenceTableNames, productTableNames) = processTask(child)

                taskList.append(taskName)
                referenceTableNamesMap.put(taskName, referenceTableNames)
                productTableNamesMap.put(taskName, productTableNames)
                taskDependeniesMap.put(taskName, ArrayBuffer[String]())
                taskDependeniesMap2.put(taskName, ArrayBuffer[String]())
            }
        }

        for (taskName <- taskList) {
            println("Task " + taskName + ":")
            println("referenceTableNames:")
            println(referenceTableNamesMap(taskName).mkString(","))
            println("productTableNames:")
            println(productTableNamesMap(taskName).mkString(","))
            println("dependOnTasks:")

            for (compareTaskName <- taskList) {
                if (!taskName.equals(compareTaskName)) {
                    val interact = referenceTableNamesMap(taskName) & productTableNamesMap(compareTaskName)
                    if (interact.nonEmpty) {
                        taskDependeniesMap(taskName).append(compareTaskName)
                        println("- " + compareTaskName + ": " + interact.mkString(","))
                    }
                }
            }

            println()
        }

        println("Generate scala object")
        println("Map(")
        for (taskName <- taskList) {
            println("    \"" + taskName + "\" -> Map(")
            println("        \"referenceTableNames\" -> Set(" + referenceTableNamesMap(taskName).map("\"" + _ + "\"").mkString(", ") + "),")
            println("        \"productTableNames\" -> Set(" + productTableNamesMap(taskName).map("\"" + _ + "\"").mkString(", ") + "),")
            for (compareTaskName <- taskList) {
                if (!taskName.equals(compareTaskName)) {
                    val interact = referenceTableNamesMap(taskName) & productTableNamesMap(compareTaskName)
                    if (interact.nonEmpty) {
                        taskDependeniesMap2(taskName).append(compareTaskName)
//                        println("- " + compareTaskName + ": " + interact.mkString(","))
                    }
                }
            }
            println("        \"dependOnTasks\" -> Set(" + taskDependeniesMap(taskName).map("\"" + _ + "\"").mkString(", ") + ")")
            println("    ),")
        }
        println(")")
        println()

//        taskList = taskList.sortBy(taskName => taskDependeniesMap(taskName).size)
//
//        val idMap = scala.collection.mutable.Map[String, Int]()
//        var i = 0
//        for (taskName <- taskList) {
//            idMap.put(taskName, i)
//            i += 1
//        }
//        println("Generate nodes and links data")
//        println("const nodes = [")
//        for (taskName <- taskList) {
//             println("    { id: " + idMap(taskName) + ", reflexive: false, text: '" + taskName + "' },")
//        }
//        println("];")
//        println("const links = [")
//        for (taskName <- taskList) {
//            for (denpendTaskName <- taskDependeniesMap(taskName)) {
//                 println("    { source: nodes[" + idMap(denpendTaskName) + "], target: nodes[" + idMap(taskName) + "], left: false, right: true },")
//            }
//        }
//        println("];")
//        println()
    }

    def parseDirectory(dir: File) = {
        var flowFile: File = null
        val sqlFiles = ArrayBuffer[File]()
        for (child <- dir.listFiles()) {
            if (child.getName.endsWith(".flow")) {
                flowFile = child
            } else if (child.getName.endsWith(".sql")) {
                sqlFiles.append(child)
            }
        }
        (flowFile, sqlFiles.toSeq)
    }

    def processTask(dir: File) = {
        println("Process task: " + dir.getName)
        val (flowFile, sqlFiles) = parseDirectory(dir)
        println("Flow file: " + flowFile.getName)

        var referenceTableNames = Set[String]()
        var productTableNames = Set[String]()
        for (sqlFile <- sqlFiles) {
            println("Found sql file: " + sqlFile.getName)
            val scriptParser = new ScriptParser(sqlFile.getPath, env)
            scriptParser.parse()

            referenceTableNames = referenceTableNames ++ scriptParser.referenceTableNames
            productTableNames = productTableNames ++ scriptParser.productTableNames
        }

        // 删除自身引用自己的表
        referenceTableNames = referenceTableNames --  productTableNames

        (referenceTableNames, productTableNames)
    }

    def prepareEnvVariable() = {
        val processString =
            """
              |now=`date '+%Y%m%d'`;
              |before=`date -d -1day '+%Y%m%d'`;
              |before2=`date -d -2day '+%Y%m%d'`;
              |before3=`date -d -3day '+%Y%m%d'`;
              |before7=`date -d -7day '+%Y%m%d'`;
              |before10=`date -d -10day '+%Y%m%d'`;
              |before14=`date -d -14day '+%Y%m%d'`;
              |before30=`date -d -30day '+%Y%m%d'`;
              |yesterday=`date -d -1day '+%Y%m%d'`;
              |
              |before_line=`date -d -1day '+%Y-%m-%d'`;
              |before2_line=`date -d -2day '+%Y-%m-%d'`;
              |before3_line=`date -d -3day '+%Y-%m-%d'`;
              |before7_line=`date -d -7day '+%Y-%m-%d'`;
              |before10_line=`date -d -10day '+%Y-%m-%d'`;
              |before14_line=`date -d -14day '+%Y-%m-%d'`;
              |before30_line=`date -d -30day '+%Y-%m-%d'`;
              |
              |before_ym=`date -d -1day '+%Y%m'`
              |before_yy=`date -d -1day '+%Y'`
              |before_mm=`date -d -1day '+%m'`
              |before_dd=`date -d -1day '+%d'`
              |
              |now_line_second=`date +%Y-%m-%d" 00:00:00"`
              |before_month_line_second=`date -d +%Y-%m"-01 00:00:00"`
              |
              |before15month=`date -d -15months '+%Y%m'`
            """.stripMargin
                .replaceAll("[`'\"+;]", "")
                .replaceAll("date ", "")
                .replaceAll("-d ", "")
                .replaceAll("-\\d*(day|months)", "")
                .replaceAll("%Y", "2016")
                .replaceAll("%m", "01")
                .replaceAll("%d", "31")

        processString.split("\n")
            .filter(_.contains("="))
            .map(line => {
                val tmp = line.split("=")
                val v = tmp(1).trim
                (tmp(0), v)
            })
            .toMap
    }

}
