<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>新建问题</title>
    
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
   
   <form action="<%=path %>/afternewquestion.action" method="post">
    问题编号：<input type="text" name="questionid"><br/>
    项目编号：<input type="text" name="projectid"><br/>
    问题描述：<input type="text" name="qdescription"><br/>
   问题发现者：<input type="text" name="finder"><br/>
 优先级：<input type="text" name="priority"><br/>
 状态：<input type="text" name="status"><br/>
   创建日期：<input type="text" name="createdate"><br/>
 解决日期：<input type="text" name="solvedate"><br/>
 问题解决人：<input type="text" name="solveperson"><br/>
   
   <input type="submit" value="提交">
   <input type="reset" value="重置">
   </form>
   
  </body>
</html>
