package com.itheima.header;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Header extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 获得指定的头
	String header=request.getHeader("User-Agent");
	System.out.println(header);
	//2.获得所有头的名字
	Enumeration<String> headernames=request.getHeaderNames();
	while (headernames.hasMoreElements()) {
		String headname = (String) headernames.nextElement();
		String headerValue=request.getHeader(headname);
		System.out.println(headname+":"+headerValue);
	}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}