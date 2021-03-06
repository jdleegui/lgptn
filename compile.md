# PTN (Packet Transport Network)

## 1. setup environment (prerequisite)
- [Clean up repository]
```
rm -f -R ~/.m2/repository/
```
- [Settup maven reference]
```
cp -n ~/.m2/settings.xml{,.orig} ; \
wget -q -O - https://raw.githubusercontent.com/opendaylight/odlparent/master/settings.xml > ~/.m2/settings.xml
```
- [Download java 1.8.02u]
```
wget "http://download.oracle.com/otn-pub/java/jdk/8u121-b13/e9e7ea248e2c4826b92b3f075a80e441/jdk-8u121-linux-x64.tar.gz"
```
- [Download OpenDayLight old version (Beryllium-SR4)]
```
wget "https://nexus.opendaylight.org/content/repositories/opendaylight.release/org/opendaylight/integration/distribution-karaf/0.4.4-Beryllium-SR4/distribution-karaf-0.4.4-Beryllium-SR4.zip"
```
## 2. Download SDK
- [SVN] : http://223.171.37.1:57080/svn/tsdn/tsdn.pluginsdk
```
tsdn:/tmp$svn list http://223.171.37.1:57080/svn/tsdn/tsdn.pluginsdk
tsdn_plugin_api/
tsdn_plugin_sample/
tsdn:/tmp$svn co http://223.171.37.1:57080/svn/tsdn/tsdn.pluginsdk SDK
A    SDK/tsdn_plugin_sampleA    SDK/tsdn_plugin_sample/src
...
A    SDK/tsdn_plugin_api/src/main/java/lgup/tsdn/plugin/spi/TsdnRPC.java
A    SDK/tsdn_plugin_api/src/main/java/lgup/tsdn/plugin/util/DeviceRegistry.java
Checked out revision 1059.
Checked out revision 1059.
tsdn:/tmp$cd SDK
tsdn:/tmp/SDK$tree
.
├── tsdn_plugin_api
│   ├── device_registry.txt
│   ├── pom.xml
│   └── src
│       ├── main
│       │   └── java
│       │       └── lgup
│       │           └── tsdn
│       │               └── plugin
│       │                   ├── api
│       │                   │   ├── PluginID.java
│       │                   │   ├── PluginManagerService.java
│       │                   │   ├── PluginToken.java
│       │                   │   ├── ProviderID.java
│       │                   │   ├── ProviderInfo.java
│       │                   │   ├── TsdnNotification.java
│       │                   │   ├── type
│       │                   │   │   ├── ActivePathStatusType.java
│       │                   │   │   ├── ActiveStatusType.java
│       │                   │   │   ├── DefaultDateType.java
│       │                   │   │   ├── DirectionType.java
│       │                   │   │   ├── EquipType.java
│       │                   │   │   ├── ErrorCodeType.java
│       │                   │   │   ├── LifeCycleType.java
│       │                   │   │   ├── MtuSize.java
│       │                   │   │   ├── NetworkType.java
│       │                   │   │   ├── NodeStatusType.java
│       │                   │   │   ├── NodeType.java
│       │                   │   │   ├── OamType.java
│       │                   │   │   ├── ObjectType.java
│       │                   │   │   ├── OnOffType.java
│       │                   │   │   ├── PathType.java
│       │                   │   │   ├── PortConstraintType.java
│       │                   │   │   ├── PortDuplexType.java
│       │                   │   │   ├── PortLoopbackStatusType.java
│       │                   │   │   ├── PortRoleType.java
│       │                   │   │   ├── PortType.java
│       │                   │   │   ├── PwId.java
│       │                   │   │   ├── PwType.java
│       │                   │   │   ├── ServiceConstraintType.java
│       │                   │   │   ├── ServiceId.java
│       │                   │   │   ├── ServiceType.java
│       │                   │   │   ├── TriggerType.java
│       │                   │   │   ├── TunnelId.java
│       │                   │   │   └── TunnelType.java
│       │                   │   └── UnKnownProviderException.java
│       │                   ├── model
│       │                   │   ├── builder
│       │                   │   │   ├── PathBuilder.java
│       │                   │   │   ├── PathInfoBuilder.java
│       │                   │   │   ├── PathParamBuilder.java
│       │                   │   │   ├── PluginIDBuilder.java
│       │                   │   │   ├── PortConstraintBuilder.java
│       │                   │   │   ├── ProviderIDBuilder.java
│       │                   │   │   ├── ProviderInfoBuilder.java
│       │                   │   │   ├── PWQosBuilder.java
│       │                   │   │   ├── TsdnDeviceBuilder.java
│       │                   │   │   ├── TsdnEquipmentBuilder.java
│       │                   │   │   ├── TsdnNodeConnectorBuilder.java
│       │                   │   │   ├── TsdnPWBuilder.java
│       │                   │   │   ├── TsdnPWDestinationBuilder.java
│       │                   │   │   ├── TsdnPWInfoBuilder.java
│       │                   │   │   ├── TsdnPWParamsBuilder.java
│       │                   │   │   ├── TsdnPWParamsDestinationBuilder.java
│       │                   │   │   ├── TsdnPWParamsSourceBuilder.java
│       │                   │   │   ├── TsdnPWSourceBuilder.java
│       │                   │   │   ├── TsdnServiceInfoBuilder.java
│       │                   │   │   ├── TsdnServiceNodeBuilder.java
│       │                   │   │   ├── TsdnTunnelBuilder.java
│       │                   │   │   ├── TsdnTunnelInfoBuilder.java
│       │                   │   │   ├── TsdnTunnelParamsBuilder.java
│       │                   │   │   └── TunnelQosBuilder.java
│       │                   │   ├── ElementElementConnectorId.java
│       │                   │   ├── ElementId.java
│       │                   │   ├── ElementName.java
│       │                   │   ├── json
│       │                   │   │   ├── TsdnDeviceImpl.java
│       │                   │   │   ├── TsdnPWParamsImpl.java
│       │                   │   │   └── TsdnTunnelParamsImpl.java
│       │                   │   ├── OAMParams.java
│       │                   │   ├── PortConstraint.java
│       │                   │   ├── PWQos.java
│       │                   │   ├── TrafficQos.java
│       │                   │   ├── Transit.java
│       │                   │   ├── TsdnDevice.java
│       │                   │   ├── TsdnEquipment.java
│       │                   │   ├── TsdnError.java
│       │                   │   ├── TsdnNodeConnector.java
│       │                   │   ├── TsdnObject.java
│       │                   │   ├── TsdnOutterTunnel.java
│       │                   │   ├── TsdnPWInfo.java
│       │                   │   ├── TsdnPW.java
│       │                   │   ├── TsdnPWParams.java
│       │                   │   ├── TsdnServiceInfo.java
│       │                   │   ├── TsdnTunnelInfo.java
│       │                   │   ├── TsdnTunnel.java
│       │                   │   ├── TsdnTunnelParams.java
│       │                   │   └── TunnelQos.java
│       │                   ├── spi
│       │                   │   ├── PluginListener.java
│       │                   │   └── TsdnRPC.java
│       │                   └── util
│       │                       ├── DeviceRegistry.java
│       │                       ├── PluginActivatorBase.java
│       │                       ├── PluginApiUtils.java
│       │                       └── TsdnRPCLifeCycle.java
│       └── test
│           └── java
│               └── lgup
│                   └── tsdn
│                       └── plugin
│                           └── test
│                               ├── device_registry.txt
│                               └── IDTest.java
└── tsdn_plugin_sample
    ├── manger4ventor
    │   ├── lgup.plugin.manager.cfg.sample
    │   ├── tsdn-plugin-manager4vendor-0.7.0.jar
    │   ├── tsdn-plugin-manager4vendor-0.7.1.jar
    │   ├── tsdn-plugin-manager4vendor-0.7.2.jar
    │   ├── tsdn-plugin-manager4vendor-0.7.3.jar
    │   ├── tsdn-plugin-manager-base-0.7.0.jar
    │   ├── tsdn-plugin-manager-base-0.7.1.jar
    │   ├── tsdn-plugin-manager-base-0.7.2.jar
    │   └── tsdn-plugin-manager-base-0.7.3.jar
    ├── pom.xml
    └── src
        └── main
            └── java
                └── lgup
                    └── tsdn
                        └── plugin
                            └── sample
                                ├── datagen
                                │   ├── CreatePWsDataGenerator.java
                                │   ├── CreateTunnelsDataGenerator.java
                                │   ├── ResponsePWDataGenerator.java
                                │   └── ResponseTunnelDataGenerator.java
                                ├── PluginActivator.java
                                └── TsdnRPCImpl.java

30 directories, 110 files
tsdn:/tmp/SDK$

```
- [Customize]
### 1. Remove old version
```
tsdn:/tmp/SDK$cd tsdn_plugin_sample/
tsdn:/tmp/SDK/tsdn_plugin_sample$tree
.
├── manger4ventor
│   ├── lgup.plugin.manager.cfg.sample
│   ├── tsdn-plugin-manager4vendor-0.7.0.jar # --> remove
│   ├── tsdn-plugin-manager4vendor-0.7.1.jar # --> remove
│   ├── tsdn-plugin-manager4vendor-0.7.2.jar # --> remove
│   ├── tsdn-plugin-manager4vendor-0.7.3.jar
│   ├── tsdn-plugin-manager-base-0.7.0.jar   # --> remove
│   ├── tsdn-plugin-manager-base-0.7.1.jar   # --> remove
│   ├── tsdn-plugin-manager-base-0.7.2.jar   # --> remove
│   └── tsdn-plugin-manager-base-0.7.3.jar
├── pom.xml
└── src
    └── main
        └── java
            └── lgup
                └── tsdn
                    └── plugin
                        └── sample
                            ├── datagen
                            │   ├── CreatePWsDataGenerator.java       ## example 
                            │   ├── CreateTunnelsDataGenerator.java   ## example 
                            │   ├── ResponsePWDataGenerator.java      ## example 
                            │   └── ResponseTunnelDataGenerator.java  ## example 
                            ├── PluginActivator.java
                            └── TsdnRPCImpl.java

9 directories, 16 files
tsdn:/tmp/SDK/tsdn_plugin_sample$
```
### 2. Check essential file.
##### 2.1. lgup.plugin.manager.cfg.sample : config file
##### 2.2. tsdn-plugin-manager4vendor-0.7.3.jar : generated stuff to interface with vendor (google API)
##### 2.3. tsdn-plugin-manager-base-0.7.3.jar   : generated stuff from YANG model        
##### 2.4. PluginActivator.java                 : default caller
##### 2.5. TsdnRPCImpl.java                     : main interface

```
tsdn:/tmp/SDK/tsdn_plugin_sample$tree
.
├── manger4ventor
│   ├── lgup.plugin.manager.cfg.sample                 # 1. config file
│   ├── tsdn-plugin-manager4vendor-0.7.3.jar           # 2. vendor interface caller jar file
│   └── tsdn-plugin-manager-base-0.7.3.jar             # 3. MD-SAL base
├── pom.xml
└── src
    └── main
        └── java
            └── lgup
                └── tsdn
                    └── plugin
                        └── sample
                            ├── PluginActivator.java   # 4. plugin activator
                            └── TsdnRPCImpl.java       # 5. main RPC caller

9 directories, 16 files
tsdn:/tmp/SDK/tsdn_plugin_sample$

```
### 3. Change sample to coweaver
- Find character 'sample'
``` 
tsdn:/tmp/SDK$find . -name '*.java' | xargs grep 'sam'
./tsdn_plugin_sample/src/main/java/lgup/tsdn/plugin/sample/datagen/ResponseTunnelDataGenerator.java:package lgup.tsdn.plugin.sample.datagen;
./tsdn_plugin_sample/src/main/java/lgup/tsdn/plugin/sample/datagen/ResponsePWDataGenerator.java:package lgup.tsdn.plugin.sample.datagen;
./tsdn_plugin_sample/src/main/java/lgup/tsdn/plugin/sample/datagen/CreateTunnelsDataGenerator.java:package lgup.tsdn.plugin.sample.datagen;
./tsdn_plugin_sample/src/main/java/lgup/tsdn/plugin/sample/datagen/CreatePWsDataGenerator.java:package lgup.tsdn.plugin.sample.datagen;
./tsdn_plugin_sample/src/main/java/lgup/tsdn/plugin/sample/TsdnRPCImpl.java:package lgup.tsdn.plugin.sample;
./tsdn_plugin_sample/src/main/java/lgup/tsdn/plugin/sample/PluginActivator.java:package lgup.tsdn.plugin.sample;
tsdn:/tmp/SDK$find . -name '*.xml' | xargs grep 'sam'
./tsdn_plugin_sample/pom.xml:   <artifactId>tsdn-plugin-sample</artifactId>
./tsdn_plugin_sample/pom.xml:   <Bundle-Name>tsdn_plugin_sample</Bundle-Name>
./tsdn_plugin_sample/pom.xml:   <Bundle-Activator>lgup.tsdn.plugin.sample.PluginActivator</Bundle-Activator>
```
- Replace them with 'coweaver'
```
tsdn:/tmp/SDK$ mv tsdn_plugin_sample/ tsdn_plugin_coweaver
tsdn:/tmp/SDK$find . -name '*.java' | xargs grep 'sample' 
./tsdn_plugin_coweaver/src/main/java/lgup/tsdn/plugin/sample/datagen/ResponseTunnelDataGenerator.java:package lgup.tsdn.plugin.sample.datagen;
./tsdn_plugin_coweaver/src/main/java/lgup/tsdn/plugin/sample/datagen/ResponsePWDataGenerator.java:package lgup.tsdn.plugin.sample.datagen;
./tsdn_plugin_coweaver/src/main/java/lgup/tsdn/plugin/sample/datagen/CreateTunnelsDataGenerator.java:package lgup.tsdn.plugin.sample.datagen;
./tsdn_plugin_coweaver/src/main/java/lgup/tsdn/plugin/sample/datagen/CreatePWsDataGenerator.java:package lgup.tsdn.plugin.sample.datagen;
./tsdn_plugin_coweaver/src/main/java/lgup/tsdn/plugin/sample/TsdnRPCImpl.java:package lgup.tsdn.plugin.sample;
./tsdn_plugin_coweaver/src/main/java/lgup/tsdn/plugin/sample/PluginActivator.java:package lgup.tsdn.plugin.sample;
tsdn:/tmp/SDK$sed -i 's/sample/coweaver/g' ./tsdn_plugin_coweaver/src/main/java/lgup/tsdn/plugin/sample/datagen/ResponseTunnelDataGenerator.java
tsdn:/tmp/SDK$sed -i 's/sample/coweaver/g' ./tsdn_plugin_coweaver/src/main/java/lgup/tsdn/plugin/sample/datagen/ResponsePWDataGenerator.java
tsdn:/tmp/SDK$sed -i 's/sample/coweaver/g' ./tsdn_plugin_coweaver/src/main/java/lgup/tsdn/plugin/sample/datagen/CreateTunnelsDataGenerator.java
tsdn:/tmp/SDK$sed -i 's/sample/coweaver/g' ./tsdn_plugin_coweaver/src/main/java/lgup/tsdn/plugin/sample/datagen/CreatePWsDataGenerator.java
tsdn:/tmp/SDK$sed -i 's/sample/coweaver/g' ./tsdn_plugin_coweaver/src/main/java/lgup/tsdn/plugin/sample/TsdnRPCImpl.java
tsdn:/tmp/SDK$sed -i 's/sample/coweaver/g' ./tsdn_plugin_coweaver/src/main/java/lgup/tsdn/plugin/sample/PluginActivator.java
tsdn:/tmp/SDK$find . -name '*.xml' | xargs grep 'sample' 
./tsdn_plugin_coweaver/pom.xml:	<artifactId>tsdn-plugin-sample</artifactId>
./tsdn_plugin_coweaver/pom.xml:						<Bundle-Name>tsdn_plugin_sample</Bundle-Name>
./tsdn_plugin_coweaver/pom.xml:						<Bundle-Activator>lgup.tsdn.plugin.sample.PluginActivator</Bundle-Activator>
tsdn:/tmp/SDK$sed -i 's/sample/coweaver/g' ./tsdn_plugin_coweaver/pom.xml
tsdn:/tmp/SDK$find . -name '*.xml' | xargs grep 'sample' 
tsdn:/tmp/SDK$find . -name '*.java' | xargs grep 'sample' 
tsdn:/tmp/SDK$mv tsdn_plugin_coweaver/src/main/java/lgup/tsdn/plugin/sample/ tsdn_plugin_coweaver/src/main/java/lgup/tsdn/plugin/coweaver
```
## 3. Compile API and customized java file.

- Compile API
```
tsdn:/tmp/SDK/tsdn_plugin_api$mvn clean install -DskipTests -Dcheckstyle.skip=true
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building tsdn-plugin-api 0.7.3
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.6.1:clean (default-clean) @ tsdn-plugin-api ---
[INFO] 
[INFO] --- maven-enforcer-plugin:1.4:enforce (enforce-maven) @ tsdn-plugin-api ---
[INFO] 
[INFO] --- jacoco-maven-plugin:0.7.2.201409121644:prepare-agent (pre-unit-test) @ tsdn-plugin-api ---
[INFO] argLine set to -javaagent:/home/jdlee/.m2/repository/org/jacoco/org.jacoco.agent/0.7.2.201409121644/org.jacoco.agent-0.7.2.201409121644-runtime.jar=destfile=/tmp/SDK/tsdn_plugin_api/target/code-coverage/jacoco.exec,excludes=**/gen/**:**/generated-sources/**:**/yang-gen/**:**/pax/**
[INFO] 
[INFO] --- maven-checkstyle-plugin:2.16:check (check-license) @ tsdn-plugin-api ---
[INFO] 
[INFO] --- maven-checkstyle-plugin:2.16:check (default) @ tsdn-plugin-api ---
[INFO] 
[INFO] --- maven-dependency-plugin:2.10:unpack (unpack-license) @ tsdn-plugin-api ---
[INFO] Configured Artifact: org.opendaylight.odlparent:odl-license:0.0.5-Beryllium-SR4:jar
[INFO] Unpacking /home/jdlee/.m2/repository/org/opendaylight/odlparent/odl-license/0.0.5-Beryllium-SR4/odl-license-0.0.5-Beryllium-SR4.jar to /tmp/SDK/tsdn_plugin_api/target/classes with includes "" and excludes "META-INF/**"
[INFO] 
[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ tsdn-plugin-api ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /tmp/SDK/tsdn_plugin_api/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ tsdn-plugin-api ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 90 source files to /tmp/SDK/tsdn_plugin_api/target/classes
[WARNING] /tmp/SDK/tsdn_plugin_api/src/main/java/lgup/tsdn/plugin/util/PluginApiUtils.java: /tmp/SDK/tsdn_plugin_api/src/main/java/lgup/tsdn/plugin/util/PluginApiUtils.java uses unchecked or unsafe operations.
[WARNING] /tmp/SDK/tsdn_plugin_api/src/main/java/lgup/tsdn/plugin/util/PluginApiUtils.java: Recompile with -Xlint:unchecked for details.
[INFO] 
[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ tsdn-plugin-api ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /tmp/SDK/tsdn_plugin_api/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ tsdn-plugin-api ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /tmp/SDK/tsdn_plugin_api/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ tsdn-plugin-api ---
[INFO] Tests are skipped.
[INFO] 
[INFO] --- maven-bundle-plugin:3.0.0:bundle (default-bundle) @ tsdn-plugin-api ---
[INFO] 
[INFO] --- maven-javadoc-plugin:2.10.3:jar (attach-javadocs) @ tsdn-plugin-api ---
[INFO] 
2 warnings
[WARNING] Javadoc Warnings
[WARNING] /tmp/SDK/tsdn_plugin_api/src/main/java/lgup/tsdn/plugin/model/ElementElementConnectorId.java:30: warning - @return tag has no arguments.
[WARNING] /tmp/SDK/tsdn_plugin_api/src/main/java/lgup/tsdn/plugin/model/ElementElementConnectorId.java:37: warning - @return tag has no arguments.
[INFO] Building jar: /tmp/SDK/tsdn_plugin_api/target/tsdn-plugin-api-0.7.3-javadoc.jar
[INFO] 
[INFO] --- maven-source-plugin:3.0.0:jar-no-fork (attach-sources) @ tsdn-plugin-api ---
[INFO] Building jar: /tmp/SDK/tsdn_plugin_api/target/tsdn-plugin-api-0.7.3-sources.jar
[INFO] 
[INFO] --- jacoco-maven-plugin:0.7.2.201409121644:report (post-unit-test) @ tsdn-plugin-api ---
[INFO] Skipping JaCoCo execution due to missing execution data file:/tmp/SDK/tsdn_plugin_api/target/code-coverage/jacoco.exec
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ tsdn-plugin-api ---
[INFO] Installing /tmp/SDK/tsdn_plugin_api/target/tsdn-plugin-api-0.7.3.jar to /home/jdlee/.m2/repository/lgup/tsdn/plugin/tsdn-plugin-api/0.7.3/tsdn-plugin-api-0.7.3.jar
[INFO] Installing /tmp/SDK/tsdn_plugin_api/pom.xml to /home/jdlee/.m2/repository/lgup/tsdn/plugin/tsdn-plugin-api/0.7.3/tsdn-plugin-api-0.7.3.pom
[INFO] Installing /tmp/SDK/tsdn_plugin_api/target/tsdn-plugin-api-0.7.3-javadoc.jar to /home/jdlee/.m2/repository/lgup/tsdn/plugin/tsdn-plugin-api/0.7.3/tsdn-plugin-api-0.7.3-javadoc.jar
[INFO] Installing /tmp/SDK/tsdn_plugin_api/target/tsdn-plugin-api-0.7.3-sources.jar to /home/jdlee/.m2/repository/lgup/tsdn/plugin/tsdn-plugin-api/0.7.3/tsdn-plugin-api-0.7.3-sources.jar
[INFO] 
[INFO] --- maven-bundle-plugin:3.0.0:install (default-install) @ tsdn-plugin-api ---
[INFO] Installing lgup/tsdn/plugin/tsdn-plugin-api/0.7.3/tsdn-plugin-api-0.7.3.jar
[INFO] Writing OBR metadata
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 6.645 s
[INFO] Finished at: 2017-03-17T15:11:42+09:00
[INFO] Final Memory: 52M/704M
[INFO] ------------------------------------------------------------------------
tsdn:/tmp/SDK/tsdn_plugin_api$
```
- Compile customized project
```
tsdn:/tmp/SDK/tsdn_plugin_coweaver$mvn clean install -DskipTests -Dcheckstyle.skip=true
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building tsdn-plugin-coweaver 0.7.3
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.6.1:clean (default-clean) @ tsdn-plugin-coweaver ---
[INFO] 
[INFO] --- maven-enforcer-plugin:1.4:enforce (enforce-maven) @ tsdn-plugin-coweaver ---
[INFO] 
[INFO] --- jacoco-maven-plugin:0.7.2.201409121644:prepare-agent (pre-unit-test) @ tsdn-plugin-coweaver ---
[INFO] argLine set to -javaagent:/home/jdlee/.m2/repository/org/jacoco/org.jacoco.agent/0.7.2.201409121644/org.jacoco.agent-0.7.2.201409121644-runtime.jar=destfile=/tmp/SDK/tsdn_plugin_coweaver/target/code-coverage/jacoco.exec,excludes=**/gen/**:**/generated-sources/**:**/yang-gen/**:**/pax/**
[INFO] 
[INFO] --- maven-checkstyle-plugin:2.16:check (check-license) @ tsdn-plugin-coweaver ---
[INFO] 
[INFO] --- maven-checkstyle-plugin:2.16:check (default) @ tsdn-plugin-coweaver ---
[INFO] 
[INFO] --- maven-dependency-plugin:2.10:unpack (unpack-license) @ tsdn-plugin-coweaver ---
[INFO] Configured Artifact: org.opendaylight.odlparent:odl-license:0.0.5-Beryllium-SR4:jar
[INFO] Unpacking /home/jdlee/.m2/repository/org/opendaylight/odlparent/odl-license/0.0.5-Beryllium-SR4/odl-license-0.0.5-Beryllium-SR4.jar to /tmp/SDK/tsdn_plugin_coweaver/target/classes with includes "" and excludes "META-INF/**"
[INFO] 
[INFO] --- maven-resources-plugin:2.7:resources (default-resources) @ tsdn-plugin-coweaver ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /tmp/SDK/tsdn_plugin_coweaver/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ tsdn-plugin-coweaver ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 6 source files to /tmp/SDK/tsdn_plugin_coweaver/target/classes
[WARNING] /tmp/SDK/tsdn_plugin_coweaver/src/main/java/lgup/tsdn/plugin/coweaver/datagen/CreateTunnelsDataGenerator.java: Some input files use unchecked or unsafe operations.
[WARNING] /tmp/SDK/tsdn_plugin_coweaver/src/main/java/lgup/tsdn/plugin/coweaver/datagen/CreateTunnelsDataGenerator.java: Recompile with -Xlint:unchecked for details.
[INFO] 
[INFO] --- maven-resources-plugin:2.7:testResources (default-testResources) @ tsdn-plugin-coweaver ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /tmp/SDK/tsdn_plugin_coweaver/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ tsdn-plugin-coweaver ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ tsdn-plugin-coweaver ---
[INFO] Tests are skipped.
[INFO] 
[INFO] --- maven-bundle-plugin:3.0.0:bundle (default-bundle) @ tsdn-plugin-coweaver ---
[INFO] 
[INFO] --- maven-javadoc-plugin:2.10.3:jar (attach-javadocs) @ tsdn-plugin-coweaver ---
[INFO] Building jar: /tmp/SDK/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.7.3-javadoc.jar
[INFO] 
[INFO] --- maven-source-plugin:3.0.0:jar-no-fork (attach-sources) @ tsdn-plugin-coweaver ---
[INFO] Building jar: /tmp/SDK/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.7.3-sources.jar
[INFO] 
[INFO] --- jacoco-maven-plugin:0.7.2.201409121644:report (post-unit-test) @ tsdn-plugin-coweaver ---
[INFO] Skipping JaCoCo execution due to missing execution data file:/tmp/SDK/tsdn_plugin_coweaver/target/code-coverage/jacoco.exec
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ tsdn-plugin-coweaver ---
[INFO] Installing /tmp/SDK/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.7.3.jar to /home/jdlee/.m2/repository/lgup/tsdn/plugin/tsdn-plugin-coweaver/0.7.3/tsdn-plugin-coweaver-0.7.3.jar
[INFO] Installing /tmp/SDK/tsdn_plugin_coweaver/pom.xml to /home/jdlee/.m2/repository/lgup/tsdn/plugin/tsdn-plugin-coweaver/0.7.3/tsdn-plugin-coweaver-0.7.3.pom
[INFO] Installing /tmp/SDK/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.7.3-javadoc.jar to /home/jdlee/.m2/repository/lgup/tsdn/plugin/tsdn-plugin-coweaver/0.7.3/tsdn-plugin-coweaver-0.7.3-javadoc.jar
[INFO] Installing /tmp/SDK/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.7.3-sources.jar to /home/jdlee/.m2/repository/lgup/tsdn/plugin/tsdn-plugin-coweaver/0.7.3/tsdn-plugin-coweaver-0.7.3-sources.jar
[INFO] 
[INFO] --- maven-bundle-plugin:3.0.0:install (default-install) @ tsdn-plugin-coweaver ---
[INFO] Installing lgup/tsdn/plugin/tsdn-plugin-coweaver/0.7.3/tsdn-plugin-coweaver-0.7.3.jar
[INFO] Writing OBR metadata
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 5.002 s
[INFO] Finished at: 2017-03-17T15:18:47+09:00
[INFO] Final Memory: 52M/685M
[INFO] ------------------------------------------------------------------------
tsdn:/tmp/SDK/tsdn_plugin_coweaver$
```
## 4. Launch in ODL
### 4.1 RUN Opendaylight in OSGI based Apache Karaf
```
tsdn:~/workspace$rm -R distribution-karaf-0.4.4-Beryllium-SR4/
tsdn:~/workspace$unzip ~/Downloads/distribution-karaf-0.4.4-Beryllium-SR4.zip
  .....
  inflating: distribution-karaf-0.4.4-Beryllium-SR4/bin/start.bat
  inflating: distribution-karaf-0.4.4-Beryllium-SR4/bin/status.bat
  inflating: distribution-karaf-0.4.4-Beryllium-SR4/bin/stop.bat
tsdn:~/workspace$./distribution-karaf-0.4.4-Beryllium-SR4/bin/karaf
OpenJDK 64-Bit Server VM warning: ignoring option MaxPermSize=512m; support was removed in 8.0

    ________                       ________                .__  .__       .__     __
    \_____  \ ______   ____   ____ \______ \ _____  ___.__.|  | |__| ____ |  |___/  |_
     /   |   \\____ \_/ __ \ /    \ |    |  \\__  \<   |  ||  | |  |/ ___\|  |  \   __\
    /    |    \  |_> >  ___/|   |  \|    `   \/ __ \\___  ||  |_|  / /_/  >   Y  \  |
    \_______  /   __/ \___  >___|  /_______  (____  / ____||____/__\___  /|___|  /__|
            \/|__|        \/     \/        \/     \/\/            /_____/      \/


Hit '<tab>' for a list of available commands
and '[cmd] --help' for help on a specific command.
Hit '<ctrl-d>' or type 'system:shutdown' or 'logout' to shutdown OpenDaylight.

opendaylight-user@root>
```
### 4.2 OPEN log console
```
tsdn:~$ tail -F ~/workspace/distribution-karaf-0.4.4-Beryllium-SR4/data/log/karaf.log
```
### 4.3 INSTALL JDBC and FTP library (optional. JDBC will not use anymore in the future)
- [bundle:install mvn:commons-net/commons-net/3.3]
- [feature:repo-add mvn:org.ops4j.pax.jdbc/pax-jdbc-features/0.8.0/xml/features]
- [feature:install pax-jdbc-mariadb pax-jdbc-config]
- [feature:install odl-mdsal-all odl-mdsal-binding odl-restconf-all odl-of-config-all odl-dlux-all webconsole]

```
tsdn:~/workspace$./distribution-karaf-0.4.4-Beryllium-SR4/bin/karaf
OpenJDK 64-Bit Server VM warning: ignoring option MaxPermSize=512m; support was removed in 8.0
    ________                       ________                .__  .__       .__     __       
    \_____  \ ______   ____   ____ \______ \ _____  ___.__.|  | |__| ____ |  |___/  |_     
     /   |   \\____ \_/ __ \ /    \ |    |  \\__  \<   |  ||  | |  |/ ___\|  |  \   __\    
    /    |    \  |_> >  ___/|   |  \|    `   \/ __ \\___  ||  |_|  / /_/  >   Y  \  |      
    \_______  /   __/ \___  >___|  /_______  (____  / ____||____/__\___  /|___|  /__|      
            \/|__|        \/     \/        \/     \/\/            /_____/      \/          

Hit '<tab>' for a list of available commands
and '[cmd] --help' for help on a specific command.
Hit '<ctrl-d>' or type 'system:shutdown' or 'logout' to shutdown OpenDaylight.

opendaylight-user@root>bundle:install mvn:commons-net/commons-net/3.3
Bundle ID: 64
opendaylight-user@root>feature:repo-add mvn:org.ops4j.pax.jdbc/pax-jdbc-features/0.8.0/xml/features
Adding feature url mvn:org.ops4j.pax.jdbc/pax-jdbc-features/0.8.0/xml/features
opendaylight-user@root>feature:install pax-jdbc-mariadb pax-jdbc-config
opendaylight-user@root>feature:install odl-mdsal-all odl-mdsal-binding odl-restconf-all odl-of-config-all odl-dlux-all webconsole
Refreshing bundles com.google.guava (70), org.jboss.netty (165), org.eclipse.persistence.core (127), org.eclipse.persistence.moxy (128)
Refreshing bundles org.jboss.netty (165), io.netty.handler (134)
opendaylight-user@root>
```
### 4.4 Edit your configuration 
```
jdlee@LeeJD:/tmp$ cat /home/jdlee/workspace/SDK/tsdn_plugin_sample/manger4ventor/lgup.plugin.manager.cfg
plugins.rootDir=/home/jdlee/tsdn_plugins
plugin.count=1
plugin.1.id=7412
plugin.1.provider.count=1
plugin.1.provider.1.id=7412_1 # coweaver ID
plugin.1.provider.1.url=192.168.123.168 # EMS server ID (It will be used as a FTP address in the future)
plugin.1.provider.1.userName=admin
plugin.1.provider.1.password=admin
jdlee@LeeJD:/tmp$

```
### 4.5 Copy required (Keep copy order. Copy slowly in MAX OS X or in Windows. The launching order is important factor.)
```
cp tsdn_plugin_api/target/tsdn-plugin-api-0.7.3.jar ~/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp tsdn_plugin_sample/manger4ventor/tsdn-plugin-manager-base-0.7.3.jar ~/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp tsdn_plugin_sample/manger4ventor/tsdn-plugin-manager4vendor-0.7.3.jar ~/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp tsdn_plugin_sample/manger4ventor/lgup.plugin.manager.cfg ~/workspace/distribution-karaf-0.4.4-Beryllium-SR4/etc/
cp tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.7.3.jar ~/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
```
### 4.6 Checkout activation order
```
310 | Active   |  80 | 0.3.4.Beryllium-SR4                | dlux.yangvisualizer
311 | Resolved |  30 | 3.0.3                              | Apache Karaf :: Web Console :: Branding, Hosts: 312
312 | Active   |  30 | 3.0.3                              | Apache Karaf :: Web Console :: Console, Fragments: 311
313 | Active   |  30 | 3.0.3                              | Apache Karaf :: Web Console :: Instance Plugin
314 | Active   |  30 | 3.0.3                              | Apache Karaf :: Web Console :: Features Plugin
315 | Active   |  30 | 3.0.3                              | Apache Karaf :: Web Console :: Gogo Plugin
316 | Active   |  30 | 3.0.3                              | Apache Karaf :: Web Console :: HTTP Plugin
317 | Active   |  80 | 0.7.3                              | tsdn_plugin_api
318 | Active   |  80 | 0.7.3                              | tsdn_plugin_manager_base
319 | Active   |  80 | 0.7.3                              | tsdn_plugin_manager4vendor
320 | Active   |  80 | 0.7.3                              | tsdn_plugin_coweaver
opendaylight-user@root>
```
### 4.7 Check ODL web 
```
opendaylight-user@root>
jdlee@LeeJD:/tmp$  wget -O - http://localhost:8181/index.html#/login
--2017-03-17 15:52:00--  http://localhost:8181/index.html
Resolving localhost (localhost)... 127.0.0.1
Connecting to localhost (localhost)|127.0.0.1|:8181... connected.
HTTP request sent, awaiting response... 200 OK
Length: 2667 (2.6K) [text/html]
Saving to: ‘STDOUT’

-                                                            0%[                                                                                                                                       ]       0  --.-KB/s               <!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <title>OpenDaylight Dlux</title>

    <meta name="description" content="overview &amp; stats" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script type="text/javascript">
var module = ['angular','ocLazyLoad','angular-ui-router','angular-translate', 'angular-sanitize', 'angular-translate-loader-static-files', 'angular-translate-loader-partial', 'angular-css-injector'];
var deps = ['common/config/env.module','app/core/core.module','common/login/login.module','common/authentification/auth.module','common/navigation/navigation.module','common/topbar/topbar.module','common/general/common.general.module','app/topology/topology.module','app/node/nodes.module','app/yangui/main','common/yangutils/yangutils.module','common/sigmatopology/sigmatopology.module','app/yangvisualizer/yangvisualizer.module','common/layout/layout.module'];
var e = ['oc.lazyLoad', 'ui.router', 'pascalprecht.translate', 'ngSanitize', 'angular.css.injector', 'app','app.core','app.common.login','app.common.auth','app.common.nav','app.common.topbar','app.common.general','app.topology','app.nodes','app.yangui','app.common.yangUtils','app.common.sigmatopology','app.yangvisualizer','app.common.layout'];
        // global variables

    </script>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

    <!--[if lt IE 9]>
    <script src="assets/js/html5shiv.js"></script>
    <script src="assets/js/respond.min.js"></script>
    <![endif]-->

    <!-- compiled CSS -->
    <link rel="stylesheet" type="text/css" href="vendor/ng-grid/ng-grid.min.css" />
    <link rel="stylesheet" type="text/css" href="vendor/select2-bootstrap-css/select2-bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="vendor/footable/css/footable.core.min.css" />
    <link rel="stylesheet" type="text/css" href="vendor/footable/css/footable.standalone.min.css" />
    <link rel="stylesheet" type="text/css" href="vendor/vis/dist/vis.min.css" />
    <link rel="stylesheet" type="text/css" href="vendor/ng-slider/dist/css/ng-slider.min.css" />
    <link rel="stylesheet" type="text/css" href="assets/opendaylight-dlux-0.2.0.css" />
    <link rel="stylesheet" href="assets/css/sb-admin.css" />

    <script type="text/javascript" data-main="src/main.js" src="vendor/requirejs/require.js"></script>

    <link rel="stylesheet" href="assets/css/font-awesome.min.css" />
    <!-- the font-awesome is different from the 'official' one -->

    <!-- application CSS -->
  </head>

  <body class="skin-3">
  <div ui-view="mainContent"></div>
  </body>
</html>
```
