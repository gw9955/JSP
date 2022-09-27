package work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentList {
	public static void main(String[] args) {
		List<Student> stList = new ArrayList<Student>();

		stList.add(new Student("20162996", "박관우", 90, 70, 50));
		stList.add(new Student("20192934", "김지호", 90, 95, 100));
		stList.add(new Student("20142932", "이용석", 70, 100, 70));
		stList.add(new Student("20172912", "박상철", 50, 20, 20));
		stList.add(new Student("20152922", "심주희", 80, 90, 40));

		System.out.println("정렬 전: ");
		for (Student stl : stList) {
			System.out.println(stl);
		}
		System.out.println("----------------------------------");

		Collections.sort(stList);
		System.out.println("학번의 오름차순: ");
		for (Student stl : stList) {
			System.out.println(stl);
		}
		System.out.println("----------------------------------");

		Collections.sort(stList, new SumDesc());
		System.out.println("총점의 내림차순: ");
		for (Student stl : stList) {
			System.out.println(stl);
		}
	}
}

