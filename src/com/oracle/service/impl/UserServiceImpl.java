package com.oracle.service.impl;

import com.oracle.dao.impl.UserDaoImpl;
import com.oracle.entry.User;
import com.oracle.service.UserService;
/**
 * ҵ���߼���
 * ���й���ҵ���߼��Ĳ�����������һ����ɣ����֮�󣬵������ݳ־ò�
 * @author oracleOAEC
 *
 */
public class UserServiceImpl implements UserService{

	UserDaoImpl us=new UserDaoImpl();
	//ע��
	public String addUser(User user) {
		//���ݴ�������ֵ���÷��������ж�
		int row=us.addUser(user);
		if(row>0){
			return "ע��ɹ�";
		}else{
			return "ע��ʧ��";
		}
	}

	//��¼
	public String loginUser(User user) {
		//1.�����û�,�������,���¼�ɹ�,�����¼ʧ��
		//���ݴ�������ֵ���÷��������ж�
		User user1=us.loginUser(user);
		if(user1!=null){
			return "��¼�ɹ�";
		}else{
			return "��¼ʧ�ܣ��������";
		}
	}

}
