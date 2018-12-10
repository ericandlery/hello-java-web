<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Model and View Test</title>
<script type="text/javascript">
	window.onload=function(){
		var yards=document.getElementById('hid').textContent;
		if('false'===yards){
			var text=document.getElementById('text');
			text.style.visibility="visible";
		}
	}
</script>
</head>
<body>
	<h1>Model and View Test</h1>
	<form:form action="calcYard.sp" method="get">
		<table border="5px solid black">
			<tr>
				<td>Name: </td>
				<td><input type="text" value="${golfBean.name}" name="name"></td>
			</tr>
			<tr>
				<td>Power: </td>
				<td><input type="number" value="${param.power}" name="power"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="OK"></td>
			</tr>
		</table>
	</form:form>
	<h1 id="text" style="visibility: hidden;">${golfBean.name}擊出了${yards}碼的距離！</h1>
	<span hidden id="hid">${empty yards}</span>
</body>
</html>