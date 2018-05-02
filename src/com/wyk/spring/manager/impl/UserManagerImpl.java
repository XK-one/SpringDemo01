package com.wyk.spring.manager.impl;

import com.wyk.spring.dao.UserDao;
import com.wyk.spring.dao.impl.UserDao4MySqlImpl;
import com.wyk.spring.manager.UserManager;

public class UserManagerImpl implements UserManager {

	private UserDao userDao;
	
	/**使用applicationContext.xml文件里的bean标签的子标签constructor-arg来注入*/
	public UserManagerImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	/**使用applicationContext.xml文件里的bean标签的子标签property来注入*/
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	@Override
	public void addUser(String username, String password) {
	     userDao.addUser(username,password); 

	}

}
