


lazy val root = project
  .in(file("."))
  .settings(
    name := "core-play30",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.13.16",
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
  )
  .enablePlugins(PlayScala)
  .disablePlugins(PlayFilters, PlayLogback )

libraryDependencies := libraryDependencies.value.filterNot(m => m.name == "twirl-api" || m.name == "play-server") ++ Seq(
  playCore % "provided"
)


scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Wconf:msg=Implicit parameters should be provided with a `using` clause:s"
)




//*******************************
// Maven settings
//*******************************
sonatypeProfileName := "com.adrianhurt"
publishMavenStyle := true
organization := "com.adrianhurt"
description := "This is a collection of input helpers and field constructors for Play Framework to render Bootstrap HTML code."

import xerial.sbt.Sonatype._
sonatypeProjectHosting := Some(GitHubHosting("playframework", "play-bootstrap", "contact@playframework.com"))

homepage := Some(url("http://playframework.github.io/play-bootstrap"))
licenses := Seq("Apache License" -> url("https://github.com/playframework/play-bootstrap/blob/master/LICENSE"))
startYear := Some(2015)