<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 7/31/2021
  Time: 10:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
      .error{color:red}
    </style>
</head>
<body>
<form:form action="create-user" method="post" modelAttribute="user">
  <p>First Name:</p>
  <form:input path="firstName"/>
  <form:errors path="firstName" cssClass="error"/>
  <p>Last Name :</p>
  <form:input path="lastName"/>
  <form:errors path="lastName" cssClass="error"/>
  <p>Age :</p>
  <form:input path="age"/>
  <form:errors path="age" cssClass="error"/>
  <p>Phone Number :</p>
  <form:input path="phoneNumber"/>
  <form:errors path="phoneNumber" cssClass="error"/>
  <br>
  <p>Email:</p>
  <form:input path="email"/>
  <form:errors path="email" cssClass="error"/>
  <button type="submit">Submit</button>
</form:form>

</body>
</html>
