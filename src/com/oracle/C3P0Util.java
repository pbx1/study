package com.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;




/**
 * C3P0��
 * @author oracleOAEC
 *
 */
public class C3P0Util {

	private static DataSource dataSource = null;
	
	static{
		//�����и��ŵ㣬д�������ļ�����Ҫ�������ݿ�ܼ�
		dataSource = new ComboPooledDataSource("pbx");//����pbxsg������
		//dataSource = new ComboPooledDataSource("oracle");
	}
	
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 */
	public static Connection getConnection(){
		Connection con= null;
		
		try {
			con=dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	/**
	 * �ر���Դ
	 */
	public static void release(PreparedStatement pre,ResultSet rs,Connection con){
		try {
			if(rs!=null){
				rs.close();
			}if(pre!=null){
				pre.close();
			}if(con!=null){
				con.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}
	
}
