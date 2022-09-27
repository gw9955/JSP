package kr.or.ddit.basic;

public class T19WaitNotifyTest {
/*
wait()
 - 동기화 영역에서 락을 풀고 Wait-Set영역 (공유객체별 존재)으로 이동시킨다.
notify() 또는 notifyAll()
 - Wait-Set 영역에 있는 쓰레드를 깨워서 실행할 수 있도록 한다.
 - nofity()는 하나, notifyAll()은 Wait-Set에 있는 전부를 깨운다
 - notify(): 랜덤이라 내가 원하는 애 말고 다른 애들을 깨울 수도 있음
wait, notify, notifyAll 모두 동기화 영역에서만 실행될 수 있고,
Object 클래스에서 제공하는 메서드이다
 */
	public static void main(String[] args) {
		WorkObject workObj = new WorkObject();

		ThreadA tha = new ThreadA(workObj);
		ThreadB thb = new ThreadB(workObj);

		tha.start();
		thb.start();
	}
}

// 공통으로 사용할 객체
class WorkObject {
	public synchronized void MethodA() {
		System.out.println("methodA에서 작업 중...");

		notify();

		try {
			System.out.println(Thread.currentThread().getName() + " wait() 호출");
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void methodB() {
		System.out.println("methodB에서 작업 중...");

		notify();

		try {
			System.out.println(Thread.currentThread().getName() + " wait() 호출");
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

// WorkObject의 methodA()메서드만 호출하는 쓰레드 클래스
class ThreadA extends Thread {
	private WorkObject workObj;

	public ThreadA(WorkObject workObj) {
		super("ThreadA");
		this.workObj = workObj;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObj.MethodA();
		}
		System.out.println("ThreadA 종료");
	}
}

// WorkObject의 methodB()메서드만 호출하는 쓰레드 클래스
class ThreadB extends Thread {
	private WorkObject workObj;

	public ThreadB(WorkObject workObj) {
		super("ThreadB");
		this.workObj = workObj;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObj.methodB();
		}
		System.out.println("ThreadB 종료.");
	}
}

