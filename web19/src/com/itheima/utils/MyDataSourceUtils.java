package com.itheima.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class MyDataSourceUtils {

	//获得Connection 从连接池
	private static ComboPooledDataSource dataSource=new ComboPooledDataSource();
	//创建一个threadlocal
	
	private static ThreadLocal<Connection> tl=new ThreadLocal<Connection>();
	//开启事务
	public static void startTransaction() throws SQLException {
	Connection conn=getCurrentConnection();
	conn.setAutoCommit(false);
	}
	
	//获得当前线程上的connection
	public static Connection getCurrentConnection() throws SQLException
	{
		//从ThreadLocal寻找当前线程是否有对应的Connection
		Connection conn=tl.get();
		if (conn==null) {
			//获得新的CONNECTION资源
			conn=getConnection();
			//将conn资源绑定到Threadlocal(map)上
			tl.set(conn);
		}
		return conn;
	}
	
	public static Connection getConnection() throws SQLException
	{
		return dataSource.getConnection();
	}

}
