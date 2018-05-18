<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>新增项目</title>
    
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
    
    <form action="<%=path %>/createprojectsucces.action" method="post">
    项&nbsp;目&nbsp;编&nbsp;号：&nbsp;<input type="text" name="projectid"><br/>
项目关键字：<input type="text" name="keyword"><br/>
 项目名称：&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="projectname"><br/>
描&nbsp;述&nbsp;信&nbsp;息：&nbsp;<input type="text" name="pdescription"><br/>
创&nbsp;建&nbsp;日&nbsp;期：&nbsp;<input type="text" name="createdate"><br/> 
项目负责人：<input type="text" name="person"><br/> 
 
   
   <input type="submit" value="提交">
   <input type="reset" value="重置">
   </form>
    
  </body>
</html>
