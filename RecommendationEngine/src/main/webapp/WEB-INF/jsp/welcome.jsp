<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="resources/css/style2.css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search</title>
</head>
<body>
<div class="banner animated tada">
<h3 class="big-text animated tada">Recommendation Engine</h3>
	<h3 class="small-text">Welcome ${name}</h3>
</div>
	<br>
	<br>
	<form action="getDataByLocation" method="post">

		<p>
			<input id="keyword" name="keyword" required="required" type="text"
				placeholder="enter city" />
		</p>

		<input type="submit" value="Locate" /> <input type="submit"
			value="Find" onclick="form.action='getDataByKeyword';" />
	</form>
	<br>
	<%--
	<br>
	<form action="getDataByKeyword" method="post">

		<p>
			<input id="keyword" name="keyword" required="required" type="text"
				placeholder="enter your intrest" />
		</p>
		<input type="submit" value="Find" />
	</form>
	--%>
	<br>
	<br>

	<a href="http://localhost:8080/RecommendationEngine/">Back</a>

</body>
</html>