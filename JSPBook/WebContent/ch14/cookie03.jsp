<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Cookie</title>
</head>
<body>
	<%	// 스크립틀릿
		// 요청 시 마다 쿠키를 함께 보낸다. 쿠키는 request 객체에 담겨있다
		Cookie[] cookies = request.getCookies();
		
		for(int i=0; i<cookies.length; i++) {
			// 모든 쿠키 삭제
			// 쿠키는 invalidate() 메소드가 없다 => 유효시간을 0으로 설정
			cookies[i].setMaxAge(0);	// 서버에서 변경
			response.addCookie(cookies[i]);	// 클라이언트로 응답
		}
		response.sendRedirect("cookie02.jsp");
	%>
</body>
</html>