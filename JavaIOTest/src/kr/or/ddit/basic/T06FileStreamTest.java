package kr.or.ddit.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 파일 출력 예제
 */
public class T06FileStreamTest {
	public static void main(String[] args) {

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("d:/D_Other/out.txt");

			for (char ch = 'a'; ch <= 'z'; ch++) {
				fos.write(ch);
			}
			System.out.println("파일에 쓰기 작업 완료...");

			// 쓰기 작업 완료 후 스트림 닫기
			fos.close();

			// =================================
			// 저장된 파일의 내용을 읽어와 화면에 출력하기
			FileInputStream fis = new FileInputStream("d:/D_Other/out.txt");

			int data = 0;
			while ((data = fis.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println();
			System.out.println("출력 끝...");

			fis.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
