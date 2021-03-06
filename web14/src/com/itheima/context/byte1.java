package com.itheima.context;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class byte1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//使用response获得字节输出
	ServletOutputStream out=response.getOutputStream();
	
	//获得服务器上的图片
String path=this.getServletContext().getRealPath("a.jpg");
	InputStream in=new FileInputStream(path);
	int len=0;
	byte[] buffer = new byte[1024];
	while((len=in.read(buffer))>0)
	{
		out.write(buffer,0,len);
	}
	in.close();
	out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}