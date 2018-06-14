package com.itheima.header;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 没有响应的资源 告知客户端重定向2
		//1. 设置状态吗 302
//		response.setStatus(302);
		//2. 设置响应头Location
		//response.setHeader("Location", "/web14/servlet2");
		response.sendRedirect("/web14/servlet2");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}