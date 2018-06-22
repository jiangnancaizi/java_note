package com.itheima.transfer.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.itheima.transfer.dao.TransferDao;
import com.itheima.utils.DataSourceUtils;
import com.itheima.utils.MyDataSourceUtils;

public class TransferService {

	public boolean transfer(String out, String in, double money) {
		TransferDao dao=new TransferDao();
		boolean isTransferSuccess=true;
		
		Connection conn=null;
		try {
			//开启事务
			// conn=DataSourceUtils.getConnection();
			//conn.setAutoCommit(false);
			//使用Threadlocal
			//开启事务
			MyDataSourceUtils.startTransaction();
			
			dao.out(out,money);
			int i=1/0;
			//转入钱的方法 
			dao.in(in,money);
		} catch (Exception e) {
			isTransferSuccess=false;
			//回滚事务
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			try {
				conn.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return isTransferSuccess;
		
	}

}
