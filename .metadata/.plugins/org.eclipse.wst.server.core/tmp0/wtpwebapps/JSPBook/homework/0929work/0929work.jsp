<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
   1. 폼 페이지에서 입력된 데이터를 전달하는 요청 파라미터 값을 JSP 페이지로 가져오는 내장 객체는 무엇인지, 그리고 관련된 메소드에 대해 간단히 설명하시오.<br>
   - request 내장 객체
	 1) 요청 파라미터 관련 메소드	||			반환유형		||		설명<br>
   - getParameter(String name) 			String : 		요청 파라미터 이름이 name인 값을 전달받습니다. 요청 파라미터 값이 없으면 null을 반환합니다.<br> 
   - getParameterValues(String name) 	String[] : 		모든 요청 파라미터 이름이 name인 값을 배열 형태로 전달받습니다. 요청 파라미터 값이 없으면 null을 반환합니다.<br>
   - getParameterNames() 		java.util.Enumeration : 모든 요청 파라미터의 이름과 값을 Enumeration 객체 타입으로 전달받습니다.<br>
   - getParameterMap() 				ava.util.Map : 		모든 요청 파라미터의 이름과 값을 Map 객체 타입으로 전달받습니다[Map 객체 타입은 (요청 파라미터 이름, 값) 형식으로구성됩니다].<br>
   <hr />
   2. 서버에서 웹 브라우저에 다른 페이지로 강제 이동하도록 명령하는 내장 객체와 관련된 메소드는 무엇인가?
   - response 내장 객체
   - 1) 페이지 이동 관련 메소드		반환 유형				설명
   - sendRedirect(String url)	void		설정한 URL 페이지로 강제 이동합니다.
   <hr />
   3. 스크립트 태그의 표현문과 같이 데이터를 출력하는 내장 객체는 무엇인가?
   - out 내장 객체
   <hr />
</body>
</html>