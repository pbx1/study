package com.oracle.controller;

import com.oracle.entry.User;
import com.oracle.service.UserService;
import com.oracle.service.impl.UserServiceImpl;
/**
 * 控制层
 * 只作为接收数据和传递数据
 * 不作任何业务逻辑操作
 * @author oracleOAEC
 *
 */
public class UserController {
	UserService us=new UserServiceImpl();
	public static String st;
	public void register(User user){
		//进行传值操作给业务逻辑层
		st=us.addUser(user);
		System.out.println(st);
	}
	
	public void Login(User user){
		//进行传值操作给业务逻辑层
		String str=us.loginUser(user);
	}
}
