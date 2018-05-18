# NeusoftPractice
本次是大三下在东软进行的java方向的实习，利用ssm框架做一个小型的网站<br/>
目录结构如下：<br/>
我是利用maven整合的ssm:<br/>
<br/>
见“目录中的图片”<br/>
<br/>
Pom.xml配置相应的jar包信息<br/>
Resuorces下放置spring与mybatis的相应配置文件（视作根目录）<br/>
Java下放置controller，pojo,mapper,service等相应的处理类、处理方法。<br/>
<br/>
Bug:<br/>
1、<br/>
利用maven整合时，最好是联网配置，要不然出现的问题会让人很难受<br/>
（如我遇到的Servlet.init() for servlet springmvc threw exception，找不到对应beans时）<br/>
2、<br/>
Button要处理 action时：（如下）<br/>
<input type="button" value="密码修改" onClick="window.location.href='<%=path %>/updatepwd.action'"><br/>
3、<br/>
mybatis的update处理<br/>
update project set projectname=#{projectName},pdescription=#{pDescription},person=#{person} where id=#{id}<br/>
#后面要有相应的getter方法，要不就找不到，即就是类中的参数<br/>
同时一定要指明参数类型（paramtype）<br/>
记住：mybatis一次只能传一个值，要传多值时，就传过来一个类。<br/>
<br/>
4、<br/>
中文乱码的解决<br/>
String pperson=request.getParameter("person");<br/>
byte[] utf8Bytes3 = pperson.getBytes("iso-8859-1"); <br/>
String person = new String(utf8Bytes3, "utf-8");<br/>
<br/>
5、<br/>
以后在设计数据库时，id这种主键，最好设置为自动增加。<br/>
