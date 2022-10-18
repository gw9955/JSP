<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<title>11장 문제4번</title>
</head>
<body>
	<h1>오류 발생</h1>
	<table border="1px">
	<tr>
		<td>Error:</td>
		<td><%=exception.toString()%> 오류 발생!!</td>
	</tr>
	<tr>
		<td>URL:</td>
		<td><%=request.getRequestURI() %></td>
	</tr>
	<tr>
		<td>Status code:</td>
		<td><%= response.getStatus() %></td>
	</tr>
	</table>
</body>
</html>