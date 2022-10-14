<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
   1. 예외 처리란 무엇인가?<br>
   - 예외 처리는 프로그램이 처리되는 동안 특정한 문제가 발생했을 때 처리를 중단하고 다른처리를 하는 것으로 오류 처리라고도 합니다.<br>
   <hr />
   2. page 디렉티브 태그를 이용한 예외 처리 기법에 사용되는 속성에 대해 설명하시오.<br>
   - errorPage 속성으로 오류 페이지 호출하기: errorPage 속성은 오류 페이지를 호출하는<br>
	 page 디렉티브 태그의 속성으로 형식은 다음과 같습니다.<br>
<%-- 	 <%@ page errorPage = "오류 페이지 URL" %> --%>
   - isErrorPage 속성으로 오류 페이지 만들기: isErrorPage 속성은 현재 JSP 페이지를 오류 페이지로<br>
   	  호출하는 page 디렉티브 태그의 속성으로 형식은 다음과 같습니다<br>
<%--    	 <%@ page isErrorPage = "true" %> --%>
   <hr />
   3. web.xml 파일을 이용한 예외 처리 기법에 대해 설명하시오.<br>
   - 오류 코드로 오류 페이지 호출하기<br>
<!--    	 <error-page><br> -->
<!-- 	 <error-code>오류 코드</error-code><br> -->
<!-- 	 <location>오류 페이지의 URI</location><br> -->
<!-- 	 </error-page><br> -->
   - 예외 유형으로 오류 페이지 호출하기<br>
<!--    	 <error-page><br> -->
<!-- 	 <exception-type>예외 유형</exception-type><br> -->
<!-- 	 <location>오류 페이지의 URI</location><br> -->
<!-- 	 </error-page><br> -->
   <hr />
</body>
</html>