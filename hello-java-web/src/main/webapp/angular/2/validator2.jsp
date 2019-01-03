<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validator2</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.5/angular.js"></script>
</head>
<body ng-app="" ng-init="default='abc@efg.com'">
	<form name="form">
		<input type="email" ng-model="default" name="in">
		<hr>
		<input type="submit" value="ok">
		<hr>
		<h6>Valid: {{form.in.$valid}}</h6>
		<h6>Dirty: {{form.in.$dirty}}</h6>
		<h6>Touched: {{form.in.$touched}}</h6>
		<hr>
		<h3 ng-show="form.in.$valid">Valid</h3>
	</form>
</body>
</html>