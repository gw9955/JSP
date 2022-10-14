package homework.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {
	private FilterConfig filterConfig = null;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {

		String message = "";
		
		// web.xml의 init-param에서 넘어온 아이디 / 비밀번호
		// filterConfig : {"id":"admin","passwd":"1234"}
		String param1 = filterConfig.getInitParameter("id");
		String param2 = filterConfig.getInitParameter("passwd");

		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		// 응답 메시지 객체
		PrintWriter writer = response.getWriter();

		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");

		if (param1.equals(id) && param2.equals(passwd)) {
			HttpSession session = request.getSession();
			// 아이디 값은 세션명 userID에 세션 값으로 설정
			session.setAttribute("userID", id);
			message = "로그인 성공";
			writer.println(message);
		} else {
			message = "로그인 실패";
			writer.println(message);
			response.sendRedirect("/homework/1013work/1013work1.jsp");
		}

	}

}
