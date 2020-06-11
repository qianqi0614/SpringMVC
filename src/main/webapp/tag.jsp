<%--
  Created by IntelliJ IDEA.
  User: qianq
  Date: 2020/6/7
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>学生信息</h1>
<form:form modelAttribute="student">
    学生ID：<form:input path="id"/><br/>
    学生姓名：<form:input path="name"/><br/>
    学生年龄：<form:input path="age"/><br/>
<%--    学生密码：<form:password path="name"/><br/>--%>
    checkbox：<form:checkbox path="flag" value="flag"/><br/>
<%--    爱好：<form:checkbox path="hobby" value="摄影"/>摄影<br/>--%>
<%--    <form:checkbox path="hobby" value="读书"/>读书<br/>--%>
<%--    <form:checkbox path="hobby" value="看电影"/>看电影<br/>--%>
<%--    <form:checkbox path="hobby" value="旅游"/>旅游<br/>--%>
<%--    <form:checkbox path="hobby" value="玩游戏"/>玩游戏<br/>--%>
    爱好：<form:checkboxes path="selectHobby" items="${student.hobby}"/><br/>
    radiobutton：<form:radiobutton path="radioId" value="1"/>radiobutton<br/>
    学生年级：<from:radiobuttons path="selectGrade" items="${student.gradeMap}"/><br/>
    城市：<from:select path="selectCity" items="${student.cityMap}"/><br/>
    所在城市：<form:select path="selectCity">
                <form:options items="${student.cityMap}"></form:options>
            </form:select><br/>
    所在城市：<form:select path="selectCity">
                <form:option value="1">杭州</form:option>
                <form:option value="2">成都</form:option>
                <form:option value="3">西安</form:option>
            </form:select><br/>
    信息：<form:textarea path="introduce"/><br/>
    <input type="submit" value="提交"/>
</form:form>
</body>
</html>
