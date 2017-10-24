package com.test.springjpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.springjpa.domain.User;
import com.test.springjpa.repository.UserJpaRepository;
import com.test.springjpa.repository.UserRepository;
import com.test.springjpa.service.IUserService;


/**
 * @Description:调用Repository接口接口
 * @author:fucheng
 * @time:2017年10月24日 上午11:19:26
 */
@Service
@Transactional
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserJpaRepository userJpaRepository;
	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userJpaRepository.findAll();
	}

	public List<User> findByName(String name) {
		List<User> userList1 = userRepository.findByName1(name);
		List<User> userList2 = userRepository.findByName2(name);
		List<User> userList3 = userRepository.findByNameAndAddress(name, "3");
		System.out.println("userList1:" + userList1);
		System.out.println("userList2:" + userList2);
		System.out.println("userList3:" + userList3);
		return userRepository.findByName(name);
	}

	public void saveUser(User book) {
		User save = userJpaRepository.save(book);
		System.out.println(save.getName());
	}

	@Cacheable(value="users",key="#id")
	public User findOne(long id) {
		System.out.println("Cached Pages");
		return userJpaRepository.findOne(id);
	}

	@CacheEvict("users")
	public void delete(long id) {
		System.out.println("Clear Cache");
		userJpaRepository.delete(id);
	}
}
