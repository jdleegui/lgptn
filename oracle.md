# Install Oracle 
```
http://www.oracle.com/technetwork/database/enterprise-edition/downloads/index.html
```
## 1.Edit oracle boot script
```
sudo vim /etc/sysctl.d/60-oracle.conf

#### Oracle 11g Kernel Parameters ####
fs.suid_dumpable	= 1
fs.aio-max-nr		= 1048576
fs.file-max		= 6815744
kernel.shmall		= 2097152
kernel.shmmax		= 536870912
kernel.shmmni		= 4096

# semaphores: semmsl, semmns, semopm, semmni
kernel.sem			= 250 32000 100 128
net.ipv4.ip_local_port_range	= 9000 65500
net.core.rmem_default		= 4194304
net.core.rmem_max		= 4194304
net.core.wmem_default		= 262144
net.core.wmem_max		= 1048586
```
## 2. oracle user setup
```
sudo vim /etc/security/limits.d/oracle.conf
```
#### Oracle User Settings 4 Oracle 11g ####
```
oracle       soft  nproc  2047
oracle       hard  nproc  16384

oracle       soft  nofile 1024
oracle       hard  nofile 65536

oracle       soft  stack  10240
```
## 3. Run script
```
sudo sysctl -p /etc/sysctl.d/60-oracle.conf
```
