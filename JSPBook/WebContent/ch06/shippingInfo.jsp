<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/resources/css/bootstrap.min.css">
<title>배송 정보</title>
</head>
<body>
	<!-- 머리글에 해당하는 menu.jsp 파일의 내용을 포함하도록
	include 액션 태그를 작성 -->
	<jsp:include page="menu.jsp" />
	
	<div class="jumbotorn">
		<!-- container : 이 안에 내용이 있다 -->
		<div class="container">
			<h1 class="display-3">배송 정보</h1>
		</div>
	</div>
	
	<!-- -----------------------배송 정보 시작----------------------- -->
	<!-- http://localhost/ch06/shippingInfo.jsp?cartId=75C815E68D27E406DD4FE5D242C3909D -->
	
	<!-- -----------------------배송 정보 끝------------------------ -->
	
	<!-- 끝맺음 -->
	<jsp:include page="footer.jsp" />
</body>
</html>