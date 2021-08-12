<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 23.07.2021
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>

<form action="../users/add" method="post" modelAttribute="${user}">
    <p>Name : <input type="text" name="name"></p>
    <p>Login : <input type="text" name="login"></p>
    <p>Email : <input type="email" name="email"></p>
    <p>Password : <input type="text" name="password"></p>
    <input type="submit" value="Pass data">
</form>

<hr>
<h3><a href="../users/all">Users list...</a></h3>
<h3><a href="../index.jsp">Go to main...</a></h3>
</body>
</html>
