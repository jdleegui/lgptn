# PTN (Packet Transport Network)

## 1. setup environment (prerequisite)
- [Clean up repository]
```
rm -f -R ~/.m2/repository/
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
