<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
   1. 시큐리티란 무엇인가?<br>
   - 시큐리티는 허가된 사용자만이 특정 웹 페이지에 접근할 수 있도록 제한하는 보안 기능을말합니다.<br>
   	  시큐리티는 사용자가 권한이 없는 데이터에 접근하는 것을 막거나 웹 공격자가 전송 데이터를 중간에 가로채는 것을 방지하는 등 중요한 역할을 합니다.<br>
   <hr />
   2. 시큐리티의 두 가지 처리 기법에 대해 간단히 설명하시오.<br>
   - 선언적 시큐리티는 웹 애플리케이션 배포 설명자 web.xml 파일에 보안 구성을 작성하여수행하는 방식입니다.<br> 
   	 web.xml 파일에는 보안 역할, 보안 제약 사항, 인증 처리 등을 설정하여 보안을 구성합니다.<br>
   - 프로그래밍적 시큐리티는 웹 애플리케이션의 보안을 위해 코드를 작성하여 사용자의 권한 부여를 처리하는 방식입니다. 선언적 시큐리티의 보안으로 충분하지 않을 때<br>
     request 내장 객체의 메소드를 사용하여 사용자를 승인하는 방법입니다<br>
   <hr />
   3. FORM 기반 인증 처리 기법으로 로그인 페이지를 작성하는 방법을 설명하시오<br>
   - 속성 이름							속성 값<br>
   - form 태그의 action 속성		j_security_check<br>
   - 사용자의 name 속성 			j_username<br>
   - 비밀번호의 name 속성 			j_password<br>
   <hr />
</body>
</html>