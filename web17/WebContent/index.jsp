<?xml version="1.0" encoding="UTF-8" ?>
<%@ page pageEncoding="UTF-8" errorPage="/error.jsp"%>
<%@ taglib uri="http://" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<%@ include file="/demo.jsp" %>
xxxxx
	<!-- Html注释 -->
<% 
	//java单行注释
	int i=0;
	System.out.println(i);
	
%>
<%--jsp注释 --%>
<%=i %>
<%!
	String str="hello china";
%>
<%=str %>
 <h1>abcd</h1>
</body>
</html>