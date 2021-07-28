<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 7/27/2021
  Time: 10:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create Category</title>
</head>
<body>
    <form:form action="insert.htm" modelAttribute="categoryNew" method="post" >
        <table border="1">
            <tr>
                <td>Category ID</td>
                <td><form:input path="categoryId"></form:input></td>
            </tr>
            <tr>
                <td>Category Name</td>
                <td><form:input path="categoryName"></form:input></td>
            </tr>
            <tr>
               <td colspan="2"> <input type="submit" value="Create"></td>
            </tr>
        </table>
    </form:form>
    <a href="/categoryController/getAll.htm"><button>Back Category</button></a>
</body>
</html>
