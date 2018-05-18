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
    
    <title>项目模块</title>
    
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
  
  <table border="1" width="100%">
  		<tr>
  			<td>功能点</td>
  			<td>计划时间</td>
  			<td>操作</td>
  		</tr>
  		<!-- 接收集合数据 -->
  		<c:forEach items="${itemList}" var="us">
  			<tr>
  			<td>${us.function}</td>
  			<td>10</td>
  			<td><a href="<%=path %>/updateitem.action?id=${us.id}">修改</a>|<a href="<%=path %>/deleteitem.action?id=${us.id}">删除</a></td>
  			</tr>
  		</c:forEach>
  	</table>
  
  </body>
</html>
