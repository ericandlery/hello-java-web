<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validator1</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.5/angular.js"></script>
</head>
<body ng-app="">
	<form name="form">
		<input type="email" name="em" ng-model="errMsg">
		<span style="background-color: aqua;" ng-show="form.em.$error.email">Angular Validator Enforced!</span>
		<br>
		<input type="submit" value="OK">
	</form>
</body>
</html>