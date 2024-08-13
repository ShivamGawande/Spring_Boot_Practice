<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration</title>
</head>
<body>
    <form:form action="user/order" method="post">
    Full Name<input type="text" name="name"><br>
    Email<input type="email" name="email"><br>
    Mobile<input type="text" name="mobile"><br>
    Food Type<input type="text" name="food"><br> 
    <input type="submit" value="order">
</form:form>

</body>
</html>