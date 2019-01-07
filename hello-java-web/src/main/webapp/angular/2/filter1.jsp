<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Filter 1</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.5/angular.js"></script>
<script type="text/javascript">
	var app=angular.module('myApp',[]);
	console.log(app);
	console.log('app='+app);
	
	app.controller('con',function($scope){
		$scope.hah='doe';
	});
</script>
</head>
<body ng-app="myApp">
	<h1>Filter</h1>
	<div ng-controller="con">
		<input type="text" ng-model="location">
		<p ng-bind="location|uppercase"></p>
		<p>{{location|uppercase}}</p>
		<p>{{location|lowercase}}</p>
		<p>{{hah|uppercase}}</p>
	</div>
</body>
</html>