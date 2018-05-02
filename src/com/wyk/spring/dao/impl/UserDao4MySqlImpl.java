package com.wyk.spring.dao.impl;

import com.wyk.spring.dao.UserDao;

public class UserDao4MySqlImpl implements UserDao {

	@Override
	public void addUser(String username, String password) {
		 System.out.println("UserDao4MySqlImpl.addUser() : " + username + ",pwd = " + password);  

	}

}
