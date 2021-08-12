<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 23.07.2021
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Year</title>
</head>
<body>

<form action="../books/findBookByYear" method="post">
    <p>Year : <input type="number" name="year"></p>
    <input type="submit" value="Pass data">
</form>

<hr>

<h3><a href="../index.jsp">Go to main...</a></h3>
</body>
</html>
