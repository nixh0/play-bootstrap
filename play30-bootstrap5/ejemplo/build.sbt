name := """ejemplo"""
organization := "ejemplo"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).
settings(
  name := "ejemplo",
  version := "1.0-SNAPSHOT",
  scalaVersion := "2.13.16"
)
.enablePlugins(PlayJava)

scalaVersion := "2.13.16"

//scalaVersion := "3.7.1"

libraryDependencies ++= Seq(
  guice,
  filters,
  "org.webjars" % "bootstrap" % "4.3.1" exclude("org.webjars", "jquery"),
  "org.webjars" % "jquery" % "3.3.1-2",
  "org.webjars" % "font-awesome" % "4.7.0",
  "org.webjars" % "bootstrap-datepicker" % "1.4.0" exclude("org.webjars", "bootstrap")
)

unmanagedBase := baseDirectory.value / "lib"
