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
```
