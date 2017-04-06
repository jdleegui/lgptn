#debug
```
jdlee@LeeJD:~$ vim debug.txt 
jdlee@LeeJD:~$ cat debug.txt 

lgup:discovery 7412_1 devices

lgup:request-info 7412_1 device 1.1.70.111
lgup:request-info 7412_1 device 1.1.70.112
lgup:request-info 7412_1 device 1.1.70.113
lgup:request-info 7412_1 device 1.1.70.114
lgup:request-info 7412_1 device 1.1.70.121
lgup:request-info 7412_1 device 1.1.70.122
lgup:request-info 7412_1 device 1.1.70.123
lgup:request-info 7412_1 device 1.1.70.124
lgup:request-info 7412_1 device 1.1.70.125
lgup:request-info 7412_1 device 1.1.70.126
lgup:request-info 7412_1 device 1.1.70.132
lgup:request-info 7412_1 device 1.1.70.133
lgup:request-info 7412_1 device 1.1.70.134
lgup:request-info 7412_1 device 1.1.70.135
lgup:request-info 7412_1 device 1.1.70.136
lgup:request-info 7412_1 device 1.1.70.137
lgup:request-info 7412_1 device 1.1.70.138
lgup:request-info 7412_1 device 1.1.70.151
lgup:request-info 7412_1 device 1.1.70.152
lgup:request-info 7412_1 device 1.1.70.153
lgup:request-info 7412_1 device 1.1.70.171

lgup:request-info 7412_1 device 5.1.1.1
lgup:request-info 7412_1 device 5.2.1.1
lgup:request-info 7412_1 device 5.3.1.1
lgup:request-info 7412_1 device 1.1.65.121
lgup:request-info 7412_1 device 1.1.65.111
lgup:request-info 7412_1 device 1.1.65.112
lgup:request-info 7412_1 device 1.1.65.113
lgup:request-info 7412_1 device 1.1.65.114
lgup:request-info 7412_1 device 1.1.65.114
lgup:request-info 7412_1 device 1.1.65.115
lgup:request-info 7412_1 device 1.1.65.122
lgup:request-info 7412_1 device 1.1.65.123
lgup:request-info 7412_1 device 1.1.65.124
lgup:request-info 7412_1 device 1.1.65.131
lgup:request-info 7412_1 device 1.1.65.132
lgup:request-info 7412_1 device 1.1.65.118
lgup:request-info 7412_1 device 1.1.65.119

lgup:discovery 7412_1 tunnels

lgup:discovery 7412_1 pws

lgup:request-info 7412_1 pw 1.tp_95JJJJHFR1_94GGGGMA01_7871
lgup:request-info 7412_1 pw 5012.tp_95PPPPCWV1_95PPPPCWV2_3079
lgup:request-info 7412_1 pw 3011.tp_95HHHHCWV3_94GGGGMA01_0010
lgup:request-info 7412_1 pw 1023.tp_95HHHHCWV3_94GGGGMA01_0010

lgup:request-info 7412_1 service 3011.3011.tp_95HHHHCWV3_94GGGGMA01_0010
lgup:request-info 7412_1 service 2011.1023.tp_92OOOOBA01_95PPPPCWV2_0020

lgup:request-info 7412_1 pw 5041.tp_95QQQQCWV2_92NNNNBA01_0031
lgup:request-info 7412_1 tunnel tp_95QQQQCWV2_94NNNNMA01_0030
lgup:request-info 7412_1 tunnel tp_92DDDDBA01_92KKKKBA01_0020 

lgup:request-info 7412_1 tunnel 1.1.70.152_tp_95QQQQCWV2_94NNNNMA01_0030
lgup:request-info 7412_1 pw 5041.tp_95QQQQCWV2_92NNNNBA01_0031
lgup:request-info 7412_1 service 5011.5041.tp_92KKKKBA01_95LLLLCWV01_0019

lgup:create 7412_1 tunnels /home/jdlee/tsdn_plugins/PluginID\[id\=7412\]/tunnel.json
lgup:create 7412_2 tunnels /tmp/tunnel_txt.json
lgup:create --pwn ghjhg  7412_1 pws /tmp/dbg_pw_local.json

lgup:request-info 7412_1 tunnel tp_95HHHHCWV3_95HHHHCWV1_0005
lgup:delete --help
lgup:delete 7412_1 tunnels tp_95HHHHCWV3_95HHHHCWV1_0005
lgup:delete 7412_1 pws 1111
lgup:delete 7412_1 pws 1111.tp_95HHHHCWV3_95GGGGMA01_0010

lgup:request-info 7412_1 pw 5041.tp_95QQQQCWV2_92NNNNBA01_0031
lgup:request-info 7412_1 pw 5061.tp_95QQQQCWV2_92NNNNBA01_0031
lgup:request-info 7412_1 pw 3011.tp_95HHHHCWV3_94GGGGMA01_0010
lgup:request-info 7412_1 pw 1023.tp_95HHHHCWV3_94GGGGMA01_0010

lgup:request-info 7412_1 service 5041.5041.tp_95QQQQCWV2_92NNNNBA01_0031
lgup:request-info 7412_1 service 5041.5061.tp_95QQQQCWV2_92NNNNBA01_0031
lgup:request-info 7412_1 service 3011.3011.tp_95HHHHCWV3_94GGGGMA01_0010
lgup:request-info 7412_1 service 1023.1023.tp_95HHHHCWV3_94GGGGMA01_0010

lgup:request-info 7412_1 service 17514
lgup:request-info 7412_1 service 17502
lgup:request-info 7412_1 service 17501
lgup:request-info 7412_1 service 17505
lgup:request-info 7412_1 service 17600
lgup:request-info 7412_1 service 16400
lgup:request-info 7412_1 service 17504
lgup:request-info 7412_1 service 17503
lgup:request-info 7412_1 service 17515
lgup:request-info 7412_1 service 16399
lgup:request-info 7412_1 service 16415
lgup:request-info 7412_1 service 16403
lgup:request-info 7412_1 service 16405
lgup:request-info 7412_1 service 16407
lgup:request-info 7412_1 service 16409
lgup:request-info 7412_1 service 16411
lgup:request-info 7412_1 service 16401
lgup:request-info 7412_1 service 16413
lgup:request-info 7412_1 service 16403
lgup:request-info 7412_1 service 16415
lgup:request-info 7412_1 service 16417
lgup:request-info 7412_1 service 16405
lgup:request-info 7412_1 service 16407
lgup:request-info 7412_1 service 16409
lgup:request-info 7412_1 service 16411
lgup:request-info 7412_1 service 16413
lgup:request-info 7412_1 service 16401
lgup:request-info 7412_1 service 16399
lgup:request-info 7412_1 service 16415
lgup:request-info 7412_1 service 16417
lgup:request-info 7412_1 service 16403
lgup:request-info 7412_1 service 16405
lgup:request-info 7412_1 service 16407
lgup:request-info 7412_1 service 16409
lgup:request-info 7412_1 service 16411
lgup:request-info 7412_1 service 16401

lgup:request-info 7412_1 pw 17514
lgup:request-info 7412_1 pw 17502
lgup:request-info 7412_1 pw 17501
lgup:request-info 7412_1 pw 17505
lgup:request-info 7412_1 pw 17600
lgup:request-info 7412_1 pw 16400
lgup:request-info 7412_1 pw 17504
lgup:request-info 7412_1 pw 17503
lgup:request-info 7412_1 pw 17515
lgup:request-info 7412_1 pw 16399
lgup:request-info 7412_1 pw 16415
lgup:request-info 7412_1 pw 16403
lgup:request-info 7412_1 pw 16405
lgup:request-info 7412_1 pw 16407
lgup:request-info 7412_1 pw 16409
lgup:request-info 7412_1 pw 16411
lgup:request-info 7412_1 pw 16401
lgup:request-info 7412_1 pw 16413
lgup:request-info 7412_1 pw 16403
lgup:request-info 7412_1 pw 16415
lgup:request-info 7412_1 pw 16417
lgup:request-info 7412_1 pw 16405
lgup:request-info 7412_1 pw 16407
lgup:request-info 7412_1 pw 16409
lgup:request-info 7412_1 pw 16411
lgup:request-info 7412_1 pw 16413
lgup:request-info 7412_1 pw 16401
lgup:request-info 7412_1 pw 16399
lgup:request-info 7412_1 pw 16415
lgup:request-info 7412_1 pw 16417
lgup:request-info 7412_1 pw 16403
lgup:request-info 7412_1 pw 16405
lgup:request-info 7412_1 pw 16407
lgup:request-info 7412_1 pw 16409
lgup:request-info 7412_1 pw 16411
lgup:request-info 7412_1 pw 16401

lgup:request-info 7412_1 tunnel tp_ME114_ME116_E1_TEST
lgup:request-info 7412_1 tunnel tp_AG122_ME116_0003_TEST
lgup:request-info 7412_1 tunnel tp_ME116_AG122_0016
lgup:request-info 7412_1 tunnel tp_AR141_AC131_0008
lgup:request-info 7412_1 tunnel tp_AC131_AG121_0009
lgup:request-info 7412_1 tunnel tp_ME115_AC132_0004_outer
lgup:request-info 7412_1 tunnel tp_AC132_AR142_0010
lgup:request-info 7412_1 tunnel tp_AG121_AC132_0006_inner
lgup:request-info 7412_1 tunnel tp_AG123_AC133_0013
lgup:request-info 7412_1 tunnel tp_AC133_AR143_0014
lgup:request-info 7412_1 tunnel tp_ME115_AG122_TEST_99
lgup:request-info 7412_1 tunnel tp_ME113_ME115_0003_outer
lgup:request-info 7412_1 tunnel tp_ME115_AC132_0004_outer
lgup:request-info 7412_1 tunnel tp_ME115_AG122_0005_outer
lgup:request-info 7412_1 tunnel tp_ME112_ME115_STM
lgup:request-info 7412_1 tunnel tp_AR141_AC131_0008
lgup:request-info 7412_1 tunnel tp_AC132_AR142_0010
lgup:request-info 7412_1 tunnel tp_AR142_CU151_0011
lgup:request-info 7412_1 tunnel tp_AC133_AR143_0014
lgup:request-info 7412_1 tunnel tp_AR143_CU152_0015
lgup:request-info 7412_1 tunnel tp_ME113_ME114_100_Test
lgup:request-info 7412_1 tunnel tp_ME114_ME116_E1_TEST
lgup:request-info 7412_1 tunnel tp_ME112_ME114_LAG_TEST
lgup:request-info 7412_1 tunnel tp_ME113_ME111_LLCF_TEST
lgup:request-info 7412_1 tunnel tp_AR142_CU151_0011
lgup:request-info 7412_1 tunnel tp_AR143_CU152_0015
lgup:request-info 7412_1 tunnel tp_ME113_ME114_100_Test
lgup:request-info 7412_1 tunnel tp_ME111_ME113_0002_outer
lgup:request-info 7412_1 tunnel tp_ME113_ME115_0003_outer
lgup:request-info 7412_1 tunnel tp_ME111_ME113_LAG_TEST
lgup:request-info 7412_1 tunnel tp_ME111_ME113_STM
lgup:request-info 7412_1 tunnel tp_ME113_ME111_LLCF_TEST
lgup:request-info 7412_1 tunnel tp_ME112_ME114_LAG_TEST
lgup:request-info 7412_1 tunnel tp_ME111_ME112_4K_TEST
lgup:request-info 7412_1 tunnel tp_ME112_ME115_STM
lgup:request-info 7412_1 tunnel tp_ME111_ME112_LLCF-TEST
lgup:request-info 7412_1 tunnel tp_AG121_ME111_0001_outer
lgup:request-info 7412_1 tunnel tp_ME111_ME113_0002_outer
lgup:request-info 7412_1 tunnel tp_ME111_ME113_LAG_TEST
lgup:request-info 7412_1 tunnel tp_ME111_ME112_4K_TEST
lgup:request-info 7412_1 tunnel tp_ME111_ME113_STM
lgup:request-info 7412_1 tunnel tp_ME111_ME112_LLCF-TEST




lgup:discovery 7412_1 devices

lgup:request-info 7412_1 device 5.1.1.1
lgup:request-info 7412_1 device 5.2.1.1
lgup:request-info 7412_1 device 5.3.1.1
lgup:request-info 7412_1 device 1.1.65.131
lgup:request-info 7412_1 device 1.1.65.132
lgup:request-info 7412_1 device 1.1.65.133
lgup:request-info 7412_1 device 1.1.65.115 
lgup:request-info 7412_1 device 1.1.65.141
lgup:request-info 7412_1 device 1.1.65.142
lgup:request-info 7412_1 device 1.1.65.143
lgup:request-info 7412_1 device 1.1.65.113
lgup:request-info 7412_1 device 1.1.65.114
lgup:request-info 7412_1 device 1.1.65.151
lgup:request-info 7412_1 device 1.1.65.152
lgup:request-info 7412_1 device 1.1.65.113
lgup:request-info 7412_1 device 1.1.65.116

lgup:discovery 7412_1 tunnels
lgup:discovery 7412_1 pws
lgup:change-port 7412_1 descr "1.1.65.141" "MAIN-P1" "JeongHyunWook's new world in coweaver." 
lgup:change-port 7412_1 type "1.1.65.141" "MAIN-P2" "Ge"
lgup:change-port 7412_1 type "1.1.65.141" "MAIN-P2" "100m" 
lgup:change-port 7412_1 role "1.1.65.141" "MAIN-P4" "Uni"
lgup:change-port 7412_1 role "1.1.65.141" "MAIN-P4" "None"
lgup:change-port 7412_1 role "1.1.65.141" "MAIN-P4" "Enni"
lgup:change-port 7412_1 duplex "1.1.65.151" "MAIN-P4" "Half"
lgup:change-port 7412_1 negotiation "1.1.65.141" "MAIN-P4" "On"
lgup:change-port 7412_1 mtu-size "1.1.65.141" "MAIN-P4" "Enable"
lgup:change-port 7412_1 active-config "1.1.65.141" "MAIN-P4" "Deactive"
lgup:change-port 7412_1 port-config "1.1.65.141" "MAIN-P4" "On"
lgup:send2plugin 7412 "check pw"
lgup:send2plugin 7412 "pwalm.16407"
lgup:send2plugin 7412 "tnlalm.16407"

cp /Users/jdleegui/Documents/workspace/CSU/SDK_0_8_0/tsdn_plugin_coweaver/target/tsdn-plugin-coweaver-0.8.0.jar /Users/jdleegui/Documents/JAR/tsdn-plugin-coweaver-0.8.0.170404_01_test_alarm_using_sendmessage.jar

r2591 | jdlee | 2017-04-06 11:33:34 +0900 (Thu, 06 Apr 2017) | 38 lines

tsdn-plugin-coweaver-0.8.0.170406_01_report_none_port_when_devce_discovery.jar
1. Supporting change port description.
 : lgup:change-port 7412_1 descr "1.1.65.141" "MAIN-P1" "JeongHyunWook's new world in coweaver." 
2. Supporting change port type.  
 : lgup:change-port 7412_1 type "1.1.65.141" "MAIN-P2" "Ge"
 : lgup:change-port 7412_1 type "1.1.65.141" "MAIN-P2" "100m" 
3. Supproting change port role
 : lgup:change-port 7412_1 role "1.1.65.141" "MAIN-P4" "Uni"
 : lgup:change-port 7412_1 role "1.1.65.141" "MAIN-P4" "None"
 : lgup:change-port 7412_1 role "1.1.65.141" "MAIN-P4" "Enni"
4. Supporting change port duplex
 : lgup:change-port 7412_1 duplex "1.1.65.151" "MAIN-P4" "Half"
5. Supporting change port negotiation                                                                                                   
 : lgup:change-port 7412_1 negotiation "1.1.65.141" "MAIN-P4" "On"
6. Supporting change port mtu-size
 : lgup:change-port 7412_1 mtu-size "1.1.65.141" "MAIN-P4" "Enable"
7. Supporting change port active-config
 : lgup:change-port 7412_1 active-config "1.1.65.141" "MAIN-P4" "Deactive"
8. Supporting change port config
 : lgup:change-port 7412_1 port-config "1.1.65.141" "MAIN-P4" "On"
9. Test to check PW alarm
 : lgup:send2plugin 7412 "tnlalm.16407"
A. Test to check tunnnel alarm
 : lgup:send2plugin 7412 "tnlalm.tp_AG121_AC132_TESTT"
B: Test if message send to plugin
 : lgup:send2plugin 7412 "check pw"
C: LOG file
 :lgup:send2plugin 7412 "list device"              -> /tmp/log_coweaver_dev.txt
 :lgup:send2plugin 7412 "list tunnels"             -> /tmp/log_coweaver_dev.txt
 :lgup:send2plugin 7412 "list pws"                 -> /tmp/log_coweaver_dev.txt
 :lgup:send2plugin 7412 "list alm"                 -> /tmp/log_coweaver_dev.txt
 :lgup:send2plugin 7412 "pwalm.2019"               -> check pw alarm
 :lgup:send2plugin 7412 "tnlalm.tp_ABCD_EFGH_2019" -> check tunnel alarm
 :lgup:send2plugin 7412 "get alm"                  -> Just query current alarm

The related changes have same comment like this '// 0.8.0 JeongHyunWook (vktod25@gmail.com) example'


------------------------------------------------------------------------

```
