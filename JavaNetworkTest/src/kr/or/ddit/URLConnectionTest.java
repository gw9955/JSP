package kr.or.ddit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class URLConnectionTest {
	public static void main(String[] args) throws IOException {
		
		// URLConnection => 애플리케이션과 URL간의 통신 연결을 위한 추상클래스
		
		// 특정 서버(예: naver서버)의 정보와 파일 내용을 출력하는 예제
		URL url = new URL("https://www.naver.com/index.html");
		
		// Header정보 가져오기
		
		// 1. URLConnection 객체 구하기
		URLConnection urlCon = url.openConnection();
		
		System.out.println("Content-Type : " + urlCon.getContentType());
		System.out.println("Encoding : " + urlCon.getContentEncoding());
		System.out.println("Content : " + urlCon.getContent());
		System.out.println();
		
		// 전체 Header 정보 출력하기
		Map<String, List<String>> headerMap = urlCon.getHeaderFields();
		
		// Header의 key값 구하기
		Iterator<String> iterator = headerMap.keySet().iterator();
		while (iterator.hasNext()) {
		  String key = iterator.next();
		  System.out.println(key + " : " + headerMap.get(key));
		}
		System.out.println("-------------------------------------------------");
		
		// Content 가져오기
		BufferedReader br = new BufferedReader(new InputStreamReader(urlCon.getInputStream(), "UTF-8"));
		
		// 내용 출력하기
		String str = "";
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		br.close();
	}
}
