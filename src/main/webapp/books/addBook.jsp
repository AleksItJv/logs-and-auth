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
    <title>Add Book</title>
</head>
<body>

<form action="../books/add" method="post" modelAttribute="${book}">
    <p>Name : <input type="text" name="name"></p>
    <p>Author : <input type="text" name="author"></p>
    <p>Year : <input type="text" name="year"></p>
    <input type="submit" value="Pass data">
</form>

<hr>
<h3><a href="../books/all">Books list...</a></h3>
<h3><a href="../index.jsp">Go to main...</a></h3>
</body>
</html>
