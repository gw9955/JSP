/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2022-10-03 23:27:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.homework._0930work;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _0930work_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   1. form 태그에 사용하는 속성에 대해 간단히 설명하시오.<br>\r\n");
      out.write("   - action\t\t폼 데이터를 받아 처리하는 웹 페이지의 URL을 설정합니다.<br>\r\n");
      out.write("   - method\t\t폼 데이터가 전송되는 HTTP 방식을 설정합니다.<br>\r\n");
      out.write("   - name\t\t폼을 식별하기 위한 이름을 설정합니다.<br>\r\n");
      out.write("   - target\t\t폼 처리 결과의 응답을 실행할 프레임을 설정합니다.<br>\r\n");
      out.write("   - enctype\t폼을 전송하는 콘텐츠 MIME 유형을 설정합니다.<br>\r\n");
      out.write("   - accept-charset\t\t폼 전송에 사용할 문자 인코딩을 설정합니다.<br>\r\n");
      out.write("   <hr />\r\n");
      out.write("   2. form 태그 내에 중첩하여 사용하는 태그를 나열하고 설명하시오.<br>\r\n");
      out.write("   - input 태그<br>\r\n");
      out.write("    1) input 태그는 사용자가 텍스트 입력이나 선택 등을 다양하게 할 수 있도록 공간을 만드는태그로,<br>\r\n");
      out.write("    \t 종료 태그 없이 단독으로 사용할 수 있습니다.<br>\r\n");
      out.write("   - select 태그<br>\r\n");
      out.write("    1) select 태그는 여러 개의 항목이 나타나는 목록 상자에서 항목을 선택하는 태그입니다.<br>\r\n");
      out.write("\t\t시작 태그와 종료 태그가 있으며, 리스트 박스에 여러 항목을 추가 삽입하기 위해 반드시<br>\r\n");
      out.write("\t\toption 태그를 포함해야 합니다.<br>\r\n");
      out.write("   - textarea 태그<br>\r\n");
      out.write("    1) textarea 태그는 여러 줄의 텍스트를 입력할 수 있는 태그입니다. 가장 큰 특징은 입력 폼<br>\r\n");
      out.write("\t\t안에 사용된 태그와 띄어쓰기가 그대로 출력된다는 것입니다.<br>\r\n");
      out.write("   <hr />\r\n");
      out.write("   3. 폼 페이지에서 전송된 데이터를 전달받는 내장 객체와 관련된 메소드는 무엇인가?<br>\r\n");
      out.write("   - request 내장 객체<br>\r\n");
      out.write("    1) 요청 파라미터의 값 받기 : getParameter(요청 파라미터 이름)<br>\r\n");
      out.write("\t2) 요청 파라미터의 전체 값 받기<br>\r\n");
      out.write("\t\t메소드\t\t\t\t\t\t형식\t\t\t\t\t\t설명<br>\r\n");
      out.write("\tgetParameterNames()\t\tjava.util.Enumeration\t\t모든 입력 양식의 요청 파라미터 이름을 순서에 상관없이 Enumeration(열거형) 형태로 전달받습니다.<br>\r\n");
      out.write("\thasMoreElements()\tEnumeration(열거형)요소가 있으면 true를 반환하고, 그렇지 않으면false를 반환합니다.<br>\r\n");
      out.write("\tnextElement()\tEnumeration(열거형)요소를 반환합니다.<br>\r\n");
      out.write("   <hr />\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}