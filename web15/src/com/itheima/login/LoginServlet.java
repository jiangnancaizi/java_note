package com.itheima.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.itheima.register.User;
import com.itheima.utils.DataSourceUtils;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		// 1.获得用户名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// 2.经行用户的查询
		User login = null;
		try {
			login = login(username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 3.通过user是否为空判断用户名是否正确
		if (login != null) {
			// 用户名或密码正确
			// 登陆成功跳转到网站首页
			response.sendRedirect(request.getContextPath());
		} else {
			// 用户名或密码错误
			// 跳回当前login.jsp
			// 转发 转发到login.jsp向request域中存储错误信息
			request.setAttribute("loginInfo", "用户名错误");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

	public User login(String username, String password) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from user where username=? and password=?";
		User user = runner.query(sql, new BeanHandler<User>(User.class), username, password);
		return user;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);,,,,,
	}
}