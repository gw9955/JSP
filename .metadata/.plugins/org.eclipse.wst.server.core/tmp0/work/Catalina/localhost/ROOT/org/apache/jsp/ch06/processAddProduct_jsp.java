/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2022-10-07 08:11:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch06;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import org.apache.commons.fileupload.FileItem;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.fileupload.DiskFileUpload;
import ch04.vo.ProductVO;
import ch04.dao.ProductRepository;

public final class processAddProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/A_TeachingMaterial/3.HighJava/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/JSPBook/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1664261830921L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("org.apache.commons.fileupload.DiskFileUpload");
    _jspx_imports_classes.add("ch04.vo.ProductVO");
    _jspx_imports_classes.add("org.apache.commons.fileupload.FileItem");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("ch04.dao.ProductRepository");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	// 폼 페이지에서 입력된 데이터를 서버(톰캣)로 전송 시 한글이 깨지지 않도록 하자
	request.setCharacterEncoding("UTF-8");

	// 1) 어디에 저장할 것인가?
	String path = "D:\\A_TeachingMaterial\\3.HighJava\\workspace\\JSPBook\\WebContent\\resources\\images";
	// 2) 파일 업로드 객체 생성
	DiskFileUpload upload = new DiskFileUpload();
	// 3) 환경설정. bit -> bytes -> kbytes -> Mbytes -> Gbytes
	upload.setSizeMax(1000000); // 1Mbytes
	upload.setSizeThreshold(4096); // 메모리 최대 크기(4M)
	upload.setRepositoryPath(path); // 임시 저장 경로
	// 4) 폼 페이지의 item 받아오기. items -> {"productId":"P1237","pname":"게이밍 마우스"...}
	List items = upload.parseRequest(request);
	// 5) 열거형 타입으로 변환
	Iterator params = items.iterator();
	
	String productId = "";
	String pname = "";
	String unitPrice = "";
	String description = "";
	String manufacturer = "";
	String category = "";
	String unitsInStock = "";
	String condition = "";
	// 가격은 숫자형
	int price = 0;
	// 상품 재고수도 숫자형
	int stock = 0;
	// 업로드 파일 명
	String fileName = "";
	ProductRepository dao = ProductRepository.getInstance();
	
	// 6) 요청 파라미터가 없을 때까지 반복
	while(params.hasNext()) {
		FileItem item = (FileItem)params.next();
		// Spring 프레임워크에서는 MultipartFile로 쉽게 처리된다.
		if(item.isFormField()) { // 6-1) 일반 데이터
			// 6-1-1) 파라미터의 이름 가져오기
			if(item.getFieldName().equals("productId")) {
				// 6-1-2) 파라미터의 값 가져오기
				productId = item.getString("UTF-8");
			} else if(item.getFieldName().equals("pname")) {
				pname = item.getString("UTF-8");
			} else if(item.getFieldName().equals("unitPrice")) {
				unitPrice = item.getString("UTF-8");
				// 폼 페이지에서 상품 가격이 입력되지 않았다면 0으로 처리
				if(unitPrice.isEmpty()) {
					price = 0;
				} else {
					price = Integer.parseInt(unitPrice);
				}
			} else if(item.getFieldName().equals("description")) {
				description = item.getString("UTF-8");
			} else if(item.getFieldName().equals("manufacturer")) {
				manufacturer = item.getString("UTF-8");
			} else if(item.getFieldName().equals("category")) {
				category = item.getString("UTF-8");
			} else if(item.getFieldName().equals("unitsInStock")) {
				unitsInStock = item.getString("UTF-8");
				if(unitsInStock.isEmpty()) {
					stock = 0;
				} else {
					stock = Integer.parseInt(unitsInStock);
				}
			} else if(item.getFieldName().equals("condition")) {
				condition = item.getString("UTF-8");
			} 
			
		} else { // 6-2) 파일 데이터
			// <input type="file" name="productImage" class="form-control">
			String fileFieldName = item.getFieldName();	// 요청 파라미터명
			fileName = item.getName(); // 저장 파일명(mouse01.png)
			String contentType = item.getContentType();	// images/jpeg
			// 순수한 파일명만 추출
			fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
			long fileSize = item.getSize(); // 파일 크기
			// 파일 객체 생성(copy 설계)
			File file = new File(path + "/" + fileName);
			// copy 실행
			item.write(file);
			
			out.println("-------------------<br />");
			out.println("요청 파라미터 명 : " + fileFieldName + "<br />");
			out.println("저장 파일 명 : " + fileName + "<br />");
			out.println("파일 콘텐츠 타입 : " + contentType + "<br />");
			out.println("파일 크기 : " + fileSize + "<br />");
		}
		
	} // end while
		
	// 빈(Bean) 객체에 데이터를 태워서 add하자
	ProductVO productVO = new ProductVO();
	productVO.setProductId(productId);
	productVO.setPname(pname);
	productVO.setUnitPrice(price);
	productVO.setDescription(description);
	productVO.setManufacturer(manufacturer);
	productVO.setCategory(category);
	productVO.setUnitsInStock(stock);
	productVO.setCondition(condition);
	productVO.setFilename(fileName);
	
	
	// insert into product(...) values(...);
	// 폼 페이지에서 입력된 데이터를 저장하도록 ProductRepository 클래스의 addProduct 메소드를 호출
	dao.addProduct(productVO);
	
	out.print("productVO : " + productVO.toString());
	
	// products.jps 페이지로 강제 이동
	response.sendRedirect("products.jsp");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
