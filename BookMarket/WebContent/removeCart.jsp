<%@page import="java.util.ArrayList"%>
<%@page import="dto.*"%>
<%@page import="dao.*"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%	// 스크립틀릿
	// removeCart.jsp?id=P1234
	String id = request.getParameter("id");
	
	// 만약, removeCart.jsp 또는 removeCart.jsp?id=Z1234
	// 1) removeCart.jsp 처리
	if(id==null || id.trim().equals("")) {
		response.sendRedirect("products.jsp");
		return;
	}
	
	// 상품 저장소 클래스(ProductRepository) => 싱글톤 객체 생성(메모리에 1회 생성. 공유해서 사용)
	BookRepository dao = BookRepository.getInstance();
	// 2) 상품검색메소드(select * from product where id='Z1234')
	BookVO product = dao.getBookById(id);
	if(product == null) {
		response.sendRedirect("exceptionNoProductId.jsp");
		return;
	}
	
	// 장바구니(세션)안에 P1234 상품이 있는지 체크한 후
	// 만약 있다면 장바구니에서 제외 처리
	ArrayList<BookVO> cartlist 
		= (ArrayList<BookVO>)session.getAttribute("cartlist");
	
	for(int i=0; i<cartlist.size(); i++) {
		// cartlist.get(i).getProductId() => 장바구니 안에 있는 상품의 기본키
		// "P1234".equals("P1234")
		if(cartlist.get(i).getBookId().equals(id)) {
			// remove(Object)
			cartlist.remove(cartlist.get(i));
		}
	}
	
	// 장바구니를 확인해보자
// 	for(ProductVO vo : cartlist) {
// 		out.println("<p>vo : " + vo.toString() + "</p>");
// 	}
	
	response.sendRedirect("cart.jsp");
%>