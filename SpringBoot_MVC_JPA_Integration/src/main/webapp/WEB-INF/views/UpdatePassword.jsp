<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update User Password</title>
</head>
<body>
    <div>
        <form:form action="update/password" method="post" autocomplete="off">
            Username<input type="text" name="uname">
            Current Password<input type="password" name="cpass" required><br>
            New Password<input type="password" name="npass"><br>
            Retype Password<input type="password" name="rpass" required autocomplete="off"><br>
            <input type="submit" value="Update">
        </form:form>
        <a href="Userlogin"><button>existing user</button></a>
    </div>
</body>
</html>