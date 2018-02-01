val ApacheSpark = RootProject(uri("git://github.com/scalacenter/spark.git#ee81ca99512e41a492d867230fa2b20cae6000ec"))
val LihaoyiUtest = RootProject(uri("git://github.com/lihaoyi/utest.git#b5440d588d5b32c85f6e9392c63edd3d3fed3106"))

val integrations = project.in(file(".")).aggregate(ApacheSpark, LihaoyiUtest)

