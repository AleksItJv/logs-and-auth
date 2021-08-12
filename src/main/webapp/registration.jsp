<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 10.08.2021
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>

</head>
<body>

<form action="/registration" method="post" modelAttribute="${user}">
    <div class="input-group mb-3">
        <span class="input-group-text" id="basic-addon1">Name</span>
        <input name="name" type="text" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
    </div>
    <div class="input-group mb-3">
        <span class="input-group-text" id="basic-addon3">Login</span>
        <input name="login" type="text" class="form-control" placeholder="Login" aria-label="Login" aria-describedby="basic-addon1">
    </div>

    <div class="input-group mb-3">
        <input name="email" type="email" class="form-control" placeholder="Recipient's username" aria-label="Recipient's username" aria-describedby="basic-addon2">
        <span class="input-group-text" id="basic-addon2">@example.com</span>
    </div>

    <div class="row g-3 align-items-center">
        <div class="col-auto">
            <label for="inputPassword6" class="col-form-label">Password</label>
        </div>
        <div class="col-auto">
            <input name="password" type="password" id="inputPassword6" class="form-control" aria-describedby="passwordHelpInline">
        </div>
        <div class="col-auto">
    <span id="passwordHelpInline" class="form-text">
      Must be 8-20 characters long.
    </span>
        </div>
    </div>

    <select class="form-select" aria-label="Default select example">
        <option selected>select role</option>
        <option value="ADMIN">Admin</option>
        <option value="USER">User</option>
    </select>
    <button type="submit" class="btn btn-primary">Submit</button>

</form>


<%--<form action="/registration" method="post" modelAttribute="${user}">
    <p>Name : <input type="text" name="name"></p>
    <p>Login : <input type="text" name="login"></p>
    <p>Email : <input type="text" name="email"></p>
    <p>Password : <input type="text" name="password"></p>
    <p>Role :
        <select name="role">
            <option selected value="USER">User</option>
            <option value="ADMIN">Admin</option>
        </select></p>
    <input type="submit" value="Pass data">
</form>--%>

<p><a href="/index.jsp">Go to main...</a></p>
</body>
</html>
