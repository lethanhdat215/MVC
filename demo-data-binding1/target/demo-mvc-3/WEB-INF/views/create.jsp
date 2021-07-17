<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 7/16/2021
  Time: 8:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
    <title>Manager Employee</title>
</head>
<body>
<form:form action="/employee" method="post" modelAttribute="employee">
<p>Employee Name :</p>
<form:input path="employeeName"></form:input>
<p>Employee Sex :</p>
    <form:input path="employeeSex"></form:input>
<p>Employee Address :</p>
    <form:input path="employeeAddress"></form:input>
<p>Employee Age :</p>
    <form:input path="employeeAge"></form:input>
<button type="submit">Manager Employee</button>
</form:form>

</body>
</html>
