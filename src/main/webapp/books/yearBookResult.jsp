<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 23.07.2021
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Year Book Result</title>
</head>
<body>
<c:forEach items="${list}" var="user">
    <h2>${user.id} | ${user.name} | ${user.author} | ${user.year}</h2>
</c:forEach>


<hr>

<h3><a href="../books/findBookByYear">Search new one...</a></h3>
<h3><a href="../index.jsp">Go to main...</a></h3>

</body>
</html>
