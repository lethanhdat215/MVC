<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 7/27/2021
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Show Blog</title>
</head>
<body>
<form:form action="initShow.htm"  modelAttribute="showBlog" method="get">
   <h2>${showBlog.blogName}</h2>
    <p>${showBlog.blogText}</p>
    <p>${showBlog.blogDate}</p>
    <p>${showBlog.category.categoryName}</p>
</form:form>
<a href="/blogController/getAll.htm"><button>Back Blog</button></a>
</body>
</html>
