package com.oracle.controller;

import com.oracle.entry.User;
import com.oracle.service.UserService;
import com.oracle.service.impl.UserServiceImpl;
/**
 * ���Ʋ�
 * ֻ��Ϊ�������ݺʹ�������
 * �����κ�ҵ���߼�����
 * @author oracleOAEC
 *
 */
public class UserController {
	UserService us=new UserServiceImpl();
	public static String st;
	public void register(User user){
		//���д�ֵ������ҵ���߼���
		st=us.addUser(user);
		System.out.println(st);
	}
	
	public void Login(User user){
		//���д�ֵ������ҵ���߼���
		String str=us.loginUser(user);
	}
}
