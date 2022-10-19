<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Cookie</title>
</head>
<body>
	<%	// 스크립틀릿
		// cookie01_process.jsp?id=admin&passwd=1234
		String user_id = request.getParameter("id");
		String user_pw = request.getParameter("passwd");
		
		// 아이디가 admin, 비밀번호가 1234라면
		if(user_id.equals("admin")&&user_pw.equals("1234")) {
			// Cookie 객체 생성
			// name은 userID, value는 admin
			Cookie cookie_id = new Cookie("userID", user_id);
			// name은 userPW, value는 1234
			Cookie cookie_pw = new Cookie("userPW", user_pw);
			// response 내장 객체를 통해 쿠키를 리턴받는다
			response.addCookie(cookie_id);
			response.addCookie(cookie_pw);
			out.println(user_id + "프로! 식사는 잡쉈어?");
			out.println("<a href='cookieout.jsp'>로그아웃</a>");
		} else {
			out.println("쿠기 설정 실패!");
		}
	%>
</body>
</html>