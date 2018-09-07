package com.oracle.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.oracle.C3P0Util;
import com.oracle.dao.UserDao;
import com.oracle.entry.User;

/**
 * 数据访问层
 * 
 * 通过业务逻辑的操作，需要去分配查找到相应的数据处理
 * 
 * 主要负责将业务逻辑层计算完成的数据，
 * 做一个封装，然后调用数据访问操作，将数据保存
 * 
 * 或者,根据业务逻辑层要求，调用数据的删除，修改，查询等等。
 * @author oracleOAEC
 *
 */
public class UserDaoImpl implements UserDao{

	@Override
	public int addUser(User user) {
		//第一步，先获取连接
		Connection con=C3P0Util.getConnection();
		//创建QueryRunner对象
		QueryRunner que= new QueryRunner();
		//ID设置自动增长
		String sql="insert into PBX values(pbx_id_seq.nextval,?,?,?,?,?,?,?,?,?,?)";
		int row = 0;
		try {
			//用row接收修改后的数，如果成功返回1,失败返回0
			row = que.update(con,sql,user.getUserName(),user.getName(),user.getPassWord(),user.getBrithday(),user.getSex(),user.getHobby(),user.getTel(),user.getIdcard(),user.getEmail(),user.getAdressload());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row;
	}

	//登录
	public User loginUser(User user) {
		//第一步，先获取连接
		Connection con=C3P0Util.getConnection();
		//创建QueryRunner对象
		QueryRunner qr=new QueryRunner();
		String sql="select *from PBX where username =? and password=?";
		Object[] obj={user.getUserName(),user.getPassWord()};
		//第二步，初始化
		User user1 = null;
		try {
			//第三步，获取数据
			user1 = qr.query(con, sql, new BeanHandler<User>(User.class),obj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//第四步，将查询出来的结果，装载到实体对象中
		return user1;
	}

}
