<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
// 	console.log('kimi');
	
	function clearSession(){
// 		console.log('ralf');
		
		var xhr=new XMLHttpRequest();
		xhr.onreadystatechange=function(){
			if(this.readyState==4 && this.status==200){
				console.log('ajax');
				console.log(xhr.responseText);
				console.log(xhr.response);
				location.replace('sign');
			}
		}
		xhr.open('GET','clearSession',true);
		xhr.send();
	}
</script>
</head>
<body>
	<h1>Login</h1>
	<c:if test="${not empty name}" scope="session" var="login">
		<h1>Already Logged In!</h1>
	</c:if>
	<form action="valid" method="get">
		Name: <input type="text" name="name"><br>
		Number: <input type="number" name="num"><br>
		<input type="submit" value="ok">
	</form>
	<br>
	<c:if test="${login}">
		<button id="cs" onclick="clearSession()">Clear Session</button>
	</c:if>
</body>
</html>