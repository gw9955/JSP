<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.DiskFileUpload"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String fileUploadPath = "C:\\upload";
	
	DiskFileUpload upload = new DiskFileUpload();
	
	List items = upload.parseRequest(request);
	
	Iterator params = items.iterator();
	
	while(params.hasNext()){
		
		FileItem fileItem = (FileItem)params.next();
		
		if(fileItem.isFormField()){
			String name = fileItem.getFieldName();
			String value = fileItem.getString("UTF-8");
			out.println(name + " = " + value + "<br/>");
		}else{// 일반 데이터가 아니면 파일일 것이다. (filename)	
			String fileFieldName = fileItem.getFieldName(); // 요청 파라미터 이름(filename)
			String contentType = fileItem.getContentType(); // 파일 콘텐츠 유형(MIME 타입)
			long fileSize = fileItem.getSize(); // 파일크기
			// 7) 클라이언트에서 업로드할 대상 찾기
			//fileName : C:\\User\\pc11\\Pictures\\cake01.jpg
			String fileName = fileItem.getName();
			// cake01.jpg
			fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
			// 8) 서버로 업로드
			//C:\\upload + "/" + cake01.jpg
			File file = new File(fileUploadPath + "/" + fileName);
			//서버로 복사 실행
			fileItem.write(file);
			
			// <input type="file" name="filename"/>
			out.println("=======" + "<br/>");
			out.println("요청파라미터 이름 :" + fileFieldName + "<br/>" );
			out.println("저장 파일 이름 :" + fileName + "<br/>" );
			out.println("파일 콘텐츠 타입 : " + contentType + "<br/>");
			out.println("파일크기 : " + fileSize);
		}
		
	}
%>