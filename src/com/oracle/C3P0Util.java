package com.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;




/**
 * C3P0类
 * @author oracleOAEC
 *
 */
public class C3P0Util {

	private static DataSource dataSource = null;
	
	static{
		//这里有个优点，写好配置文件，想要跟换数据库很简单
		dataSource = new ComboPooledDataSource("pbx");//这是pbxsg的配置
		//dataSource = new ComboPooledDataSource("oracle");
	}
	
	/**
	 * 获取数据库连接
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
	 * 关闭资源
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
