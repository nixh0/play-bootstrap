

name := """play-bootstrap-sample"""

version := "1.7"

scalaVersion := "2.13.16"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

// resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
  guice,
  filters,
  //"com.adrianhurt" %% "play-bootstrap" % "1.6.1-P28-B4",
  // Bootstrap 5 sin jQuery incluido (ya no lo necesita)
  "org.webjars" % "bootstrap" % "5.3.3" exclude("org.webjars", "jquery"),
  // jQuery necesario para otras librerías
  "org.webjars" % "jquery" % "3.6.0", // mejor versión más reciente
  // Font Awesome 4.7
  "org.webjars" % "font-awesome" % "4.7.0",


  "org.webjars.npm" % "vanillajs-datepicker" % "1.3.4"


)


unmanagedBase := baseDirectory.value / "lib"

// scalariformPreferences := scalariformPreferences.value
//   .setPreference(AlignSingleLineCaseStatements, true)
//   .setPreference(DoubleIndentConstructorArguments, true)
//   .setPreference(DanglingCloseParenthesis, Preserve)

// PlayKeys.playOmnidoc := false