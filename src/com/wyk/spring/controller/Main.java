package com.wyk.spring.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import com.wyk.spring.manager.UserManager;
import com.wyk.spring.manager.impl.UserManagerImpl;

public class Main {

	public static void main(String[] args) {
		
			/**Spring的IOC应用*/
			BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
			//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			//服务(对象)定位,由我们的应用程序负责服务(对象)定位.  
			//因为自己产生了主动的查找.所以必须依赖,并且写死.  
			UserManager userManager = (UserManager)factory.getBean("userManager");
			userManager.addUser("张三","123"); 
	}
}
