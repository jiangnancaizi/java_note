package com.itheima.context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("hello haohao...");
		
		ServletContext context=this.getServletContext();
		// 1.获得初始化参数
	String initParemeter=context.getInitParameter("driver");
	System.out.println(initParemeter);
	//2. 获得a b c d的绝对路径
	String realPatha=context.getRealPath("/a.txt");
	System.out.println(realPatha);
	
	String realPathb=context.getRealPath("/WEB-INF/b.txt");
	System.out.println(realPathb);
	
	String realPathc=context.getRealPath("/WEB-INF/classes/c.txt");
	System.out.println(realPathc);
	//3. 域对象 向servletContext中存数据
	context.setAttribute("name","zhangxuewu");
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}