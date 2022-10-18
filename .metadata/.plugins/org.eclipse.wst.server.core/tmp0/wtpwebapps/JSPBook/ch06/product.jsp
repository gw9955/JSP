<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="ch04.vo.ProductVO"%>
<%@ page import="java.util.List"%>
<%@ page import="ch04.dao.ProductRepository"%>
<%@ page errorPage="exceptionNoProductId.jsp"%>
<!-- 상품 아이디가 없을 떄 exceptionNoProductId.jsp를 요청 -->
<!DOCTYPE html>
<%
	// 스크립틀릿 태그
	String id = request.getParameter("id").toString();
	ProductRepository productRepository = ProductRepository.getInstance();
	// 상세보기 => 1행(ProductVO)을 리턴
	// SELECT * FROM PRODUCT WHERE PRODUCT_ID = 'P1235'
	ProductVO productVO = productRepository.getProductById(id);
%>
<c:set var="productVO" value="<%=productVO%>" scope="page" />
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>상품 상세 정보</title>
<script type="text/javascript">
	// 핸들러 함수(상품 주문 버튼 클릭 시 실행)
	function addToCart() {
		console.log("왔다");
		let result = confirm("상품을 장바구니에 추가하시겠습니까?");
		
		if(result) {
			console.log("true");
			document.addForm.submit();
		} else {
			console.log("false");
			document.addForm.reset();
		}
	}
</script>
</head>
<body>
	<fmt:setLocale value="${param.language }" />
	<fmt:bundle basename="bundle.message">
	<!-- 머리글에 해당하는 menu.jsp 파일의 내용을 포함하도록
	include 액션 태그를 작성 -->
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<!-- 내용 들어온다 -->
		<div class="container">
			<h1 class="display-3">
				<fmt:message key="title" />
			</h1>
		</div>
	</div>
	<!-- =========== 상품 상세 시작 ============ -->
	<div class="container">
		<div class="text-right">
			<a href="?id=${param.id}&language=ko">Korea</a>|<a href="?id=${param.id}&language=en">English</a>
		</div>
		<div class="row" align="center">
			<div class="col-md-6">
				<h3>${productVO.pname}</h3>
				<p>${productVO.description}</p>
				<p>
					<b><fmt:message key="productId" /> : </b>
					<span class="badge badge-danger">${productVO.productId}</span>
				</p>
				<p><b><fmt:message key="manufacturer" /></b> : ${productVO.manufacturer}</p>
				<p><b><fmt:message key="category" /></b> : ${productVO.category}</p>
				<p><b><fmt:message key="unitsInStock" /></b> : ${productVO.unitsInStock}</p>
				<h4>${productVO.unitPrice}원</h4>
				<p>
				<form name="addForm" action="addCart.jsp?id=${productVO.productId}" method="post">
					<!-- 상품 주문 -> 상품을 장바구니에 넣음 -->
					<a href="#" class="btn btn-info" onclick="addToCart()"><fmt:message key="productOrder" />&raquo;</a>
					<!-- 장바구니에 넣어진 상품 목록을 본다 -->
					<a href="cart.jsp" class="btn btn-warning">장바구니 &raquo;</a>
					<!-- 등록된 상품 목록을 본다 -->
					<a href="products.jsp" class="btn btn-secondary"><fmt:message key="productList" />&raquo;</a>
				</form>
				</p>
			</div>
		</div>
	</div>
	<!-- =========== 상품 상세 끝 ============ -->
	<jsp:include page="footer.jsp" />
	</fmt:bundle>
</body>
</html>