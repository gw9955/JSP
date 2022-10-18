<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page errorPage="isErrorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>11장 문제4번</title>
</head>
<body>
		<!-- 오류 부분 -->
      <%
         int x = 1;
         if (x == 1) {
            throw new RuntimeException("");
         }
      %>
</body>
</html>