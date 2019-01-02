<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Module 2</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.5/angular.js"></script>
<script type="text/javascript">
	window.onload=function(){
		var a=document.getElementById('s');
		console.log(a);
	}

	var app=angular.module('myApp',[]);
// 	app.directive('dirRect',function(){
// 		return{
// 			template:'HaHaHa'
// 		};
// 	});
	
	app.controller('myCon',function($scope){
		$scope.par='Kimi';
	});
</script>
</head>
<body>
	<div ng-app="myApp" dir-rect ng-controller="myCon" ng-model="op='Ralf'" ng-init="array=['Tiger','Arnold','Jack','Ben']">
		<h1>{{par}}</h1>
		<h2>{{op}}</h2>
		<hr>
		<select id="s" name="{{op}}">
			<option ng-repeat="x in array" value="{{x}}">{{x}}</option>
		</select>
	</div>
</body>
</html>