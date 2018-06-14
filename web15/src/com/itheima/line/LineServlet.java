package com.itheima.line;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LineServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获得请求方式
		String method=request.getMethod();
		System.out.println(method);
		
		//2. 获得请求资源相关内容
		String requestURI=request.getRequestURI();
		StringBuffer requestURL=request.getRequestURL();
		System.out.println("uri:"+requestURI);
		System.out.println("url:"+requestURL);
		
		//获得web应用名称
		String contextPath=	request.getContextPath();
		System.out.println("web应用:"+contextPath); 
		
		//地址后的参数
		String queryString=	request.getQueryString();
		System.out.println("参数:"+queryString);
		
		//获得客户机的ip
	String removeAddr=request.getRemoteAddr();
	System.out.println("ip:"+removeAddr);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}