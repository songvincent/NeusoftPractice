<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>新建用户</title>
    
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
   <input type="button" value="返回"><br/>
   <form action="<%=path %>/afterupdate.action" method="post">
   <input type="hidden" name="id" value="${user.id }">
    用&nbsp;&nbsp;户&nbsp;&nbsp;名：<input type="text" name="username" value="${user.userName }"><br/>
     密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="text" name="password" value="123"><br/>
 
    真实姓名：<input type="text" name="realname" value="${user.realName }"><br/>
    <!--  
    角&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;色：
    <select>
  <option value ="volvo">管理员</option>
  <option value ="saab">普通用户</option>
</select><br/>
   --> 
    
    邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱：<input type="text" name="useremail" value="${user.email }"><br/>
   
   <input type="submit" value="提交">
   
   </form>
  </body>
</html>
