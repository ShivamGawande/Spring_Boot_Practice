<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Search</title>
</head>
<body>
    <div>
        <form:form action="user/search" method="post" >
            Email<input type="email" name="email" required autocomplete="off"><br>
            <input type="submit" value="search">
        </form:form>
        <h1>${response}</h1>
    </div>
</body>
</html>



private String fName;
	private String lName;
	private String email;
	private String city;
	private String gender;
	private String country;
	private Integer age;

    {
        "fName":"Shivam",
        "lName":"Gawande",
        "email":"shivamgawande@gmail.com",
        "city":"Hiwarkhed",
        "gender":"Male",
        "country":"India",
        "age":24
    }