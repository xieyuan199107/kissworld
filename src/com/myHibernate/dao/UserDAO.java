package com.myHibernate.dao;

import com.myHibernate.bean.User;

public interface UserDAO {
	//查询用户
	public User queryUser(String name,String password);
	//新增用户
	public void insertUser(User user) throws Exception;
	//修改用户
	public void updateUser(User user);
	//删除用户
	public void deleteUser(User user);
	
}
