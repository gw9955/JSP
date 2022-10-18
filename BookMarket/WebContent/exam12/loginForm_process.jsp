<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>12장 4번</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
	
	if(id.equals("admin") && passwd.equals("admin1234"))
	{
	%>
	<p>로그인성공</p>
	<%
	}else{
	
	%>
	<p>로그인실패</p>
	<% 
	}
	%>
	
</body>
</html>