<%--
  Created by IntelliJ IDEA.
  User: qianq
  Date: 2020/6/8
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form modelAttribute="account" action="/validator/login" method="post">
        姓名：<form:input path="name"/><form:errors path="name"/><br/>
        密码：<form:input path="password"/><form:errors path="password"/><br/>
        <input type="submit" value="登陆">
    </form:form>
</body>
</html>
