package com.oracle.dao;

import com.oracle.entry.User;
/**
 * ���ݷ��ʲ�ĸ���ӿ�
 * @author oracleOAEC
 *
 */
public interface UserDao {

	//ע��
	public int addUser(User user);
	//��¼
	public User loginUser(User user ); 
}
