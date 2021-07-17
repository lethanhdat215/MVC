<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 7/16/2021
  Time: 8:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Những gia vị đã chọn : </h1>
<c:forEach var="i" begin="0" end="${Size}">
    <c:out value=" ${Sandwichs[i]}" /> <br/>
</c:forEach>
</body>
</html>
