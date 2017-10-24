# spring_jpa_mysql
spring boot restful接入data jpa,使用mysql作为存储，redis作为缓存的列子

# CREATE TABLE
CREATE DATABASE test;</br>
CREATE TABLE test.v_user(</br>
	id int auto_increment primary key,</br>
	name varchar(20),</br>
	address varchar(200)</br>
);

# 1.redis install
yum install gcc</br>
cd /usr/local/</br>
wget http://download.redis.io/releases/redis-4.0.2.tar.gz</br>
tar -xvf redis-4.0.2.tar.gz</br>
mv redis-4.0.2 redis</br>
cd redis</br>
make MALLOC=libc</br>

# 2.update redis config
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

# interface
find all users</br>
http://localhost:8080/users</br>

find user by id</br>
http://localhost:8080/users/1</br>

find user by name</br>
http://localhost:8080/users/search/name/fc</br>

add user</br>
http://localhost:8080/users/add/1/fucheng/广东省深圳市沙县小吃胡同巷子花园A座666</br>

delete user</br>
http://localhost:8080/users/delete/1</br>


