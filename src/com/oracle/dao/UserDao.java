package com.oracle.dao;

import com.oracle.entry.User;
/**
 * 数据访问层的父类接口
 * @author oracleOAEC
 *
 */
public interface UserDao {

	//注册
	public int addUser(User user);
	//登录
	public User loginUser(User user ); 
}
