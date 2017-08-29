# Edit oracle boot script
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
