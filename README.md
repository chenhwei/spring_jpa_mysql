# spring_jpa_mysql
spring boot restful接入data jpa,使用mysql作为存储，redis作为缓存的列子

#redis install
#yum install gcc
#cd /usr/local/
#wget http://download.redis.io/releases/redis-4.0.2.tar.gz
#tar -xvf redis-4.0.2.tar.gz
#mv redis-4.0.2 redis
#cd redis
#make MALLOC=libc

#update config
#vim /usr/local/redis/redis.conf
#daemonize yes
#bind 0.0.0.0
#protected-mode no

#start redis
#src/redis-server ./redis.conf

#entry redis client
#src/redis-cli
	
#test redis
#127.0.0.1:6379> set foo bar
#127.0.0.1:6379> get foo
#127.0.0.1:6379> KEYS *

