package com.oracle.service.impl;

import com.oracle.dao.impl.UserDaoImpl;
import com.oracle.entry.User;
import com.oracle.service.UserService;
/**
 * 业务逻辑层
 * 所有关于业务逻辑的操作，都在这一层完成，完成之后，调用数据持久层
 * @author oracleOAEC
 *
 */
public class UserServiceImpl implements UserService{

	UserDaoImpl us=new UserDaoImpl();
	//注册
	public String addUser(User user) {
		//根据传进来的值调用方法进行判断
		int row=us.addUser(user);
		if(row>0){
			return "注册成功";
		}else{
			return "注册失败";
		}
	}

	//登录
	public String loginUser(User user) {
		//1.查找用户,如果存在,则登录成功,否则登录失败
		//根据传进来的值调用方法进行判断
		User user1=us.loginUser(user);
		if(user1!=null){
			return "登录成功";
		}else{
			return "登录失败，密码错误";
		}
	}

}
