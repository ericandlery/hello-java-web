<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<s:form action="login" method="get">
		<s:textfield name="name" label="name"/><br>
		<s:textfield type="number" name="num" label="number"/><br>
		<s:submit value="ok"/>
	</s:form>
	<hr>
	<form action="login">
		Name: <input type="text" name="name"><br>
		Number: <input type="number" name="num"><br>
		<input type="submit" value="ok">
	</form>
</body>
</html>