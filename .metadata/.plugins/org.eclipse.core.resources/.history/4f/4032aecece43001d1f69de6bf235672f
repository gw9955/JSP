<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<%@ page import="org.apache.commons.fileupload.DiskFileUpload"%>
<%@ page import="java.io.File"%>
<%@ page import="org.apache.commons.fileupload.FileItem"%>
<%@ page import="java.util.Iterator"%>
<%	// 스크립틀릿
	String fileUploadPath = "C:\\upload";
	DiskFileUpload upload = new DiskFileUpload();
	
	upload.setSizeMax(1000000); // 최대 크기(1MB)
	upload.setSizeThreshold(4096);	// 메모리상에 저장할 최대 크기(12MB)
	upload.setRepositoryPath(fileUploadPath);	// 업로드된 파일을 임시로 저장할 경로
	
	List items = upload.parseRequest(request);
	Iterator params = items.iterator();
	while(params.hasNext()) {
		FileItem fileItem = (FileItem)params.next();
		if(fileItem.isFormField()) {	// 일반 데이터라면(name, subject)
			String name = fileItem.getFieldName();	// 파라미터의 이름(name, subject)
			String value = fileItem.getString("UTF-8");	// 파라미터의 값(개똥이, 개똥이 콘서트)
			out.println(name + "=" + value + "<br />");
		} else {	// 일반 데이터가 아니면 파일 일것이다(filename)
			String fileFieldName = fileItem.getFieldName();	// 요청 파라미터의 이름(filename)
			String contentType = fileItem.getContentType();	// 파일 콘텐츠 유형(MIME 타입)
			long fileSize = fileItem.getSize();	// 파일 크기
			String fileName = fileItem.getName();
			fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
			File file = new File(fileUploadPath + "/" + fileName);
			fileItem.write(file);
			
			out.println("-----------------------<br />");
			out.println("요청 파라미터 이름 : " + fileFieldName + "<br />");	// filename
			out.println("저장 파일 이름 : " + fileName + "<br />");	// cake01.jpg
			out.println("파일 콘텐츠 타입 : " + contentType + "<br />");	// images/jpeg
			out.println("파일 크기 : " + fileSize + "<br />");	// 68.8KB
		}
	}
%>