<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>项目管理</title>
    
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
  
  
    <!-- 
    <form action="<%=path %>/createproject.action" method="post" >
    <input type="submit" value="新建项目">
    </form>
    <form action="<%=path %>/usermanage.action" method="post" >
    <input type="submit" value="用户管理">
    </form>
    <form action="<%=path %>/updatepwd.action" method="post" >
    <input type="submit" value="修改密码">
    </form>
    <form action="<%=path %>/quit.action" method="post" >
    <input type="submit" value="退出系统">
    </form>     -->
    
    
    <!--  可能要出错，因为button未必可以这么传值-->
    
    <input type="button" value="新建项目" onClick="window.location.href='<%=path %>/createproject.action'">
    <input type="button" value="用户管理" onClick="window.location.href='<%=path %>/usermanage.action'">
  	<input type="button" value="密码修改" onClick="window.location.href='<%=path %>/updatepwd.action'">
  	<input type="button" value="退出系统" onClick="window.location.href='<%=path %>/quit.action'"><br/>
  	<table border="1" width="100%">
  		<tr>
  			<td>项目关键字</td>
  			<td>项目名称</td>
  			<td>项目描述信息</td>
  			<td>创建日期</td>
  			<td>项目负责人</td>
  			<td>操作</td>
  		</tr>
  		<!-- 接收集合数据 -->
  		<c:forEach items="${Projects}" var="us">
  			<tr>
  			<td>${us.keyword}</td>
  			<td>${us.projectName}</td>
  			<td>${us.pDescription}</td>
  			<td>${us.createDate}</td>
  			<td>${us.person}</td>
  			<td><a href="<%=path %>/questionlist.action?id=${us.id}">问题列表</a>|<a href="<%=path %>/itemlist.action?id=${us.id}">项目模块</a>|<a href="<%=path %>/distribute.action?id=${us.id}">任务分配</a>|<a href="<%=path %>/findone.action?id=${us.id}">修改</a>|<a href="<%=path %>/deleteproject.action?id=${us.id}">删除</a></td>
  			</tr>
  		</c:forEach>
  	</table>
    
    
  </body>
</html>
