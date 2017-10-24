package com.test.springjpa.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springjpa.domain.User;
import com.test.springjpa.service.IUserService;


/**
 * @Description:调用Service即可，
  	注意下这里的Controller使用@RestController注解来标注，
  	另外URL路径命名按照RESTful风格来命名；
 * @author:fucheng
 * @time:2017年10月24日 上午11:19:47
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/add/{id}/{name}/{address}")
	public User addUser(@PathVariable int id, @PathVariable String name, @PathVariable String address) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setAddress(address);
		userService.saveUser(user);
		return user;
	}

	@RequestMapping(value = "/delete/{id}")
	public void deleteBook(@PathVariable int id) {
		userService.delete(id);
	}

	@RequestMapping(value = "/")
	public List<User> getBooks() {
		return userService.findAll();
	}

	@RequestMapping(value = "/{id}")
	public User getUser(@PathVariable int id) {
		User user = userService.findOne(id);
		return user;
	}

	@RequestMapping(value = "/search/name/{name}")
	public List<User> getBookByName(@PathVariable String name) {
		List<User> users = userService.findByName(name);
		return users;
	}

}
