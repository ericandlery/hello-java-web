<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Angular with JSP</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.5/angular.js"></script>
</head>
<body ng-app="">
	<input type="text" ng-model="body"><hr>
	<h1 ng-bind="body"></h1>
	<hr>
	Textarea: <textarea rows="" cols="" ng-model="ta"></textarea><br>
	<input type="text" ng-bind="ta">
	<span ng-bind="ta"></span>
</body>
</html>