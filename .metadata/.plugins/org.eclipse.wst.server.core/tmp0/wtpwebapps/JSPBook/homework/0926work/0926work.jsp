<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
   1. 스크립트 태그의 세가지 종류에 대해 간단히 설명하시오.<br>
   - 선언문 <%!  %> :  변수와 메소드 정의<br> 
   - 스크립틀릿 <%  %> : 자바 로직 코드 작성<br>
   - 표현문 <%=  %> : 선언문의 메소드를 호출하여 문자열 형태로 출력<br>
   <hr />
   2. 선언문 태그와 스크립틀릿 태그의 차이점.
   - 선언문 태그는 전역변수이고 스크립틀릿 태그는 지역변수.
   <hr />
   3. 애플리케이션 실행 결과에는 보이지 않는 JSP 주석 표기   법은 무엇인가?
   - <!--  --> 사이에 넣는다
   <hr />
   <%! 
      String a = "Hello. Java Server Pages";
   
      public String getString(String data){
         return data;
      }
   %>
   <%
      out.println(a);
   %>
</body>
</html>