<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 23.07.2021
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Find user by email</title>
</head>
<body>

<form action="../users/findUserByEmail" method="post">
    <p>Email <input type="text" name="email"></p>
    <input type="submit" value="Pass data">
</form>

<hr>
<h3><a href="../index.jsp">Go to main...</a></h3>
</body>
</html>
