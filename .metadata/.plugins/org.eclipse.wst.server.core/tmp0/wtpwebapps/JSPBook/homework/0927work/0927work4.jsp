<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="k" begin="0" end="10" step="2">
			<c:out value="${k}"></c:out>
	</c:forEach>
</body>
</html>