package work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HorseTest {
	
static int strRank = 1;
	
	public static void main(String[] args) {
		List<Horse> list = new ArrayList<>();
		list.add(new Horse("1번말"));
		list.add(new Horse("2번말"));
		list.add(new Horse("3번말"));
		list.add(new Horse("4번말"));
		list.add(new Horse("5번말"));
		list.add(new Horse("6번말"));
		list.add(new Horse("7번말"));
		list.add(new Horse("8번말"));
		list.add(new Horse("9번말"));
		list.add(new Horse("10번말"));

		for (Horse horse : list) {
			horse.start();
		}

		for (Horse horse : list) {
			try {
				horse.join();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}

		Collections.sort(list);
		System.out.println("경기 끝.");
		System.out.println("------------------------------");
		System.out.println();
		System.out.println("경기 결과 ");

		for (Horse horse : list) {
			System.out.println(horse.getHorseName() + " " + horse.getRank() + "등");
		}
	}
}

class Horse extends Thread implements Comparable<Horse> {
	private String horseName;
	private int rank;

	public Horse(String horseName) {
		this.horseName = horseName;
	}

	public String getHorseName() {
		return horseName;
	}

	public void setHorseName(String horseName) {
		this.horseName = horseName;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public int compareTo(Horse o) {
		if (this.rank > o.getRank()) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("\n" + horseName + " : ");
			for (int j = 0; j < i; j++) {
				System.out.print("-");
			}
			System.out.print(">");

			for (int j = 49; j > i; j--) {
				System.out.print("-");
			}

			try {
				Thread.sleep((int) (Math.random() * 500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(horseName + " 끝");

		setRank(HorseTest.strRank);
		HorseTest.strRank++;
	}
}