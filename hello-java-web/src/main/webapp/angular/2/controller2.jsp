<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Controller2</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.5/angular.js"></script>
<script type="text/javascript">
	var app=angular.module('app',[]);
	app.controller('con',function($scope){
		$scope.name='';
		$scope.team='';
		$scope.full=function(){
			return $scope.name+' '+$scope.team;
		};
		$scope.add=function(){
			$scope.yy=5*31;
		}
	});
</script>
</head>
<body ng-app="app">
	<div ng-controller="con">
		<input type="text" ng-model="name"><br>
		<input type="text" ng-model="team">
		<br>
		<h2 ng-bind="full()" ng-click="add()"></h2>
		<br>
		<span ng-bind="yy"></span>
	</div>
</body>
</html>