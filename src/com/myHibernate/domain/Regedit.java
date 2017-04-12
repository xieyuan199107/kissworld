package com.myHibernate.domain;

import com.myHibernate.bean.User;

public interface Regedit {
	public void saveUser(User user) throws Exception;
	public void updateUser(User user) throws Exception;
	public void deleteUser(User user) throws Exception;
}
