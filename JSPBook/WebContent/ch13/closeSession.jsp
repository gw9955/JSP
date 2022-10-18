<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	// 세션을 종료
	// 기존 session 객체가 제거된다
	// 다음 요청에서 새로운 session 기본 객체를 생성한다
	session.invalidate();
	
%>
<!DOCTYPE html>
<html>
<head>
<title>Session</title>
</head>
<body>
세션을 종료하였습니다.<br />

</body>
</html>