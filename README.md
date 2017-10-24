# spring_jpa_mysql
spring boot restful接入data jpa,使用mysql作为存储，redis作为缓存的列子

#redis install
	yum install gcc
	cd /usr/local/
	wget http://download.redis.io/releases/redis-4.0.2.tar.gz
	tar -xvf redis-4.0.2.tar.gz
	mv redis-4.0.2 redis
	cd redis
	make MALLOC=libc
	
	#start
	src/redis-server
	
	#client
	src/redis-cli
	
	#test
	set foo bar
	get foo