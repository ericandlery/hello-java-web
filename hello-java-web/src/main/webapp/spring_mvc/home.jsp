<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Home</title>
</head>
<body>
	<h1>Spring Web MVC Home</h1>
	<a href="hello.sp">Hello</a>
	<br>
	<form action="post.sp?pos=kimi" method="post">
		<input type="submit" value="POST">
	</form>
	<hr>
	<h3>Model and View Test</h3>
	<a href="golf.sp">mav</a>
	<hr>
	<a href="redirect.sp">Redirect</a>
</body>
</html>