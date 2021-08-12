<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 23.07.2021
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Users</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Login</th>
        <th>Email</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.login}</td>
            <td>${user.email}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<hr>

<h3><a href="../users/add">Add user...</a></h3>
<h3><a href="/users/findUserById">Find user by Id...</a> </h3>
<h3><a href="/users/findUserByEmail.jsp">Find user by Email...</a> </h3>
<h3><a href="/users/findUsersByLogin.jsp">Find users by Login...</a> </h3>
<br>
<h3><a href="../index.jsp">Go to main...</a></h3>
</body>
</html>
