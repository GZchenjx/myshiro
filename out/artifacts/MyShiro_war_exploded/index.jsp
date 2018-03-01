<%--
&lt;%&ndash;
  Created by IntelliJ IDEA.
  User: CHEN JX
  Date: 2017/11/5
  Time: 19:45
  To change this template use File | Settings | File Templates.
&ndash;%&gt;
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="<%=path %>/user/login" method="post">
    <input name="name" />
    <input type="password" name="password" />
    <input type="submit" />
  </form>
  </body>
</html>
--%>


<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE>
<html>
<head>
    <title>My JSP 'MyJsp.jsp' starting page</title>
</head>

<body>
<h1>登录页面</h1>
<form action="<%=path %>/user/login" method="post">
    用户名：<input type="text" name="name"/> <br/>
    密 &nbsp;&nbsp;码：<input type="password" name="password" /> <br/>
    <<input type="submit" value="登入"/>
</form>
</body>
</html>
