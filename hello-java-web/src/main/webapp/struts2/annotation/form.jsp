<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Annotations</title>
</head>
<body>
	<s:form>
		<s:textfield type="text" name="team" label="Team: "/>
		<s:textfield type="date" name="date" label="Date: "/>
		<s:submit label="OK"/>
	</s:form>
</body>
</html>