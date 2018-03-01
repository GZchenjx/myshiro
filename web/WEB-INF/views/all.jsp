<%--
  Created by IntelliJ IDEA.
  User: CHEN JX
  Date: 2017/11/6
  Time: 8:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
        String path = request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>



        <table>
            <tr>
                <td>id</td>
                <td>名字</td>
                <td>价格</td>
            </tr>
            <c:forEach items="${requestScope.products}" var="pro">

            <tr>
                <td>${pro.id}</td></br>
                <td>${pro.name}</td></br>
                <td>${pro.price}</td>
            </tr>
            </c:forEach>
        </table>


</body>
</html>
