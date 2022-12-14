<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
   1. 파일 업로드를 위한 form 태그 내에 반드시 설정해야 하는 기법은 무엇인가?<br>
   - form 태그의 method 속성은 반드시 POST 방식으로 설정해야 합니다.<br>
   - form 태그의 enctype 속성은 반드시 multipart/form-data로 설정해야 합니다.<br>
   - form 태그의 action 속성은 파일 업로드를 처리할 JSP 파일로 설정해야 합니다.<br>
   - 파일 업로드를 위해 input 태그의 type 속성을 file로 설정해야 합니다.<br>
   	  만약 여러 파일을 업로드하려면 2개 이상의 input 태그를 사용하고 name 속성에 서로 다른 값을 설정합니다.<br>
   <hr />
   2. 파일을 서버에 업로드하는 처리 기법에 대해 간단히 설명하시오<br>
   - MultipartRequest를 이용한 파일 업로드<br>
    MultipartRequest 클래스를 이용하여 파일을 업로드하려면 먼저 MultipartRequest 객체를 생성합니다.<br>
        그리고 생성된 객체를 통해 MultipartRequest 클래스가 제공하는 메소드를 사용하여<br>
        웹 브라우저가 전송한 multipart/form-data 유형의 요청 파라미터를 읽어오고 파일을 업로드합니다.<br>
   - Commons-FileUpload를 이용한 파일 업로드<br>
    Commons-FileUpload를 이용하여 파일을 업로드하려면 먼저 Commons-FileUpload 패키지<br>
	에 포함되어 있는 DiskFileUpload 객체를 생성합니다. 생성된 객체를 통해 DiskFileUpload <br>
	클래스가 제공하는 메소드를 사용하여 웹 브라우저가 전송한 multipart/form-data 유형의<br>
	요청 파라미터를 가져옵니다. 그리고 FileItem 클래스의 메소드를 사용하여 요청 파라미터가 일반 데이터인지 파일인지 분석 및 처리하여 파일을 업로드합니다.<br>
   <hr />
</body>
</html>