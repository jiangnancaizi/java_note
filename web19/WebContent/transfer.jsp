<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/transfer" method="post">
	 转出账户:<input type="text" name="out" /><br />
	  转入账户:<input type="text" name="in" /><br />
	 转账金额:<input type="text" name="money" /><br />
	 <input type="submit" value="确认转账" /><br />
	</form>
</body>
</html>