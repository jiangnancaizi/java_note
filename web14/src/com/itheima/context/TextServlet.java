package com.itheima.context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TextServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=utf-8");
PrintWriter writer=	response.getWriter();
	//设置response查询的码表
	//response.setCharacterEncoding("UTF-8");
//	
//	//通过一个头Content-Type 告知客户端使用编码
	//response.setHeader("Content-Type", "text/html;charset=UTF-8");
	
	writer.write("hello res");
	//writer.write("你好");
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}