<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>SSH整合用户登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="E:\Program Files\Myeclipse\jquery-1.12.3.js"></script>
  </head>
  
  <body>${msg} 
    <form name="user" action="/RegeditAndLogin/login.action" method="post">
    	登录用户名：<input type="text" name="user.username" value="${user.username}"/><br><br>
    	登录密    码：<input type="password" name="user.password" value="${user.password}"/><br><br>
    	<input type="submit" name="method" value="登录">
    </form>
  </body>
</html>
