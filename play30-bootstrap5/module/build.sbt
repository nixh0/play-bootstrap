//import scalariform.formatter.preferences._


lazy val root = project
  .in(file("."))
  .settings(
    name := "play-bootstrap",
    version := "1.6.1-P30-B5",
    scalaVersion := "2.13.16",
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
  )
  .enablePlugins(PlayScala)
  .disablePlugins(PlayFilters, PlayLogback )
  
  //.disablePlugins(PlayFilters, PlayAkkaHttpServer)

// resolvers ++= Seq(
//   "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases",
//   "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
// )

libraryDependencies := libraryDependencies.value.filterNot(m => m.name == "twirl-api" || m.name == "play-server") ++ Seq(
  playCore % "provided",
  filters % "provided",
  // "com.adrianhurt" %% "play-bootstrap-core" % "1.6.1-P30-B5",
  // specs2 % Test
)

unmanagedBase := baseDirectory.value / "lib"


// scalariformPreferences := scalariformPreferences.value
//   .setPreference(AlignSingleLineCaseStatements, true)
//   .setPreference(DoubleIndentConstructorArguments, true)
//   .setPreference(DanglingCloseParenthesis, Preserve)

// PlayKeys.playOmnidoc := false

//*******************************
// Maven settings
//*******************************
publishMavenStyle := true
organization := "com.adrianhurt"
description := "This is a collection of input helpers and field constructors for Play Framework to render Bootstrap HTML code."


// import xerial.sbt.Sonatype._
// sonatypeProjectHosting := Some(GitHubHosting("playframework", "play-bootstrap", "contact@playframework.com"))

// homepage := Some(url("https://playframework.github.io/play-bootstrap"))

// licenses := Seq("Apache License" -> url("https://github.com/playframework/play-bootstrap/blob/master/LICENSE"))

// startYear := Some(2014)

// publishTo := {
//   val nexus = "https://oss.sonatype.org/"
//   if (isSnapshot.value)
//     Some("snapshots" at nexus + "content/repositories/snapshots")
//   else
//     Some("releases"  at nexus + "service/local/staging/deploy/maven2")
// }

// publishArtifact in Test := false

// pomIncludeRepository := { _ => false }

// credentials += Credentials(Path.userHome / ".sbt" / "sonatype.credentials")

// publishConfiguration := publishConfiguration.value.withOverwrite(isSnapshot.value)
// com.typesafe.sbt.pgp.PgpKeys.publishSignedConfiguration := com.typesafe.sbt.pgp.PgpKeys.publishSignedConfiguration.value.withOverwrite(isSnapshot.value)
// publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(isSnapshot.value)
// com.typesafe.sbt.pgp.PgpKeys.publishLocalSignedConfiguration := com.typesafe.sbt.pgp.PgpKeys.publishLocalSignedConfiguration.value.withOverwrite(isSnapshot.value)
