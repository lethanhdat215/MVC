<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 7/24/2021
  Time: 12:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List blog </title>
</head>
<body>
<table border="1">
    <thead>
    <th style="background: darkgreen">Blog Id</th>
    <th style="background: red">Blog Name</th>
    <th style="background: purple">Blog Text</th>
    <th style="background: yellow">Functions</th>
    </thead>
    <tbody>
    <c:forEach items="${listBlog}" var="blog">
        <tr>
            <td style="background: lightblue ">${blog.blogId}</td>
            <td style="background: lightblue">${blog.blogName}</td>
            <td style="background: lightblue">${blog.blogText}</td>
            <td>
                <a href="initUpdate.htm?blogId=${blog.blogId}"><button style="background: aqua">Update Blog</button></a>
                <a href="delete.htm?blogId=${blog.blogId}"><button style="background: chartreuse"> Delete Blog</button></a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="initInsert.htm"><button style="background: cornflowerblue">Creates Blog</button></a>


<%--<c:url var="loadStudentLink" value="createBlog.htm"/>--%>
<%--<a href="${loadStudentLink}">Create</a>--%>

<%--<c:url var="loadStudentLink" value="editBlog.htm"/>--%>
<%--<a href="${loadStudentLink}">Edit</a>--%>

<%--<c:url var="loadStudentLink" value="deleteBlog.htm"/>--%>
<%--<a href="${loadStudentLink}">Delete</a>--%>


</body>
</html>
