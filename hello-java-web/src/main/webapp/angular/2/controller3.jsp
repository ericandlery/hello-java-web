<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Controller3</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.5/angular.js"></script>
<script type="text/javascript">
	var ap=angular.module('app',[]);
	ap.controller('con',function($scope){
// 		$scope.names=['kimi','ralf','mika'];
		$scope.names=[{xxx:'orlando'},{xxx:'tiger'}];
	});
</script>
</head>
<body ng-app="app">
	<div ng-controller="con">
		<input type="text" ng-model="n1">
		<input type="text" ng-model="n2">
		<hr>
		<select>
			<option ng-repeat="x in names">{{x.xxx}}</option>
		</select>
	</div>
</body>
</html>