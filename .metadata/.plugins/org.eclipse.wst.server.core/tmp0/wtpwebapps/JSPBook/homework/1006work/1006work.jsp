<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
   1. 유효성 검사란 무엇인가?<br>
   - 유효성 검사는 사용자가 폼 페이지<form...>...</form>에서 입력한 데이터 값(name=“..”)이 서버(톰캣)<br>
	  로 전송(요청)되기 전에 특정 규칙(Regular Expression – RegExp; 이메일 / 주민번호 / 아이디 / 비밀번호 / 전화번호..)<br>
	  에 맞게 입력되었는지 검증(Validation)하는 것을 말합니다.<br>
   <hr />
   2. 유효성 검사를 위한 두 가지 처리 기법을 간단히 설명하시오.<br>
   - 기본 유효성 검사는 사용자가 폼 페이지<form...>...</form>의 입력 항목(name 속성을 갖은 요소(태그))에 입력한 데이터 값이<br>
   	  있는지 없는지(if(대상.value==“”)) 확인하고 데이터 길이(document.폼name.요소name.value.length),<br>
   	  숫자(isNaN(대상)) 등 기본적인 것이 맞는지 검사합니다.<br>
   - 데이터 형식 유효성 검사는 사용자가 폼 페이지<form...>...</form>의 입력 항목(name 속성을 갖은 요소(태그))에 입력한 데이터 값이 특정 형태에 적합한지<br>
          검사하기 위해 정규 표현식(RegExp)을 사용하는 방법으로 기본 유효성 검사보다 복잡합니다.<br>
   - ^(시작), $(종료), +(1이상), *(0이상), x(1,3) : 1~3, //내용//, i : ignore(대소문자 구별x), ?(아몰랑. 있을수도 없을수도 있다)<br>
   <hr />
   3. 유효성 검사를 위한 핸들러 함수와 폼 페이지를 작성하는 기법을 설명하시오.<br>
   - input 태그의 type 속성 값이 button인 경우 onclick 속성을 이용하여 핸들러 함수를 설정합니다. 또는 type 속성 값이 submit인 경우 form 태그의 onsubmit 속성 값에 설정합니다. ( button : onclick / submit : onsubmit)<br>
   - 자바스크립트를 이용하여 스크립트 내에 핸들러 함수를 작성합니다. 스크립트 구문은 JSP 페이지의 어디에 위치해도 괜찮습니다.<br>
   - 폼 페이지<form..>...</form>에서 입력된 데이터 값을 핸들러 함수(onclick=“check()”)로 가져오기 위해 form 태그의 name 속성<br>
   	  또는 forms 객체를 이용합니다. forms 객체를 이용하는 경우, forms 객체는 배열의 형태이기 때문에 length 속성으로 크기를 알 수 있고 배열 값인 index는 form 태그가 나타나는 순서로 0부터 시작합니다.<br>
   <hr />
</body>
</html>