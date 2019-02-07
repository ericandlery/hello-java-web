<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Form Validation</h1>
<!-- 	<form action="formValid" method="post"> -->
	<s:form action="formValid" method="post" class="controller.action.FormValidationAction">
<!-- 		Text: <input type="text" name="text"><br> -->
		<s:textfield type="text" name="text" label="Text: "/><br>
<!-- 		<input type="submit" value="ok"> -->
		<s:submit value="ok"/>
		<input hidden name="type" value="form">
	</s:form>
<!-- 	</form> -->
</body>
</html>