package work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tulips {
	public static void main(String[] args) {

		FileInputStream fi = null;
		FileOutputStream fo = null;

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		long startTime = System.currentTimeMillis();

		try {
			fi = new FileInputStream("d:/D_Other/김다미.jpg");
			fo = new FileOutputStream("d:/D_Other/복사본_김다미.jpg");

			bis = new BufferedInputStream(fi);
			bos = new BufferedOutputStream(fo);

			int data = 0;

			while ((data = fi.read()) != -1) {
				bos.write(data);
			}
			System.out.println("복사완료!");

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("경과 시간(ms): " + (endTime - startTime));
	}
}
