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
    <title>Mượn sách</title>
</head>
<body>
<table border="1">
    <thead>
    <th>Book Id</th>
    <th>Book Name</th>
    <th>Quantity</th>
    <th>Mã sách</th>
    </thead>
    <tbody>
    <td>${showBook.bookId}</td>
    <td>${showBook.bookName}</td>
    <td>${showBook.quantity}</td>
    <td>${showBook.maCode}</td>
    </tbody>
</table>
<a href="muonSach.htm?bookId=${showBook.bookId}"><button>Mượn sách</button></a>

</body>
</html>
