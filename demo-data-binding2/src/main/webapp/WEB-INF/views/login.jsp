<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 7/16/2021
  Time: 5:03 PM
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Login</h2>
<form:form action="/Login" method="post" modelAttribute="login">
    <p>User name :</p>
    <form:input path="username"/>
    <p>Password :</p>
    <form:input path="password"/>
    <button type="submit"> Login </button>
</form:form>
</body>
</html>
