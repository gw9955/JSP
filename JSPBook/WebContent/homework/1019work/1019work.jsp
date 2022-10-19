<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
   1. JSP 페이지에 쿠키를 설정하는 메소드, 설정된 쿠키 정보를 얻어오는 메소드는 무엇인가?<br>
   - 쿠키를 생성하는 데에는 Cookie( ) 메소드를 사용<br>
   	Cookie Cookie(String name, String value)<br>
   	쿠키를 생성한 후에는 반드시 response 내장 객체의 addCookie( ) 메소드로 쿠키를 설정<br>
	생성된 쿠키의 정보를 얻어오려면 request 내장 객체의 getCookie( ) 메소드를 사용하여<br>
	쿠키 객체를 얻어온 후 getName( ), getValue( ) 메소드를 사용하여 쿠키 이름과 값을 얻어옴<br>
   <hr />
   2. 설정된 쿠키를 삭제하는 기법은 무엇인가?<br>
   - setMaxAge( ) 메소드에 유효 기간을 0으로 설정하여 쿠키를 삭제<br>
   <hr />
</body>
</html>