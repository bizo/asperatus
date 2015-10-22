import SonatypeKeys._

sonatypeSettings

name := "asperatus"

organization := "com.bizo"

version := "2.2"

description := "library for batching/aggregating stats to Cloudwatch"

publishMavenStyle := true

crossPaths := false

autoScalaLibrary := false

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-cloudwatch" % "1.9.0",
  "commons-lang" % "commons-lang" % "2.6",
  "com.google.guava" % "guava" % "17.0",
  "junit" % "junit" % "4.11" % "test",
  "org.mockito" % "mockito-all" % "1.8.2" % "test",
  "com.novocode" % "junit-interface" % "0.10-M4" % "test"
)

EclipseKeys.withSource := true

pomExtra := {
<url>https://github.com/bizo/asperatus</url>
<licenses>
  <license>
    <name>The Apache Software License, Version 2.0</name>
    <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
    <distribution>repo</distribution>
  </license>
</licenses>
<scm>
  <url>https://github.com/bizo/asperatus</url>
  <connection>https://github.com/bizo/asperatus.git</connection>
</scm>
<developers>
  <developer>
    <id>larry</id>
    <name>Larry Ogrodnek</name>
    <email>larry@bizo.com</email>
  </developer>
  <developer>
    <id>stephen</id>
    <name>Stephen Haberman</name>
    <email>stephen@bizo.com</email>
  </developer>
</developers>
}