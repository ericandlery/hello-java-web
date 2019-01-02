<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Module</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.5/angular.js"></script>
<script type="text/javascript">
	var app=angular.module('hi',[]);
	app.controller('ctr',function($scope){
		$scope.fn='Kimi';
		$scope.ln='Raikkonen';
	});
	
	app.directive('w3Ddt',function(){
		return{
			template:'hello ang<h1>AAAGGG</h1>'
		};
	});
</script>
</head>
<body>
	<h1>Module</h1>
	<div ng-app="hi" ng-controller="ctr" w3-ddt>
		<h4>{{fn+' '+ln}}</h4>
	</div>
	<hr>
	<!-- Second one doesn't work. -->
	<div ng-app="h2" ng-controller='c2'>
		<h5>{{a2}}</h5>
	</div>
	
	<script type="text/javascript">
		var ap2=angular.module('h2',[]);
		ap2.controller('c2',function($scope){
			$scope.a2='5577arm';
		});
	</script>
	
</body>
</html>