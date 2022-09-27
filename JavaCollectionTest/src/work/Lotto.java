package work;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lotto {
	Scanner scan = new Scanner(System.in);

	public void lottoStart() {
		while (true) {
			System.out.println("==========================");
			System.out.println("Lotto 프로그램");
			System.out.println("--------------------------");
			System.out.println("1. Lotto 구입");
			System.out.println("2. 프로그램 종료");
			System.out.println("==========================");
			System.out.print("메뉴선택: ");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				lottoGame();
				break;
			case 2:
				System.out.println("감사합니다.");
				return;
			default:
				System.out.println("잘못들었습니다?");
			}
		}
	}

	public void lottoGame() {
		System.out.println("Lotto 구입 시작");
		System.out.println("(1000원에 로또번호 하나입니다.)");
		System.out.print("금액 입력: ");
		int money = scan.nextInt();
		int num1 = money / 1000;
		int payback = money % 1000;

		System.out.println("행운의 로또번호는 아래와 같습니다.");
		for (int i = 0; i < num1; i++) {

			Set<Integer> intRnd = new HashSet<Integer>();
			while (intRnd.size() < 6) {
				int num2 = (int) (Math.random() * 45 + 1);
				intRnd.add(num2);
			}
			System.out.println("로또번호" + (i + 1) + " :" + intRnd);
		}

		System.out.println("받은 금액은 " + money + "이고 거스름돈은 " + payback + "원입니다.");

	}

	public static class LottoTest {
		public static void main(String[] args) {
			new Lotto().lottoStart();
		}
	}
}
