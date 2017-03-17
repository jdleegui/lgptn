# PTN (Packet Transport Network)

## 0. Setup environment (prerequisite)
- [Clean up repository]
```
rm -f -R ~/.m2/repository/
```
- [Create PTN project]
```
mvn archetype:generate -DarchetypeGroupId=org.opendaylight.controller -DarchetypeArtifactId=opendaylight-startup-archetype \
-DarchetypeRepository=https://nexus.opendaylight.org/content/repositories/public/ \
-DarchetypeCatalog=https://nexus.opendaylight.org/content/repositories/public/archetype-catalog.xml
```
- [Input your parameters]
```
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Archetype: opendaylight-startup-archetype:1.1.1-Beryllium-SR1
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: groupId, Value: org.opendaylight.sdn
[INFO] Parameter: artifactId, Value: ptn
[INFO] Parameter: version, Value: 1.0.0-SNAPSHOT
[INFO] Parameter: package, Value: org.opendaylight.sdn.ptn
[INFO] Parameter: packageInPathFormat, Value: org/opendaylight/sdn/ptn
[INFO] Parameter: classPrefix, Value: Ptn
[INFO] Parameter: package, Value: org.opendaylight.sdn.ptn
[INFO] Parameter: version, Value: 1.0.0-SNAPSHOT
[INFO] Parameter: copyright, Value: LGUplus, Inc.
[INFO] Parameter: groupId, Value: org.opendaylight.sdn
[INFO] Parameter: artifactId, Value: ptn
[INFO] Parameter: copyrightYear, Value: 2015
```
- [GITHUB] : Upload to github if you want.
```
echo "# lgptn" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/jdleegui/lgptn.git
git push -u origin master
```
## 1. Create project.
- [APP CREATING GUIDE] ( https://github.com/opendaylight/docs/blob/master/manuals/developer-guide/src/main/asciidoc/developing-app.adoc )
- [YANG GUIDE] ( https://wiki.onosproject.org/display/ONOS/YANG+utils#YANGutils-Namespace )
``` 
mvn archetype:generate -DarchetypeGroupId=org.opendaylight.controller -DarchetypeArtifactId=opendaylight-startup-archetype \
-DarchetypeRepository=https://nexus.opendaylight.org/content/repositories/public/ \
-DarchetypeCatalog=https://nexus.opendaylight.org/content/repositories/public/archetype-catalog.xml
```

## 2. Something changed slightly but huge, big effect when you compile your old project :(=

- Library changed everyday 
