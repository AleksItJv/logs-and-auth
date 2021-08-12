<%--<jsp:useBean id="user" scope="request" type="com.app.entities.User"/>--%>

<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 23.07.2021
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User by email</title>
</head>
<body>

<%-- <c:forEach items="${list}" var="user"> --%>
<h2>${user.id} | ${user.login} | ${user.name} | ${user.email}</h2>
<%-- </c:forEach> --%>


<hr>

<h3><a href="../users/findUserByEmail.jsp">Search more...</a></h3>
<h3><a href="../index.jsp">Go to main...</a></h3>

</body>
</html>
