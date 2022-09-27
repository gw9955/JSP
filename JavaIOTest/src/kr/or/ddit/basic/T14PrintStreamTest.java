package kr.or.ddit.basic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

/*
 * 프린터 기능 제공 보조 스트림 예제
 */
public class T14PrintStreamTest {
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("d:/D_Other/print.txt");
		
		/*
		 * 	PrintStream
		 * - 모든 자료형을 출력할 수 있는 기능을 제공하는 OutputStream의 서브클래스
		 * - IOException을 발생시키지 않는다
		 * - println, print 등 메서드 호출시마다 auto-flush 기능이 제공된다
		 */

		PrintStream out = new PrintStream(fos); // 목적지 : 새파일

		out.print("안냐심까. PrintStream 이올시다.\n");
		out.println("안냐심까. PrintStream 이올시다2.");
		out.println("안냐심까. PrintStream 이올시다3.");
		out.println(out); // 객체 출력
		out.println(3.14);

		/*
		 * 	PrintStream은 데이터를 문자로 출력하는 기능을 수행함. (System.out)
		 * 향상된 기능의 PrintWriter가 추가되었지만 PrintStream이 계속 사용됨
		 * 
		 * 	PrintWriter가 PrintStream보다 다양한 언어의 문자를 처리하는데 적합하다.
		 */
		
		FileOutputStream fos2 = new FileOutputStream("d:/D_Other/print2.txt");
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(fos2, "UTF-8"));
		
		pw.print("안냐심까. PrintWriter 입니다.\r\n");
		pw.println("안냐심까. PrintWriter 입니다.2");
		pw.println("안냐심까. PrintWriter 입니다.3");

		pw.close();
	}
}
