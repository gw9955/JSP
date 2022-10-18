<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page errorPage="exception_error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>11장 5번 문제</title>
</head>
<body>
	<% // 스크립틀릿
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		if(id.equals("") || passwd.equals("")){
		    throw new ServletException("");
		}else{
		%>
			
			<p> 아이디 : <%=id %>
			<p> 비밀번호 : <%=passwd %>
			
		<%
		}
		
	%>
</body>
</html>