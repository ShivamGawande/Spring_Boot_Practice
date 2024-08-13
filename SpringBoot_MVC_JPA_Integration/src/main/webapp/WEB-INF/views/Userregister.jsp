<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
</head>
<body>
    <div>
        <form:form action="user/register" method="post" autocomplete="off">
            First Name<input type="text" name="fname" required><br>
            Last Name<input type="text" name="lname"><br>
            Email<input type="email" name="email" required autocomplete="off"><br>
            Mobile<input type="text" name="mobile" required autocomplete="off"><br>
            <input type="radio" name="gender" value="male">M
            <input type="radio" name="gender" value="female">F<br>
            Password<input type="password" name="pass" required autocomplete="off"><br> 
            <input type="submit" value="Register">
        </form:form>
        <a href="Userlogin"><button>existing user</button></a>
    </div>
</body>
</html>