package kr.or.ddit.basic;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class T04ByteArrayIOTest2 {
	public static void main(String[] args) throws IOException {
		
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;
		
		byte[] temp = new byte[4]; // 데이터를 읽을때 사용할 배열
		
		// 스트림 객체 생성하기
		ByteArrayInputStream bais = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int len = 0; // 버퍼로 읽어드린 byte 수

		// read() 매서드 => byte단위로 자료를 읽어와 int형으로 반환한다.
		//				    더 이상 읽어올 자료가 없으면 -1을 반환한다.
		while ((len = bais.read(temp)) != -1) {
			
			System.out.println("temp => " + Arrays.toString(temp));
			
			System.out.println("len => " + len);
		  baos.write(temp, 0, len); // 출력하기
		}

		// 출력된 스트림 값들을 byte 배열로 변환해서 반환하는 메서드
		outSrc = baos.toByteArray(); // byte[] outSrc에 담기 위해

		System.out.println("inSrc => " + Arrays.toString(inSrc));
		System.out.println("outSrc => " + Arrays.toString(outSrc));

		// 스트림 객체 닫아주기
//		bais.close();
//		baos.close();
	}
}
