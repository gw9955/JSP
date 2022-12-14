<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
   1. 다국어란 무엇인가?<br>
   - 다국어 처리는 웹 브라우저를 사용하는 국가에 따라 다양한 언어 및 지역을 지원하는 서비스를 말합니다.<br>
   - 지역화는 사용 국가별 환경에서 특정 언어와 지역에 맞게 적합화하는 것으로, 줄여서L10n으로 표기하기도 합니다.<br>
   - 국제화는 여러 국가에서 사용할 수 있도록 다국어를 지원하는 것으로, 줄여서 i18n으로 표기하기도 합니다. 국제화는 어느 국가에서나 사용할 수 있게 하는 지역화 기능을 포함합니다.<br>
   <hr />
   2. Locale 클래스를 이용한 다국어 처리 기법에서 현재 웹 브라우저에 미리 정의된 언어나 국가 정보를 가져오는 request 내장 객체의 메소드는 무엇인가?<br>
   - request.getLocale()<br>
   <hr />
   3. 다국어 처리를 위한 JSTL fmt 태그의 종류에 대해 설명하시오.<br>
   - 구분						태그 유형							설명<br>
   - Locale 설정			setLocale, requestEncoding		로케일을 설정합니다, 요청 파라미터의 문자 인코딩을 설정합니다. <br>
   - 메시지 처리 			bundle, message, setBundle		사용할 리소스번들을 설정합니다, 리소스번들에서 로케일에 맞는 메시지를 가져와 출력합니다, 리소스번들을 읽어와 특정 변수에 저장합니다.<br>
   - 날짜 				formatDate, parseDate			날짜 형식을 표현합니다, 문자열에서 원하는 패턴의 날짜 형식으로 변환합니다.<br>
   - 숫자 				parseNumber, formatNumber		문자열에서 원하는 패턴의 숫자 형식으로 변환합니다, 숫자 형식을 표현합니다.<br>
   - 시간 				setTimeZone, timeZone			특정 범위의 시간대를 설정합니다, 시간대를 설정합니다.<br>
   <hr />
</body>
</html>