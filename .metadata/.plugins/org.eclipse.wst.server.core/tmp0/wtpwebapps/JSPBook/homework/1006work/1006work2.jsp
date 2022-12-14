<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Validation-RegExp</title>
<script type="text/javascript">
	function checkMember() {
		let regExpId = /^[a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/; // 영문 대문자/소문자, 한글, 한글의 자음과 모음만 가능
		let regExpPasswd = /(\w)\1\1/; // 비밀번호는 숫자만 사용 가능
		// 폼 object
		let form = document.Member;
		
		let id = form.id.value; // 아이디. 문자형
		let passwd = form.passwd.value; // 비밀번호
		let ckpasswd = form.ckpasswd.value; // 비밀번호확인
		
		// Regular Expression의 메소드 중 test() => boolean으로 리턴
		// 아이디 체크. !regExpId.test(id) : false(통과 못함)
		if(!regExpId.test(id)) {
			alert("아이디는 문자로 시작해주세요!");
			form.id.select();	//focus()
			return; // return : J/S 종료
		}
		// 비밀번호 체크
		if (!regExpPasswd.test(passwd)) {
			alert("영문, 숫자는 3자 이상 연속 입력할 수 없습니다.");
			return;
		}
		// 비밀번호 체크
		if (passwd!=ckpasswd) {
			alert("동일한 비밀번호를 적어주세요!");
			return;
		}
		form.submit();
	}
</script>
</head>
<body>
	<h3>회원 가입</h3>
	<form name="Member" method="post" action="1006work2_1.jsp">
		<p>아이디 : <input type="text" name="id" /></p>
		<p>비밀번호 : <input type="password" name="passwd" /></p>
		<p>비밀번호 확인 : <input type="password" name="ckpasswd" /></p>
		<p><input type="button" value="전송" onclick="checkMember()" /></p>
	</form>
</body>
</html>