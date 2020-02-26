# SQL Blood Relations Analysis

A simple tool for analyzing the tables, generated tables, and task-to-task dependencies in a large number of SQL data tasks. In recent years, data processing has attracted particular attention, so that in many enterprises, a large number of data processing tasks written by different people are piled up, interdependent and related. When a task fails, a developer who is only involved in part of the project is having difficulty maintaining a data flow project built on a large and complex business logic, so I wrote this tool.

Currently this script is aimed at analyzing spark sql. May support more in the future

Chinese: 一个简单的工具，用于在非常多的SQL数据任务中，分析任务所使用的表、生成的表、任务与任务的依赖关系。近年来数据处理尤其受到关注，以至于在许多企业里，大量的不同人员编写的数据处理任务堆积，相互依赖与关联。当一个任务失败的时候，一个只参与了部分项目的开发人员，是难以维护一个建立在庞大而复杂业务逻辑上的数据流项目的，因此我编写了这个工具。目前这个脚本针对于分析 Spark SQL，将来也许会支持更多。

## TODO

- [x] Parse multiple tasks and task scripts, parse tables referenced in the script, generated tables, and generate task dependency reports through SQL syntax. 
- [ ] Render dependency chart.
- [ ] Easy CLI tools, and usage document.
- [ ] Support for more SQL syntax.

Chinese: 

- [x] 解析多个任务和任务脚本，通过SQL语法解析脚本中引用的表、生成的表，并生成任务依赖关系报告。
- [ ] 依赖关系渲染图表。
- [ ] 简单易用的命令行包装，和用例文档。
- [ ] 支持更多的 SQL 语法。

## COPYRIGHTS

Using a little part code of presto and spark.
