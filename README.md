Template for new metapi submodules
==================================

This is meant to be used as a starting point when creating new modules
for metapi.

You need to make the following changes to create your own project:

  * Rename and modify app/controllers/template - both contents and names
  * Rename and modify conf/template.routes
  * Edit build.sbt - remove any reference to template

## Global dependencies

Also, for publishing, make sure the file ~/.sbt/0.13/global.sbt exists,
with the following contents:

```Scala
publishTo := {
  val nexus = "http://maven.met.no/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}
```

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
