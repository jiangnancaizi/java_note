package com.itheima.dbutils;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.itheima.utils.DataSourceUtils;

public class DBUtilsdemo {
public static void main(String[] args) {
	Connection conn=null;
	try {
		QueryRunner runner=new QueryRunner();
			
//		runner.update("update account set money=10000 where name='tom'");
		//获得一个连接
		 conn=DataSourceUtils.getConnection();
		//开启事务
		conn.setAutoCommit(false);
		runner.update(conn, "update account set money=10000 where name='tom'");
		//提交事务
		conn.commit();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		try {
			conn.rollback();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		e.printStackTrace();
	}
}

}
