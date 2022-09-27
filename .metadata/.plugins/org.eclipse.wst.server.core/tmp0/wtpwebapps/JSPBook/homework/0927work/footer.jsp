<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<%!   // 선언문 태그
      // 전역 변수
      String greeting = "도서 웹 쇼핑몰";
      String tagline = "Welcome to Web Market!";
   %>
	<div class="jumbotron">
      <div class="container">
         <h1 class="display-1"><%=greeting %></h1>
      </div>
   </div>
   <main role="main">
      <div class="container">
         <div class="text-center">
            <h3><%=tagline %></h3>
         </div>
         <hr />
      </div>
   </main>
   <footer class="container">
		<p>&copy;WebMarket</p>
	</footer>
</body>
</html>