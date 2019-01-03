<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Controller1</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.5/angular.js"></script>
<script type="text/javascript">
	var app=angular.module('app',[]);
	app.controller('con',function($scope){
		$scope.name='Kimi';
		$scope.change=function(){
			$scope.name='Ralf';
		}
	});
	
	app.controller('con2',function($scope){
		$scope.team='McLaren';
	});
</script>
</head>
<body ng-app="app">
	<div ng-controller="con">
		<input type="text" ng-model="name">
		<br>
		<h1 ng-bind="name" ng-click="change()"></h1>
	</div>
	<hr>
	<div ng-controller="con2">
		<h1 ng-bind="team"></h1>
	</div>
</body>
</html>