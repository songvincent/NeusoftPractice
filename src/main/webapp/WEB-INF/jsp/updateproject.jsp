<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改项目</title>
    
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
  
   <form action="<%=path %>/updateproject.action" method="post">
   <input type="hidden" name="id" value="${project.id }">
   项&nbsp;&nbsp;目&nbsp;&nbsp;名&nbsp;&nbsp;称&nbsp;：<input type="text" name="projectname" value="${project.projectName }"><br/>
  项目描述信息：<input type="text" name="description" value="${project.pDescription }"><br/>
    项&nbsp;目&nbsp;负&nbsp;责&nbsp;人：<input type="text" name="person" value="${project.person }"><br/>

   <input type="submit" value="提交">
   </form>
  </body>
</html>
