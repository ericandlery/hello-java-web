<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Module3</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.5/angular.js"></script>
<script type="text/javascript">
	var a=angular.module('myApp',[]);
	a.directive('wwwPlay',function(){
		return{
			restrict:'M',
			replace:true,
			template:'<h1>Kimi Mika</h1>'
		};
	});
</script>
</head>
<body>
<!-- 	<div ng-app="myApp" class="www-play"> -->
<!-- 	</div> -->
	<hr>
	<div ng-app="myApp">
	<!-- directive:www-play -->
	</div>
</body>
</html>