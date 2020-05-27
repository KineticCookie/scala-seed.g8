import sbt._

object Dependencies {
  lazy val log4j2Version     = "2.8.2"
  lazy val scalaTestVersion  = "3.1.1"
  lazy val catsV             = "2.1.3"
  lazy val fs2V              = "2.3.0"
  lazy val circeVersion      = "0.13.0"
  lazy val enumeratumV       = "1.6.0"
  lazy val mockitoV          = "1.14.1"

  lazy val test = List(
    "org.mockito"       %% "mockito-scala"           % mockitoV         % "test,it",
    "org.mockito"       %% "mockito-scala-scalatest" % mockitoV         % "test,it",
    "org.scalactic"     %% "scalactic"               % scalaTestVersion % "test,it",
    "org.scalatest"     %% "scalatest"               % scalaTestVersion % "test,it",
  )

  lazy val logs = List(
    "org.apache.logging.log4j" % "log4j-api"                  % log4j2Version,
    "org.apache.logging.log4j" % "log4j-core"                 % log4j2Version,
    "org.apache.logging.log4j" % "log4j-slf4j-impl"           % log4j2Version
  )

  lazy val json = List(
    "io.circe"          %% "circe-core"           % circeVersion,
    "io.circe"          %% "circe-parser"         % circeVersion,
    "io.circe"          %% "circe-generic"        % circeVersion,
    "io.circe"          %% "circe-generic-extras" % circeVersion,
  )

  lazy val config = List(
    "com.github.pureconfig" %% "pureconfig"        % "0.12.3",
  )

  lazy val effects = List(
    "org.typelevel"         %% "cats-effect"       % catsV,
    "co.fs2"                %% "fs2-core"          % fs2V,
    "co.fs2"                %% "fs2-io"            % fs2V,
  )

  lazy val all = test ++ logs ++ json ++ config ++ effects
}
