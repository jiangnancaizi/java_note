package com.itheima.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class QuickStartServlet implements Servlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//1.获得servlet的name
	String serletName=config.getServletName();
	System.out.println(serletName);
	
	String initParamter=config.getInitParameter("url");
	System.out.println(initParamter);
	
	//3.获得servletcontext
		ServletContext servletContext=config.getServletContext();
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("QuickStartServlet running....");
		res.getWriter().write("QuickStartServlet running....");
		     
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destory running....");
		
	}


	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
