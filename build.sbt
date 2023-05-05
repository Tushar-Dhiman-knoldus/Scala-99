ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "Scala-99",
    idePackagePrefix := Some("com.knoldus.scala99")
  )
libraryDependencies += "org.slf4j" % "slf4j-simple" % "2.0.5"

