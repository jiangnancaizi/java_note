package com.itheima.register;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbutils.QueryRunner;

import com.itheima.utils.DataSourceUtils;

public class RegisterServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置request编码---只适合post
		request.setCharacterEncoding("UTF-8");
		//获取数据
		
		//get方式解决乱码
		String username=request.getParameter("username");
		//先编码在解码
		username=new String(username.getBytes("ISO8859-1"),"UTF-8");
		
		//使用BeanUtils自动封装
		//BeanUtils：
		//2.将数据封装到javabean
		Map<String, String[]>properties=request.getParameterMap();
		User user=new User();
		try {
			BeanUtils.populate(user, properties);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//User对象已经封装好了
		//手动封装uid---uuid 随机不重复的字符串32位 java代码生成后36位 随机字符串
		user.setUid(UUID.randomUUID().toString());
		
		//3.将参数传递给业务操作方法
		try {
			register(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//4 认为注册成功，跳转登陆界面
		response.sendRedirect(request.getContextPath()+"/login.jsp");
	}
	//注册i
	public void register(User user) throws SQLException {
		//操作数据库
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="insert into user values(?,?,?,?,?,?,?,?,?,?)";
		
		runner.update(sql,user.getUid(),user.getUsername(),user.getPassword(),user.getName(),
				user.getEmail(),null,user.getBirthday(),user.getSex(),null,null);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
}