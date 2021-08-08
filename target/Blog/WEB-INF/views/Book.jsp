<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 8/2/2021
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List Book</title>
</head>
<body>
<form action="traSach.htm" method="post">
    <table border="1">
        <thead>
        <th>Book Id</th>
        <th>Book Name</th>
        <th>Quantity</th>
        <th>Functions</th>
        </thead>
        <tbody>
        <c:forEach items="${listBook}" var="book">
            <tr>
                <td>${book.bookId}</td>
                <td>${book.bookName}</td>
                <td>${book.quantity}</td>
                <td>
                    <a href="initShow.htm?bookId=${book.bookId}">Mượn sách</a>
                    <button type="submit"> Tra Sach </button>
                    <input type="hidden" name="bookId" value="${book.bookId}">
                    <input type="text" placeholder="Nhập mã" name="code">
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</form>
</body>
</html>
