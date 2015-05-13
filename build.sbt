name := """template"""

organization := "no.met.data"

version := "0.1-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

scalacOptions += "-feature"

javaOptions += "-Djunit.outdir=target/test-report"

ScoverageSbtPlugin.ScoverageKeys.coverageHighlighting := true

ScoverageSbtPlugin.ScoverageKeys.coverageMinimum := 80

ScoverageSbtPlugin.ScoverageKeys.coverageFailOnMinimum := true

ScoverageSbtPlugin.ScoverageKeys.coverageExcludedPackages := """
  <empty>;
  util.HttpStatus;views.html.swaggerUi.*;
  value.ApiResponse;
  ReverseApplication;
  ReverseAssets;
  Routes;
"""

scalacOptions += "-feature"

scalacOptions += "-language:postfixOps"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

PlayKeys.devSettings += ("application.router", "template.Routes")
