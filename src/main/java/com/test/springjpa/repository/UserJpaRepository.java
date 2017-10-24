package com.test.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.springjpa.domain.User;


/**
 * @Description:这里的UserJpaRepository接口实现了JpaRepository接口；
	实际上JpaRepository实现了PagingAndSortingRepository接口，
	PagingAndSortingRepository接口实现了CrudRepository接口，
	CrudRepository接口实现了Repository接口；
	简单说明下：
	Repository接口是一个标识接口，里面是空的；
	CrudRepository接口定义了增删改查方法；
	PagingAndSortingRepository接口用于分页和排序；
	由于JpaRepository接口继承了以上所有接口，所以拥有它们声明的所有方法；
	另外注意下，以findAll方法为例，JpaRepository接口返回的是List, PagingAndSortingRepository和CrudRepository返回的是迭代器；
 * @author:fucheng
 * @time:2017年10月24日 上午11:17:28
 */
public interface UserJpaRepository extends JpaRepository<User,Long> {

}
