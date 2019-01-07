<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
</head>
<body>
	<h1>Error Page</h1>
	<p><%=exception%></p>
	<p><%exception.printStackTrace();%></p>
	<p><%exception.getMessage();%></p>
</body>
</html>