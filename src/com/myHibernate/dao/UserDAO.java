package com.myHibernate.dao;

import com.myHibernate.bean.User;

public interface UserDAO {
	//��ѯ�û�
	public User queryUser(String name,String password);
	//�����û�
	public void insertUser(User user) throws Exception;
	//�޸��û�
	public void updateUser(User user);
	//ɾ���û�
	public void deleteUser(User user);
	
}
