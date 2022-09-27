package kr.or.ddit.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class T03ServletParameterTest extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Post방식으로 넘어오는 Body데이터를 인코딩 처리함.
		// GET방식의 경우에는 TOMCAT의 URIEncoding 설정을 이용함.
		// 반드시 요청객체에 값을 가져오기 전에 먼저 설정 해야 적용됨.
		req.setCharacterEncoding("UTF-8");

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String food = req.getParameter("food");
		String rlgn = req.getParameter("rlgn");

		String[] hobby = req.getParameterValues("hobby");

		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<p>username : " + username + "</p>");
		out.println("<p>password : " + password + "</p>");
		out.println("<p>gender : " + gender + "</p>");
		if (hobby != null) {
			for (String h : hobby) {
				out.println("<p>hobby : " + h + "</p>");
			}
		}
		out.println("<p>rlgn : " + rlgn + "</p>");
		out.println("<p>food : " + food + "</p>");

		// 전체 파라미터 정보 가져오기
		Enumeration<String> params = req.getParameterNames();

		while (params.hasMoreElements()) {
			String param = params.nextElement();
			out.println("<p>파라미터 이름 : " + param + "</p>");
		}

		out.println("</body>");
		out.println("</html>");

	}
}