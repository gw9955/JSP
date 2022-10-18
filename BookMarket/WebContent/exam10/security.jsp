<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>10장 5번</title>
</head>
<body>
	<p>
		<%=request.isUserInRole("admin")%>
		<% 
			if(request.isUserInRole("admin")){
				response.sendRedirect("sucess.jsp");
			}
		%>
	</p>
	
</body>
</html>