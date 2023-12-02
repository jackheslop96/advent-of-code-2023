lazy val root = project
  .in(file("."))
  .settings(
    name := "advent-of-code-2023",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := "2.13.7",

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
