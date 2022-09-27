package kr.or.ddit.basic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class T02FileTest {
	public static void main(String[] args) {

		File f1 = new File("d:/D_Other/sample.txt");
		File f2 = new File("d:/D_Other/test.txt");

		if (f1.exists()) {
			System.out.println(f1.getAbsolutePath() + "은 존재합니다.");
		} else {
			System.out.println(f1.getAbsolutePath() + "은 없는 파일입니다.");

			try {
				if (f1.createNewFile()) {
					System.out.println(f1.getAbsolutePath() + "파일을 새로 만들었습니다."); // 파일만 만드는 것임. 컨텐츠는 스트림객체로 채움.
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if (f2.exists()) {
			System.out.println(f2.getAbsolutePath() + "은 존재합니다.");
		} else {
			System.out.println(f2.getAbsolutePath() + "은 없는 파일입니다.");
		}
		System.out.println("----------------------------------------------------");

		File f3 = new File("d:/D_Other");
		File[] files = f3.listFiles();

		// f3(디렉토리)에 담긴 file객체들 꺼내 출력
		for (File f : files) {
			System.out.print(f.getName() + " => ");
			if (f.isFile()) {
				System.out.println("파일");
			} else if (f.isDirectory()) {
				System.out.println("디렉토리");
			}
		}
		System.out.println("====================================================");
		String[] strFiles = f3.list();
		for (String fName : strFiles) {
			System.out.println(fName);
		}
		System.out.println("----------------------------------------------------");
		System.out.println();

		// 출력할 디렉토리 정보를 갖는 File 객체 생성하기
		File f4 = new File("d:/D_Other");

		displayFileList(f4);

	}

	private static void displayFileList(File dir) {
		System.out.println("[" + dir.getAbsolutePath() + "] 디렉토리의 내용");

		// 디렉토리 안의 모든 파일 목록 가져오기
		File[] files = dir.listFiles();

		// 하위 디렉토리 정보를 저장할 ArrayList 생성(File배열의 인덱스값 저장)
		List<Integer> subDirList = new ArrayList<Integer>();

		// 날짜를 출력하기 위한 형식 설정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");

		for (int i = 0; i < files.length; i++) {
			String attr = ""; // 파일의 속성(읽기, 쓰기, 히든, 디렉토리 구분)
			String size = ""; // 파일의 크기

			if (files[i].isDirectory()) {
				attr = "<DIR>";
				subDirList.add(i);
			} else {
				size = files[i].length() + "";
				attr = files[i].canRead() ? "R" : " ";
				attr = files[i].canWrite() ? "W" : " ";
				attr = files[i].isHidden() ? "H" : " ";
			}

			System.out.printf("%s %5s %12s %s\n",
					sdf.format(
							new Date(files[i].lastModified())),
					attr, size, files[i].getName());
		}

		int dirCount = subDirList.size(); // 폴더 안의 하위폴더 개수
		int fileCount = files.length - dirCount; // 폴더 안의 파일 개수

		System.out.println(fileCount + "개의 파일, " + dirCount + "개의 디렉토리");
		System.out.println();

		for (int i = 0; i < subDirList.size(); i++) {
			// 하위폴더의 내용도 출력하기 위해 현재 메서드를 재귀 호출
			displayFileList(files[subDirList.get(i)]);
		}
	}
}