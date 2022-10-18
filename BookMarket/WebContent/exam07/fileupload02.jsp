<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>exam07_04</title>
</head>
<body>
	<form action="fileupload02_process.jsp" method="post" enctype="multipart/form-data">
		<p>파일: <input type="file" name="filename" /></p>
		<p><input type ="submit" value="파일올리기"/> </p>
	</form>
</body>
</html>