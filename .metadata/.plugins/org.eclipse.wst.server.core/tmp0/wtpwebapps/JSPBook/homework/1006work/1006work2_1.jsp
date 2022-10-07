<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Validation-RegExp</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	%>
	<p>아이디 : <%=request.getParameter("id")%></p>
	<p>비밀번호 : <%=request.getParameter("passwd")%></p>
	<p>비밀번호 확인 : <%=request.getParameter("ckpasswd")%></p>
</body>
</html>