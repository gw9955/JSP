<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>exam08 5번</title>
<script type="text/javascript">
	function logincheck(){
		// form = > objet
		
		let form = document.loginForm;
		let passwd = form.passwd.value;
		let passwd2 = form.passwd2.value;
		let regExpPasswd=/^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,}$/;
		
			if(form.id.value == ""){
				alert("아이디를 입력해주세요");
				return false;
			}
			if(form.passwd.value == ""){
				alert("비밀번호를 입력해주세요");
				return false;
			}
			
			if(passwd!=passwd2){
				alert("비밀번호를 다시확인")		
				return false;
			}
			
			// \d : 숫자를 찾음
			// \D : 숫자가 아닌 갓을 찾음
			// \w : 알파벳 + 숫자 + _를 찾음
			// \W : 알파벳 + 숫자 + _를 제외한 모든 문자를 찾음
			if(/(\w)\1\1/.test(passwd)){
				alert("영문, 숫자는 3자 이상 연속 입력이 불가능합니다.")
				form.passwd.focus();
				return false;
			}
			
			if(!regExpPasswd.test(passwd)){
				alert("영문+숫자+특수기호 8자리 이상으로 비밀번호를 입력해주세요");
				return false;
			}
		form.submit();
	}
		
</script>
</head>
<body>
	<form name="loginForm" action="validation03_process.jsp"  method="post">
		<p>아이디: <input type="text" name="id"/></p>
		<p>비밀번호: <input type="text" name="passwd"/></p>
		<p>비밀번호 확인: <input type="text" name="passwd2"></p>	
		<p><input type="button" value="전송" onclick="logincheck()"/> </p>
	</form>	

</body>
</html>