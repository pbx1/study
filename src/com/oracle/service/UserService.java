package com.oracle.service;

import com.oracle.entry.User;
/**
 * ��¼���ַ����Ľӿ�  �������ʹ��
 * @author oracleOAEC
 *
 */
public interface UserService {
	//ע�᷽��
	public String addUser(User user);
	//��¼����
	public String loginUser(User user);
}
