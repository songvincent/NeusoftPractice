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
    
    <title>我报告的问题</title>
    
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
  			<td>Key</td>
  			<td>概要</td>
  			
  			<td>报告人</td>
  			<td>优先级</td>
  			<td>状态</td>
  			
  			<td>创建日期</td>
  			<td>处理日期</td>
  			<td>操作</td>
  		</tr>
  		<!-- 接收集合数据 -->
  		<c:forEach items="${questionList}" var="us">
  			<tr>
  			<td>${us.questionid}</td>
  			<td>${us.qdescription}</td>
  			
  			<td>${us.finder}</td>
  			<td>${us.priority}</td>
  			<td>${us.status}</td>
  			
  			<td>${us.createdate}</td>
  			<td>${us.solvedate}</td>
  			<td><a href="<%=path %>/deletequestion.action?id=${us.id}">删除</a></td>
  			</tr>
  		</c:forEach>
  	</table>
  
  
  </body>
</html>
