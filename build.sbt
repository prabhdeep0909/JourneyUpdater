name := """journeyUpdater"""
organization := "com.nexxo"

//version := "1.0-SNAPSHOT"
version := "0.1"
scalaVersion := "2.13.1"
lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)


libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.41",
  "org.mariadb.jdbc" % "mariadb-java-client" % "2.2.1",
  // To provide an implementation of JAXB-API, which is required by Ebean.
  "javax.xml.bind" % "jaxb-api" % "2.3.1",
  "javax.activation" % "activation" % "1.1.1",
  "org.glassfish.jaxb" % "jaxb-runtime" % "2.3.2",
  "org.apache.commons" % "commons-lang3" % "3.4"
  //  "com.typesafe.akka" %% "akka-actor" % "2.6.4"
)
libraryDependencies ++= Seq(
  ehcache
)