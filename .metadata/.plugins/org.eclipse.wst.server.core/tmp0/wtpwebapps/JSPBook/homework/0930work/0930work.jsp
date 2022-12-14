<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
   1. form 태그에 사용하는 속성에 대해 간단히 설명하시오.<br>
   - action		폼 데이터를 받아 처리하는 웹 페이지의 URL을 설정합니다.<br>
   				생략 시 현재 URL을 요청
   - method		폼 데이터가 전송되는 HTTP 방식을 설정합니다.<br>
   				생략 시 GET
   - name		폼을 식별하기 위한 이름을 설정합니다.<br>
   				하나의 JSP에 여러 개의 form을 사용 시
   - target		폼 처리 결과의 응답을 실행할 프레임을 설정합니다.<br>
   - enctype	폼을 전송하는 콘텐츠 MIME 유형을 설정합니다.<br>
   				fileupload시 필수
   				enctype=multipart/form-data => MultipartFile[]로 받음
   - accept-charset		폼 전송에 사용할 문자 인코딩을 설정합니다.<br>
   <hr />
   2. form 태그 내에 중첩하여 사용하는 태그를 나열하고 설명하시오.<br>
   - input 태그<br>
    1) input 태그는 사용자가 텍스트 입력이나 선택 등을 다양하게 할 수 있도록 공간을 만드는태그로,<br>
    	 종료 태그 없이 단독으로 사용할 수 있습니다.<br>
    	 type="text" / type="button" / type="submit"
   - select 태그<br>
    1) select 태그는 여러 개의 항목이 나타나는 목록 상자에서 항목을 선택하는 태그입니다.<br>
		시작 태그와 종료 태그가 있으며, 리스트 박스에 여러 항목을 추가 삽입하기 위해 반드시<br>
		option 태그를 포함해야 합니다.<br>
		selected
   - textarea 태그<br>
    1) textarea 태그는 여러 줄의 텍스트를 입력할 수 있는 태그입니다. 가장 큰 특징은 입력 폼<br>
		안에 사용된 태그와 띄어쓰기가 그대로 출력된다는 것입니다.<br>
		cols/
   <hr />
   3. 폼 페이지에서 전송된 데이터를 전달받는 내장 객체와 관련된 메소드는 무엇인가?<br>
   - request 내장 객체<br>
    1) 요청 파라미터의 값 받기 : getParameter(요청 파라미터 이름), getParameterValues<br>
	2) 요청 파라미터의 전체 값 받기<br>
		메소드						형식						설명<br>
	getParameterNames()		java.util.Enumeration		모든 입력 양식의 요청 파라미터 이름을 순서에 상관없이 Enumeration(열거형) 형태로 전달받습니다.<br>
	hasMoreElements()					Enumeration(열거형)요소가 있으면 true를 반환하고, 그렇지 않으면false를 반환합니다.<br>
	nextElement()							Enumeration(열거형)요소를 반환합니다.<br>
   <hr />
</body>
</html>