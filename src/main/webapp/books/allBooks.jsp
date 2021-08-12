<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 23.07.2021
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Books</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Book</th>
        <th>Author</th>
        <th>Year</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.author}</td>
            <td>${user.year}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<hr>

<h3><a href="../books/add">Add book...</a></h3>
<h3><a href="../index.jsp">Go to main...</a></h3>
</body>
</html>
