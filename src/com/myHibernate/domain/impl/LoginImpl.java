package com.myHibernate.domain.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myHibernate.bean.User;
import com.myHibernate.dao.UserDAO;
import com.myHibernate.domain.Login;

@Transactional
@Service
public class LoginImpl implements Login{
	private UserDAO userDao;
	
	public UserDAO getUserDao(){
		return userDao;
	}
	
	public void setUserDao(UserDAO userDao){
		this.userDao = userDao;
	}
	
	public boolean login(User user){
		return userDao.queryUser(user.getUsername(), user.getPassword()) == null ? false : true;
		
	}
}
