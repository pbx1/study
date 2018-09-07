package com.oracle.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.oracle.C3P0Util;
import com.oracle.dao.UserDao;
import com.oracle.entry.User;

/**
 * ���ݷ��ʲ�
 * 
 * ͨ��ҵ���߼��Ĳ�������Ҫȥ������ҵ���Ӧ�����ݴ���
 * 
 * ��Ҫ����ҵ���߼��������ɵ����ݣ�
 * ��һ����װ��Ȼ��������ݷ��ʲ����������ݱ���
 * 
 * ����,����ҵ���߼���Ҫ�󣬵������ݵ�ɾ�����޸ģ���ѯ�ȵȡ�
 * @author oracleOAEC
 *
 */
public class UserDaoImpl implements UserDao{

	@Override
	public int addUser(User user) {
		//��һ�����Ȼ�ȡ����
		Connection con=C3P0Util.getConnection();
		//����QueryRunner����
		QueryRunner que= new QueryRunner();
		//ID�����Զ�����
		String sql="insert into PBX values(pbx_id_seq.nextval,?,?,?,?,?,?,?,?,?,?)";
		int row = 0;
		try {
			//��row�����޸ĺ����������ɹ�����1,ʧ�ܷ���0
			row = que.update(con,sql,user.getUserName(),user.getName(),user.getPassWord(),user.getBrithday(),user.getSex(),user.getHobby(),user.getTel(),user.getIdcard(),user.getEmail(),user.getAdressload());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row;
	}

	//��¼
	public User loginUser(User user) {
		//��һ�����Ȼ�ȡ����
		Connection con=C3P0Util.getConnection();
		//����QueryRunner����
		QueryRunner qr=new QueryRunner();
		String sql="select *from PBX where username =? and password=?";
		Object[] obj={user.getUserName(),user.getPassWord()};
		//�ڶ�������ʼ��
		User user1 = null;
		try {
			//����������ȡ����
			user1 = qr.query(con, sql, new BeanHandler<User>(User.class),obj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//���Ĳ�������ѯ�����Ľ����װ�ص�ʵ�������
		return user1;
	}

}
