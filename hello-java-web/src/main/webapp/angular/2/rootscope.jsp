<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Root Scope</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.5/angular.js"></script>
<script type="text/javascript">
	var a=angular.module('app',[]);
	a.run(function($rootScope){
		$rootScope.car='MP4-17';
	});
	a.controller('con',function($scope){
		$scope.car='F2002';
// 		$rootScope='FW27';
	});
</script>
</head>
<body ng-app="app">
	<h1 ng-bind="car"></h1>
	<div ng-controller="con">
		<h1 ng-bind="car"></h1>
	</div>
</body>
</html>