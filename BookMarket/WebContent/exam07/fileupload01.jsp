<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>exam07_3번문제</title>
</head>
<body>
	<form action="fileupload01_process.jsp" method="post" enctype="multipart/form-data">
<!-- 		<p>이름: <input type="text" name="name"/> </p> -->
<!-- 		<p>제목: <input type="text" name="subject"/> </p> -->
		<p>파일:<input type="file" name="filename">  </p>
		<p><input type="submit" value="파일 올리기"> </p>		
	</form>
</body>
</html>