<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 7/24/2021
  Time: 5:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create Blog</title>
</head>
<body>
    <form:form action="insert.htm" modelAttribute="blogNew" method="post">
        <table border="1">
            <tr>
                <td>Blog ID</td>
                <td><form:input path="blogId"></form:input></td>
            </tr>
            <tr>
                <td>Blog Name</td>
                <td><form:input path="blogName"></form:input></td>
            </tr>
            <tr>
                <td>Blog Text</td>
                <td><form:input path="blogText"></form:input></td>
            </tr>
            <tr>
                <td>Category Name</td>
                <td>
                    <form:select path="category.categoryId">
                        <c:forEach items="${listCategory}" var="listCategory">
                            <form:option value="${listCategory.categoryId}">${listCategory.categoryName}</form:option>
                        </c:forEach>
                    </form:select>
                </td>
            </tr>

<%--            <tr>--%>
<%--                <td>Category Id</td>--%>
<%--                <td><form:input path="category.categoryId"></form:input></td>--%>
<%--            </tr>--%>

<%--            <tr>--%>
<%--                <td>Blog Date</td>--%>
<%--                <td><form:input path="blogDate"></form:input></td>--%>
<%--            </tr>--%>
            <tr>
                <td colspan="2"><input type="submit" value="Create"></td>
            </tr>
        </table>
    </form:form>
    <a href="/blogController/getAll.htm"><button>Back Blog</button></a>
</body>
</html>
