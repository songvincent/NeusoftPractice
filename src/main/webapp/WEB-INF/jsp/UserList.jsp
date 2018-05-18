<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<input type="button" value="新建用户" onClick="window.location.href='<%=path %>/createuser.action'">
  	<input type="button" value="搜索用户" onClick="window.location.href='<%=path %>/finduser.action'">
  	<input type="button" value="返回" onClick="window.location.href='<%=path %>/loginn.action'">
  	<table border="1" width="100%">
  		<tr>
  			<td>用户名</td>
  			<td>真实姓名</td>
  			<td>角色</td>
  			<td>邮箱</td>
  			<td>操作</td>
  		</tr>
  		<!-- 接收集合数据 -->
  		<c:forEach items="${Users}" var="us">
  			<tr>
  			<td>${us.userName}</td>
  			<td>${us.realName}</td>
  			<td>${us.roleid}</td>
  			<td>${us.email}</td>
  			<td><a href="<%=path %>/updateuser.action?id=${us.id}">修改</a>|<a href="<%=path %>/deleteuser.action?id=${us.id}">删除</a></td>
  			</tr>
  		</c:forEach>
  	</table>
    
  </body>
</html>
