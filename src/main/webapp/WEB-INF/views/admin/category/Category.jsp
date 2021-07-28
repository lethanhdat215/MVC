<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 7/27/2021
  Time: 9:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List category</title>
</head>
<body>
<table border="1">
    <thead>
        <th>Category Id</th>
        <th>Category Name</th>
        <th>Function</th>
    </thead>
    <tbody>
        <c:forEach items="${listCategory}" var="category">
            <tr>
                <td>${category.categoryId}</td>
                <td>${category.categoryName}</td>
                <td>
                    <a href="initUpdate.htm?categoryId=${category.categoryId}"><button>Update Category</button></a>
                    <a href="delete.htm?categoryId=${category.categoryId}"><button>Delete Category</button></a>
                    <a href="initShow.htm?categoryId=${category.categoryId}"><button>Show Category</button></a>

                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<a href="initInsert.htm"><button>Create Category</button></a>
</body>
</html>
