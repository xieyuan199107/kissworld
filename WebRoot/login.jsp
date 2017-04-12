<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
<script type="text/javascript">
	function doChange(){
		window.location.href="regedit.jsp";
	}
</script>
<style type="text/css">
ul{
list-style-type:none;
}
div{

color:#000;
}
</style>
  </head>
  
  <body>${msg}
  <center>
  <div>
  <h1>注册与登陆系统</h1>
    <s:form name="user" action="login" method="post">
    	<ul><li>账号：<input type="text" name="user.username" value="${user.username}"/><br><br></li>
    	    <li>密码：<input type="password" name="user.password" value="${user.password}"/><br><br></li>
    	    <li><input type="submit" name="method" value="登录">	</li>
    	</ul>
    </s:form>
   </div>
    <div>
    <input type="submit" value="注册" onclick="doChange()"/>
    </div>
    </center>
  </body>
</html>
