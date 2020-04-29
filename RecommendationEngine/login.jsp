<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link href="resources/assets/css/commonStyles.css" rel="stylesheet" />
</head>
<body>
	<h2>Welcome</h2>

	<form id="registerForm" method="post" action="register-user"
		modelAttribute="userDTO">
		Name: <input type="text" name="name" /><br /> Password: <input
			type="password" name="password"><br /> MobileNumber: <input
			type="number" name="mobileNumber"><br /> city: <input
			type="text" name="city" /><br /> Age: <input type="number" name="age" /><br />
		EmailId: <input type="text" name="emailid" /><br /> <input
			type="submit" value="Submit" /><br /> <a
			href="http://localhost:8080/RecommendationEngine/">Back</a>
	</form>
</body>
</html>
