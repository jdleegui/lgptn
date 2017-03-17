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
- [SVN:http://223.171.37.1:57080/svn/tsdn/tsdn.pluginsdk]
```
tsdn:/tmp$svn list http://223.171.37.1:57080/svn/tsdn/tsdn.pluginsdk
tsdn_plugin_api/
tsdn_plugin_sample/
tsdn:/tmp$svn co http://223.171.37.1:57080/svn/tsdn/tsdn.pluginsdk SDK
A    SDK/tsdn_plugin_sample
A    SDK/tsdn_plugin_sample/src
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
