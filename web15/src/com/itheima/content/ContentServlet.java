package com.itheima.content;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ContentServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.获取单个表当
	String username=request.getParameter("username");
	System.out.println(username);
	String password=request.getParameter("password");
	System.out.println(password);
	
	// 2.获得多个表单
	String[] hobbys=request.getParameterValues("hobby");
	for(String hobby:hobbys) {
		System.out.println(hobby);
	}
	//3.获得所有请求参数的名称
	Enumeration<String> parameterNames=	request.getParameterNames();
	while (parameterNames.hasMoreElements()) {
		String string = (String) parameterNames.nextElement();
		System.out.println(string);
		
	}
	System.out.println("---------------");
	// 4.获得所有的参数 封装到一个map<String,String[]>
	Map<String, String[]> parameterMap=request.getParameterMap();
	for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
		System.out.println(entry.getKey());
		for (String str : entry.getValue()) {
			System.out.println(str);
		}
		System.out.println("-----------");
	}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}