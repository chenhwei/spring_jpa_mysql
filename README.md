## spring_jpa_mysql
spring boot restful接入data jpa,使用mysql作为存储，redis作为缓存的列子

# 1.redis install
yum install gcc</br>
cd /usr/local/</br>
wget http://download.redis.io/releases/redis-4.0.2.tar.gz</br>
tar -xvf redis-4.0.2.tar.gz</br>
mv redis-4.0.2 redis</br>
cd redis</br>
make MALLOC=libc</br>

# 2.update config
vim /usr/local/redis/redis.conf</br>
daemonize yes</br>
bind 0.0.0.0</br>
protected-mode no</br>

# 3.start redis server
src/redis-server ./redis.conf</br>

# 4.start redis client
src/redis-cli</br>
	
# 5.test redis
127.0.0.1:6379> set foo bar</br>
127.0.0.1:6379> get foo</br>
127.0.0.1:6379> KEYS *</br>

