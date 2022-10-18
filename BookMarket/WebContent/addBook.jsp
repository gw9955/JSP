<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!-- 다국어 처리를 위한 doctype 추가 --> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="dto.BookVO"%>
<%@ page import="java.util.List"%>
<%@ page import="dao.BookRepository"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/resources/css/bootstrap.min.css">
<title>도서 등록</title>
<script type="text/javascript" src="/BookMarket/resources/js/validation.js">

</script>


</head>
<body>
	
	<!-- ?language=ko / ?language=en  -->
	<fmt:setLocale value="${param.language}"/>

	<fmt:bundle basename="bundle.message">
	
   <!-- 머리글에 해당하는 menu.jsp 파일의 내용을 포함하도록
   include 액션 태그를 작성  -->
   <jsp:include page="menu.jsp" />
   <div class="jumbotron">
      <!-- 내용 드루와 -->
      <div class="container">

         <h1 class="display-3"><fmt:message key="title"/></h1>
      </div>
   </div>
   <!-- ============= 도서 등록 시작 ==============  -->
   <div class="container">
  		<div class="text-right">
			<a href="?Language=ko">Korea</a>|<a href="?language=en">English</a>
		</div>
      <form name="newBook" action="processAddBook.jsp"
         class="form-horizontal" method="post" enctype="multipart/form-data">
         <div class="form-group row">
            <label class="col-sm-2"><fmt:message key="bookId"/></label>
            <div class="col-sm-3">
               <input type="text" name="bookId" class="form-control" />
            </div>
         </div>
         <div class="form-group row">
            <label class="col-sm-2"><fmt:message key="name"/></label>
            <div class="col-sm-3">
               <input type="text" name="name" class="form-control" />
            </div>
         </div>
         <div class="form-group row">
            <label class="col-sm-2"><fmt:message key="unitPrice"/></label>
            <div class="col-sm-3">
               <input type="text" name="unitPrice" class="form-control" />
            </div>
         </div>
         <div class="form-group row">
            <label class="col-sm-2"><fmt:message key="author"/></label>
            <div class="col-sm-3">
               <input type="text" name="author" class="form-control" />
            </div>
         </div>
         <div class="form-group row">
            <label class="col-sm-2"><fmt:message key="publisher"/></label>
            <div class="col-sm-3">
               <input type="text" name="publisher" class="form-control" />
            </div>
         </div>
         <div class="form-group row">
            <label class="col-sm-2"><fmt:message key="releaseDate"/></label>
            <div class="col-sm-3">
               <input type="text" name="releaseDate" class="form-control" />
            </div>
         </div>
         <div class="form-group row">
            <label class="col-sm-2"><fmt:message key="totalPages"/></label>
            <div class="col-sm-3">
               <input type="text" name="totalPages" class="form-control" />
            </div>
         </div>
         <div class="form-group row">
            <label class="col-sm-2"><fmt:message key="description"/></label>
            <div class="col-sm-3">
               <textarea name="description" cols="50"
                class="form-control"></textarea>
            </div>
         </div>
               <div class="form-group row">
            <label class="col-sm-2"><fmt:message key="category"/></label>
            <div class="col-sm-3">
               <input type="text" name="category" class="form-control" />
            </div>
         </div>
         <div class="form-group row">
            <label class="col-sm-2"><fmt:message key="unitsInStock"/></label>
            <div class="col-sm-3">
               <input type="text" name="unitsInStock" class="form-control" />
            </div>
         </div>
         <div class="form-group row">
            <label class="col-sm-2"><fmt:message key="condition"/></label>
            <div class="col-sm-5">
               <input type="radio" name="condition" value="New" /><fmt:message key="condition_New"/>
               <input type="radio" name="condition" value="Old" /><fmt:message key="condition_Old"/>
               <input type="radio" name="condition" value="Refurbished" /><fmt:message key="condition_Refurbished"/>
            </div>
         </div>
         <div class="form-group row">
            <label class="col-sm-2"><fmt:message key="bookImage"/></label>
            <div class="col-sm-3">
               <input type="file" name="filename" class="form-control" />
            </div>
         </div>
         <div class="form-group row">
            <div class="col-sm-offset-2 col-sm-10">
               <input type="button" class="btn btn-primary" value="<fmt:message key='button'/>" onclick="checkAddProduct()"/>
               <a href="products.jsp" class="btn btn-primary">도서 목록</a>
            </div>
         </div>
         
      </form>
   </div>   
   <!-- ============= 도서 등록 끝 ===============  -->
   <jsp:include page="footer.jsp" />
   </fmt:bundle>
</body>
</html>   