package com.test.springjpa;
/** 
* @author  作者 : 
* @date 创建时间：2017年10月24日 上午9:56:15 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


/**
 * @Description:Spring Data Jpa是Spring Data的一个子项目，
  	主要用于简化数据访问层的实现，
  	使用Spring Data Jpa可以轻松实现增删改查、分页、排序等。
 * @author:fucheng
 * @time:2017年10月24日 上午11:16:51
 */
@SpringBootApplication
@EnableCaching
public class SpringDataJpaExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaExampleApplication.class, args);
    }
}
