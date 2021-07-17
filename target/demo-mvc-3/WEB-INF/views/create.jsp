<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 7/16/2021
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>CREATE USER FORM</h2>
<form:form action="/create-user" method="post" modelAttribute="user">
    <p>User name :</p>
    <form:input path="userName"/>
    <p>Password :</p>
    <form:input path="password"/>
    <p>Address :</p>
    <form:input path="address"/>
    <p>Age :</p>
    <form:input path="age"/>
    <br>
    <button type="submit">Create</button>
</form:form>
</body>
</html>
