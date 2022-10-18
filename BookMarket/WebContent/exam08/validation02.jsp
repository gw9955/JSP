<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>exam08 5번</title>
<script type="text/javascript">
	function checkLogin () {
		// form = > objet
		let form = document.loginForm;
		let passwd = form.passwd.value;
		let passwd2 = form.passwd2.value;
		
		if(form.id.value == ""){
			alert("아이디를 입력해주세요");
			return false;
		}else if(form.passwd.value == ""){
			alert("비밀번호를 입력해주세요");
			return false;
		}
		
		if(passwd!=passwd2){
			alert("비밀번호를 다시확인")		
			return false;
		}
		
		if(/(\w)\1\1/.test(passwd)){
			alert("영문, 숫자는 3자 이상 연속 입력이 불가능합니다.")
			form.passwd.focus();
			return false;
		}
		form.submit();
	}
		


</script>
</head>
<body>
	<form name="loginForm" action="validation02_process.jsp"  method="post">
		<p>아이디: <input type="text" name="id"></p>
		<p>비밀번호: <input type="text" name="passwd"></p>
		<p>비밀번호 확인: <input type="text" name="passwd2"></p>
		
		<p><input type="button" value="전송" onclick="checkLogin()"/> </p>
	
	</form>	

</body>
</html>