<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login</title>
</head>
<body>
    <div>
        <form:form action="admin/login" method="post" >
            Email<input type="email" name="email" required autocomplete="off"><br>
            Password<input type="password" name="pass" required autocomplete="off"><br> 
            <input type="submit" value="Login">
        </form:form>
        <h1>${response}</h1>
    </div>
</body>
</html>