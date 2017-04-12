package com.myHibernate.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.myHibernate.bean.User;
import com.myHibernate.dao.UserDAO;

@Repository
public class UserDAOImpl implements UserDAO{
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public void deleteUser(User user){
		this.getSession().delete(user);
	}
	
	public void insertUser(User user) throws Exception{
		try{
			this.getSession().save(user);
			System.out.println("添加记录成功");
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			throw new Exception("插入失败");
		}
	}
	
	public User queryUser(String username,String password){
		Query query = getSession().createQuery("from User");
		List list = query.list();
		Iterator iter = list.iterator();
		User user = null;
		User user1 = null;
		while(iter.hasNext()){
			user = (User)iter.next();
			if((username).equals((user.getUsername()).trim()) && (password).equals(user.getPassword())){
				user1 = user;
			}
		}
		if(user1 != null){
			System.out.println("该用户存在");
			return user1;
			
		}else{
			System.out.println("该用户不存在");
			return null;
			
		}
		
/*		
	List<User>  users = getSession().createQuery("from User u where u.username=? and u.password=?")
				.setParameter(0, name)
				.setParameter(1, password)
				.list();
		if(users.size() != 0){
			return users.get(0);
		}
		return null;
*/
	}
	
	public void updateUser(User user){
		getSession().update(user);
	}
}
