<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
   1. 세션이란 무엇인가?<br>
   - 세션은 클라이언트와 웹 서버 간의 상태를 지속적으로 유지하는 방법을 말합니다.<br>
   	세션은 웹 서버에서만 접근이 가능하므로 보안 유지에 유리하며 데이터를 저장하는 데 한계가 없습니다.<br>
	세션은 오직 웹 서버에 존재하는 객체로 웹 브라우저마다 하나씩 존재하므로 웹서버의 서비스를 제공받는 사용자를 구분하는 단위가 됩니다.<br>
   <hr />
   2. JSP 페이지에 세션을 설정하는 메소드, 설정된 세션을 삭제하는 메소드는 무엇인가?<br>
   - 세션 생성은 session 내장 객체의 setAttribute( ) 메소드를 사용<br>
     void setAttribute(String name, Object value)<br>
   - 세션에 저장된 하나의 세션 속성 이름을 삭제하려면 removeAttribute( ) 메소드를 사용<br>
   	 void removeAttribute(String name)<br>
   <hr />
   3. 설정된 세션 정보를 얻어오는 메소드에 대해 간단히 설명하시오.<br>
   - 세션에 저장된 하나의 세션 속성 이름에 대한 속성 값을 얻어오려면 getAttribute( ) 메소드를 사용<br>
   	 Object getAttribute(String name)<br>
   - 세션에 저장된 여러 개의 세션 속성 이름에 대한 속성 값을 얻어오려면 getAttributeNames( ) 메소드를 사용<br>
   	 Enumeration getAttributeNames();<br>
   <hr />
</body>
</html>