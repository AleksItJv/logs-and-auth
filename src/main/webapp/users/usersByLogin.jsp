<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 23.07.2021
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User by login</title>
</head>
<body>

<c:forEach items="${list}" var="user">
    <h2>${user.id} | ${user.login} | ${user.name} | ${user.email}</h2>
</c:forEach>

<table border="0.1 px" style="background: black">
    <colgroup>
        <col span="4" style="background:LightGrey">
        <col style="background-color:LightCyan">
    </colgroup>
    <thead>
    <tr>
        <th><h3>ID</h3></th>
        <th><h3>Login</h3></th>
        <th><h3>Name</h3></th>
        <th><h3>Email</h3></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="user">
        <tr>
            <td><h4>${user.id}</h4></td>
            <td><h4>${user.login}</h4></td>
            <td><h4>${user.name}</h4></td>
            <td><h4>${user.email}</h4></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<hr>
<h3><a href="../users/findUsersByLogin.jsp">Search more...</a></h3>
<h3><a href="../index.jsp">Go to main...</a></h3>
<hr>

</body>
</html>
