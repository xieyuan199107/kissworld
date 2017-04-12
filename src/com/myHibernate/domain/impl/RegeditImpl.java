package com.myHibernate.domain.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myHibernate.bean.User;
import com.myHibernate.dao.UserDAO;
import com.myHibernate.dao.impl.UserDAOImpl;
import com.myHibernate.domain.Regedit;

@Transactional
@Service
public class RegeditImpl implements Regedit{
		private UserDAO userDao;
		
		public UserDAO getUserDao(){
			return userDao;
		}
		
		public void setUserDao(UserDAO userDao){
			this.userDao = userDao;
		}
		
		public void deleteUser(User user) throws Exception{
			userDao.deleteUser(user);
		}
		
		public void saveUser(User user) throws Exception{
			userDao.insertUser(user);
		}
		
		public void updateUser(User user) throws Exception{
			userDao.updateUser(user);
		}
}
