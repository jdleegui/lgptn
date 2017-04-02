# compile
```
config:edit org.ops4j.pax.logging 
lgup:discovery 201 devices
lgup:discovery 201 tunnels
lgup:discovery 201 pws

stop 334 319 318 317
start 317 318 319 334
lgup:request-info 201 device 192.168.155.225
lgup:request-info 201 tunnel tp_aa_SBKHWJIYE2_0002
lgup:request-info 201 tunnel "tp_aa_SBKHWJIYE2_0002"
lgup:request-info 201 pw 1
gup:delete 201 pwId 1,2
lgup:delete 201 pws 1,2
lgup:delete 201 pws 1101
lgup:delete 201 pws 1101
lgup:delete 201 pws 1101

./distribution-karaf-0.4.4-Beryllium-SR4/bin/karaf 
tail -F ~/workspace/distribution-karaf-0.4.4-Beryllium-SR4/data/log/karaf.log
mvn clean install -DskipTests -Dcheckstyle.skip=true > /tmp/error.txt && cp target/tsdn-plugin-coweaver-0.7.3.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/tsdn-plugin-coweaver-0.7.3.jar && tail -F /tmp/log_coweaver.txt 
rm ~/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/tsdn-plugin-coweaver-0.7.0.jar && \
mvn clean install -DskipTests -Dcheckstyle.skip=true > /tmp/error.txt && \
cp target/tsdn-plugin-coweaver-0.7.0.jar ~/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/

cp /home/jdlee/Downloads/lgup-plugin-sdk-0.7.0/03.plugin-manager-components/tsdn-plugin-manager-base-0.7.0.xxxxxjar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp /home/jdlee/Downloads/lgup-plugin-sdk-0.7.0/03.plugin-manager-components/tsdn-plugin-manager4vendor-0.7.0.xxxxxjar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp /home/jdlee/Downloads/lgup-plugin-sdk-0.7.0/03.plugin-manager-components/lgup.plugin.manager.cfg /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/etc/

cp /home/jdlee/Downloads/lgup-plugin-sdk-0.7.1/tsdn_plugin_sample/manger4ventor/lgup.plugin.manager.cfg.sample /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/etc/lgup.plugin.manager.cfg.coweaver

cp /home/jdlee/workspace/CSU/SDK8/tsdn_plugin_api/target/tsdn-plugin-api-0.7.1.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp /home/jdlee/Downloads/lgup-plugin-sdk-0.7.1/tsdn_plugin_sample/manger4ventor/tsdn-plugin-manager-base-0.7.0.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp /home/jdlee/Downloads/lgup-plugin-sdk-0.7.1/tsdn_plugin_sample/manger4ventor/tsdn-plugin-manager4vendor-0.7.0.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp /home/jdlee/Downloads/lgup-plugin-sdk-0.7.1/tsdn_plugin_sample/manger4ventor/lgup.plugin.manager.cfg.sample /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/etc/lgup.plugin.manager.cfg 
cp /home/jdlee/workspace/CSU/SDK8/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.7.1.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/ 
scp /home/jdlee/workspace/CSU/SDK8/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.7.1.jar lguplus@tsdn:/home/lguplus/Applications/distribution-karaf-0.4.4-Beryllium-SR4/deploy/ 
scp /home/jdlee/workspace/CSU/SDK8/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.7.1.jar lguplus:tsdntest8080@tsdn:/home/lguplus/Applications/distribution-karaf-0.4.4-Beryllium-SR4/deploy/

cp /home/jdlee/workspace/CSU/SDK8/tsdn_plugin_api/target/tsdn-plugin-api-0.7.1.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp /home/jdlee/workspace/SDK.SVN/tsdn.pluginsdk/tsdn_plugin_sample/manger4ventor/tsdn-plugin-manager-base-0.7.0.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp /home/jdlee/workspace/SDK.SVN/tsdn.pluginsdk/tsdn_plugin_sample/manger4ventor/tsdn-plugin-manager4vendor-0.7.0.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp /home/jdlee/workspace/SDK.SVN/tsdn.pluginsdk/tsdn_plugin_sample/manger4ventor/lgup.plugin.manager.cfg /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/etc/
cp /home/jdlee/workspace/CSU/SDK8/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.7.1.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/

scp /home/jdlee/workspace/CSU/SDK8/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.7.1.jar lguplus@tsdn:/home/lguplus/tsdn_plugin_ptn_coweaver/

cp /home/jdlee/workspace/CSU/SDK8/tsdn_plugin_api/target/tsdn-plugin-api-0.7.1.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp /home/jdlee/workspace/SDK.SVN/tsdn.pluginsdk/tsdn_plugin_sample/manger4ventor/tsdn-plugin-manager-base-0.7.1.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp /home/jdlee/workspace/SDK.SVN/tsdn.pluginsdk/tsdn_plugin_sample/manger4ventor/tsdn-plugin-manager4vendor-0.7.1.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp /home/jdlee/workspace/SDK.SVN/tsdn.pluginsdk/tsdn_plugin_sample/manger4ventor/lgup.plugin.manager.cfg /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/etc/
cp /home/jdlee/workspace/CSU/SDK8/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.7.1.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/

ssh tsdn -l lguplus
tsdntest8080

bundle:install mvn:commons-net/commons-net/3.3
feature:repo-add mvn:org.ops4j.pax.jdbc/pax-jdbc-features/0.8.0/xml/features
feature:install pax-jdbc-mariadb pax-jdbc-config
feature:install odl-mdsal-all odl-mdsal-binding odl-restconf-all odl-of-config-all odl-dlux-all webconsole

cp /home/jdlee/workspace/CSU/SDK_0_7_3/tsdn_plugin_api/target/tsdn-plugin-api-0.7.3.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp /home/jdlee/workspace/SDK/tsdn_plugin_sample/manger4ventor/tsdn-plugin-manager-base-0.7.3.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp /home/jdlee/workspace/SDK/tsdn_plugin_sample/manger4ventor/tsdn-plugin-manager4vendor-0.7.3.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp /home/jdlee/workspace/SDK/tsdn_plugin_sample/manger4ventor/lgup.plugin.manager.cfg /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/etc/
cp /home/jdlee/workspace/CSU/SDK_0_7_3/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.7.3.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/

scp /home/jdlee/workspace/CSU/SDK_0_7_3/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.7.3.jar lguplus@tsdn:/home/lguplus/Applications/distribution-karaf-0.4.4-Beryllium-SR4/deploy/ 

cp /home/jdlee/workspace/CSU/SDK_0_8_0/tsdn_plugin_api/target/tsdn-plugin-api-0.8.0.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp /home/jdlee/workspace/SDK/tsdn_plugin_sample/manger4ventor/tsdn-plugin-manager-base-0.8.0.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp /home/jdlee/workspace/SDK/tsdn_plugin_sample/manger4ventor/tsdn-plugin-manager4vendor-0.8.0.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
cp /home/jdlee/workspace/SDK/tsdn_plugin_sample/manger4ventor/lgup.plugin.manager.cfg /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/etc/
cp /home/jdlee/workspace/CSU/SDK_0_8_0/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.8.0.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4/deploy/

scp /home/jdlee/workspace/CSU/SDK_0_8_0/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.8.0.jar lguplus@tsdn:/home/lguplus/Applications/distribution-karaf-0.4.4-Beryllium-SR4/deploy/

rm -R distribution-karaf-0.4.4-Beryllium-SR4.0.7.3/
unzip ~/Downloads/distribution-karaf-0.4.4-Beryllium-SR4.zip 
mv distribution-karaf-0.4.4-Beryllium-SR4 distribution-karaf-0.4.4-Beryllium-SR4.0.7.3
./distribution-karaf-0.4.4-Beryllium-SR4.0.7.3/bin/karaf 
cp /home/jdlee/workspace/CSU/SDK_0_7_3/tsdn_plugin_api/target/tsdn-plugin-api-0.7.3.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4.0.7.3/deploy/
cp /home/jdlee/workspace/SDK/tsdn_plugin_sample/manger4ventor/tsdn-plugin-manager-base-0.7.3.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4.0.7.3/deploy/
cp /home/jdlee/workspace/SDK/tsdn_plugin_sample/manger4ventor/tsdn-plugin-manager4vendor-0.7.3.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4.0.7.3/deploy/
cp /home/jdlee/workspace/SDK/tsdn_plugin_sample/manger4ventor/lgup.plugin.manager.cfg /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4.0.7.3/etc/
cp /home/jdlee/workspace/CSU/SDK_0_7_3/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.7.3.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4.0.7.3/deploy/

mvn clean install -DskipTests -Dcheckstyle.skip=true > /tmp/error.txt && cp target/tsdn-plugin-coweaver-0.7.3.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4.0.7.3/deploy/tsdn-plugin-coweaver-0.7.3.jar && tail -F /tmp/log_coweaver.txt 
tail -F ~/workspace/distribution-karaf-0.4.4-Beryllium-SR4.0.7.3/data/log/karaf.log 

cp /home/jdlee/workspace/CSU/SDK_0_7_3/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.7.3.jar /home/jdlee/Documents/JAR/tsdn-plugin-coweaver-0.7.3.170329_01_add_more_try_catch_handler_when_report_tunnels.jar
scp /home/jdlee/workspace/CSU/SDK_0_7_3/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.7.3.jar lguplus@tsdn:/home/lguplus/Applications/distribution-karaf-0.4.4-Beryllium-SR4/deploy/ 

rm -R distribution-karaf-0.4.4-Beryllium-SR4.0.8.0/
unzip ~/Downloads/distribution-karaf-0.4.4-Beryllium-SR4.zip 
mv distribution-karaf-0.4.4-Beryllium-SR4 distribution-karaf-0.4.4-Beryllium-SR4.0.8.0
./distribution-karaf-0.4.4-Beryllium-SR4.0.8.0/bin/karaf 
cp /home/jdlee/workspace/CSU/SDK_0_8_0/tsdn_plugin_api/target/tsdn-plugin-api-0.8.0.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4.0.8.0/deploy/
cp /home/jdlee/workspace/SDK/tsdn_plugin_sample/manger4ventor/tsdn-plugin-manager-base-0.8.0.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4.0.8.0/deploy/
cp /home/jdlee/workspace/SDK/tsdn_plugin_sample/manger4ventor/tsdn-plugin-manager4vendor-0.8.0.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4.0.8.0/deploy/
cp /home/jdlee/workspace/SDK/tsdn_plugin_sample/manger4ventor/lgup.plugin.manager.cfg /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4.0.8.0/etc/
cp /home/jdlee/workspace/CSU/SDK_0_8_0/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.8.0.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4.0.8.0/deploy/

mvn clean install -DskipTests -Dcheckstyle.skip=true > /tmp/error.txt && cp target/tsdn-plugin-coweaver-0.8.0.jar /home/jdlee/workspace/distribution-karaf-0.4.4-Beryllium-SR4.0.8.0/deploy/tsdn-plugin-coweaver-0.8.0.jar && tail -F /tmp/log_coweaver.txt 
tail -F ~/workspace/distribution-karaf-0.4.4-Beryllium-SR4.0.8.0/data/log/karaf.log 

cp /home/jdlee/workspace/CSU/SDK_0_8_0/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.8.0.jar /home/jdlee/Documents/JAR/tsdn-plugin-coweaver-0.8.0.170330_01_remake.jar
scp /home/jdlee/workspace/CSU/SDK_0_8_0/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.8.0.jar lguplus@tsdn:/home/lguplus/Applications/distribution-karaf-0.4.4-Beryllium-SR4/deploy/
```
