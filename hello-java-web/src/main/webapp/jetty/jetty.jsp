<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jetty JSP Page</title>
</head>
<body>
	<h1>Jetty JSP Page</h1>
	<p><%=new java.util.Date()%></p>
	<c:out value="JSP Succeeds"></c:out>
	<a href="jetty.do">Jetty Servlet</a>
	<p>${pageContext.request.contextPath}</p>
</body>
</html>