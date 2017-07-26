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

## Run eclipse
```
jdlee@LeeJD:~$ cd workspace/ 
./eclipse/java-neon4/eclipse/eclipse -data /home/jdlee/workspace/CSU & ## eclipse oxygen installed but still it's neon
```
## Run Karaf
```
./workspace/distribution-karaf-0.4.4-Beryllium-SR4.0.8.0/bin/karaf 
```
## Compile API
```
cd workspace/CSU/SDK_0_8_0/tsdn_plugin_api/
mvn clean install -DskipTests -Dcheckstyle.skip=true > /tmp/error.txt
```
## Compile APP
```
cd workspace/CSU/SDK_0_8_0/tsdn_plugin_coweaver/
vn clean install -DskipTests -Dcheckstyle.skip=true > /tmp/error.txt && \
cp target/tsdn-plugin-coweaver-0.8.0.jar ~/workspace/distribution-karaf-0.4.4-Beryllium-SR4.0.8.0/deploy/tsdn-plugin-coweaver-0.8.0.jar && \
tail -F /tmp/log_coweaver.txt 
```
## View Karaf LOG
```
tail -F ~/workspace/distribution-karaf-0.4.4-Beryllium-SR4.0.8.0/data/log/karaf.log
```
## View compile log
```
jdlee@LeeJD:~$ tail -F /tmp/error.txt
```
