<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
   
   
   <input type="button" value="新建项目"><input type="button" value="用户管理">
  	<input type="button" value="密码修改"><input type="button" value="退出系统"><br/>
  	<table border="1" width="100%">
  		<tr>
  			<td>用户名</td>
  			<td>真实姓名</td>
  			<td>密码</td>
  			<td>邮箱</td>
  			<td><a href="#">修改</a>|<a href="#">删除</a></td>
  		</tr>
  		<!-- 接收集合数据 -->
  		<c:forEach items="${Users}" var="us">
  			<tr>
  			<td>${us.userName}</td>
  			<td>${us.realName}</td>
  			<td>${us.pwd}</td>
  			<td>${us.email}</td>
  			<td><a href="#">修改</a>|<a href="#">删除</a></td>
  			</tr>
  		</c:forEach>
  	</table>
   
   
  </body>
</html>
