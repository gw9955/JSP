<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>10장 5번 숙제</title>
</head>
<body>
	<form name="loginForm" action="j_security_check" method="post">
		<p>ID : <input type="text" name="j_username" /></p>
		<p>비밀번호 : <input type="password" name="j_password" /></p>
		<p><input type="submit" name="로그인" /></p>
	</form>
</body>
</html>