package com.test.springjpa.service;

import java.util.List;

import com.test.springjpa.domain.User;

/** 
* @author  作者 : 
* @date 创建时间：2017年10月24日 上午9:51:38 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public interface IUserService
{
    public List<User> findAll();

    public void saveUser(User book);
   
    public User findOne(long id);

    public void delete(long id);

    public List<User> findByName(String name);

}
