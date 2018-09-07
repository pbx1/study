package com.oracle.service;

import com.oracle.entry.User;
/**
 * 登录各种方法的接口  方便后面使用
 * @author oracleOAEC
 *
 */
public interface UserService {
	//注册方法
	public String addUser(User user);
	//登录方法
	public String loginUser(User user);
}
