package com.itheima.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.itheima.domain.User;
import com.itheima.utils.DataSourceUtils;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.获取用户名和密码
	String username=request.getParameter("username");
	String password=request.getParameter("password");
		
		//2.从数据库中验证用户名和密码是否正确
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from user where username=? and password=?";
		User user=null;
		try {
		user=runner.query(sql, new BeanHandler<User>(User.class),username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//3.感觉返回结果显示
		if(user!=null) {
			//"用户登录成功"
			response.getWriter().write(user.toString());
		}else {
			response.getWriter().write("shibai");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}