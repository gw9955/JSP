<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>11장 7번 문제</title>
<link rel="stylesheet" 
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<!-- 내용 들어온다 -->
		<div class="container">
			<h1 class="alert alert-danger">해당 도서가 존재하지 않습니다.</h1>
		</div>
	</div>
	<div class="container">
		<p><%=request.getRequestURI() %>?<%=request.getQueryString()%></p>
		<p><a href="products.jsp" class="btn btn-secondary">상품목록&raquo;</a></p>
		<%--<h3><%@ include file="date.jsp" %></h3>--%>
	</div>
	
	<jsp:include page="footer.jsp" />
</body>
</html>