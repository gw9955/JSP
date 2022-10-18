<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>exam08.4번</title>
</head>
<body>
	<h3>입력에 성공하셨습니다.</h3>
	<%
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
	%>
	
	<p>아이디 : <%=id %></p>
	<p>비밀번호 : <%=passwd %></p>
</body>
</html>