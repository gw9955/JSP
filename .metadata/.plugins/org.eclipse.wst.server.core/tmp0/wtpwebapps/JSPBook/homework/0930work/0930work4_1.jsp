<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.Enumeration"%>
<!DOCTYPE html>
<html>
<head>
<title>Implicit Objects</title>
</head>
<body>
	<div>
		<h3>선택한 과일</h3>
		<%!
			// String[] -> String으로 결합해주는 메소드 
			String arrToStr(String[] fruit){
				String str = "";
				for(String s : fruit){
					str += s;
				}
				return str;
			}
		%>
		<%
			request.setCharacterEncoding("UTF-8");
			Enumeration paramNames = request.getParameterNames(); 
			while(paramNames.hasMoreElements()){
				String name = (String)paramNames.nextElement(); 
				String paramValue = arrToStr(request.getParameterValues(name));
					
				out.print(paramValue);
			}
		%>
	</div>
</body>
</html>