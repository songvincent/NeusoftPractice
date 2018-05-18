# NeusoftPractice
本次是大三下在东软进行的java方向的实习，利用ssm框架做一个小型的网站
目录结构如下：
我是利用maven整合的ssm:

“目录中的图片”

Pom.xml配置相应的jar包信息
Resuorces下放置spring与mybatis的相应配置文件（视作根目录）
Java下放置controller，pojo,mapper,service等相应的处理类、处理方法。

Bug:
1、
利用maven整合时，最好是联网配置，要不然出现的问题会让人很难受
（如我遇到的Servlet.init() for servlet springmvc threw exception，找不到对应beans时）
2、
Button要处理 action时：（如下）
<input type="button" value="密码修改" onClick="window.location.href='<%=path %>/updatepwd.action'">
3、
mybatis的update处理
update project set projectname=#{projectName},pdescription=#{pDescription},person=#{person} where id=#{id}
#后面要有相应的getter方法，要不就找不到，即就是类中的参数
同时一定要指明参数类型（paramtype）
记住：mybatis一次只能传一个值，要传多值时，就传过来一个类。

4、
中文乱码的解决
String pperson=request.getParameter("person");
byte[] utf8Bytes3 = pperson.getBytes("iso-8859-1"); 
String person = new String(utf8Bytes3, "utf-8");

5、
以后在设计数据库时，id这种主键，最好设置为自动增加。
