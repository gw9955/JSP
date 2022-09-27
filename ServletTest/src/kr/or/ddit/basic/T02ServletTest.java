package kr.or.ddit.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 서블릿 동작 방식에 대하여.
 * 	1) 사용자(클라이언트)가 URL을 클릭하면 HTTP Request를 Servlet Container로 전송(요청)한다.
 * 	2) 컨테이너는 web.xml에 정의된 url패턴을 확인하여 어느 서블릿을 통해 처리해야할지를 검색한다
 * 	로딩이 안 된 경우에는 로딩함. 로딩시, init() 호출됨
 * 	3) Servlet Container는 요청을 처리할 개별 스레드 객체를 생성하여 해당 서블릿 객체의 service()메서드를 호출한다.
 * 	이때 HttpServletRequest 및 HttpServletResponse 객체를 생성하여 파라미터로 넘겨준다.
 * 	4) service() 메서드는 메서드 타입을 체크하여 적절한 메서드를 호출한다.
 * 	doGet, doPost, doPut, doDelete...
 * 	5) 요청 처리가 완료되면, HttpServletRequest 및 HttpServletResponse객체는 소멸 된다.
 * 	6) 컨테이너로부터 서블릿이 제거되는 경우에 destroy()메서드가 호출
 */
public class T02ServletTest extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8");

		// Request객체의 메소드 확인하기
		System.out.println("getCharacterEncoding(): " + req.getCharacterEncoding());
		System.out.println("getCharacterEncoding(): " + req.getContentLength());
		System.out.println("getCharacterEncoding(): " + req.getQueryString());
		System.out.println("getCharacterEncoding(): " + req.getProtocol());
		System.out.println("getCharacterEncoding(): " + req.getMethod());
		System.out.println("getCharacterEncoding(): " + req.getRequestURI());
		System.out.println("getCharacterEncoding(): " + req.getRemoteAddr());
		System.out.println("getCharacterEncoding(): " + req.getRemotePort());

		// 요청메시지로부터 name값을 가져옴
		String name = req.getParameter("name");
		System.out.println("name => " + name);
		String age = req.getParameter("age");
		System.out.println("name => " + age);

		// 응답메시지 인코딩 설정(Content-Type의 charset=UTF-8과 동일)
		resp.setCharacterEncoding("UTF-8");

		// 응답메시지의 Content-Type 설정
		resp.setContentType("text/plain");

		// 실제 수행할 로직(기능)이 시작되는 부분.
		PrintWriter out = resp.getWriter();

		out.println("name => " + name);
		out.println("age => " + age);
		out.println("서블릿 경로 => " + req.getServletPath());
		out.println("컨텍스트 경로 => " + req.getContextPath());
		
		

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
}
