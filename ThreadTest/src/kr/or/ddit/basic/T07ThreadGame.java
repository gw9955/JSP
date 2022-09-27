package kr.or.ddit.basic;

import java.util.Random;

import javax.swing.JOptionPane;

public class T07ThreadGame {
	
	public static boolean inputCheck = false;
	
	public static void main(String[] args) {

		Game input = new Game();
		Count count = new Count();

		input.start();
		count.start();

	}
}

class Game extends Thread {
	@Override
	public void run() {
		String user = JOptionPane.showInputDialog("가위바위보게임을 시작합니다.");
		System.out.println("====== 결과 ======");
		T07ThreadGame.inputCheck = true;

		Random random = new Random();
		String[] aiArray = {"가위", "바위", "보"};
		String ai = aiArray[random.nextInt(3)];
		System.out.println("컴퓨터: " + ai);
		System.out.println("당신: " + user);
		
		String result = "";
		if (user.equals(ai)) {
			result = "비김";
		} else if (user.equals("바위") && ai.equals("가위") 
				|| user.equals("보") && ai.equals("바위")
				|| user.equals("가위") && ai.equals("보")) {
			result = "당신이 이겼습니다.";
		} else {
			result = "컴퓨터가 이겼습니다.";
		}
		
		System.out.println("결과: " + result);

	}
}

class Count extends Thread {
	@Override
	public void run() {
		for (int i = 5; i >= 1; i--) {

			if (T07ThreadGame.inputCheck) {
				return;
			}

			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("5초가 지났습니다. 프로그램을 종료합니다.");
		System.exit(0);

	}
}