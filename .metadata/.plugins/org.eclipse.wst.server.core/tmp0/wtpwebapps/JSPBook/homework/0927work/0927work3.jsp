<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.lang.Math"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<%
      java.util.Calendar cal = java.util.Calendar.getInstance();
      Date date1 = new Date(cal.getTimeInMillis());
   %>
   <%@include file="0927work3.5.jsp"%>
   <p>현재 날짜 : <%=new Date()%></p>
</body>
</html>