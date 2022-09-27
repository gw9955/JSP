package kr.or.ddit.basic;

import java.util.concurrent.locks.ReentrantLock;

/*
 * 은행의 입출금을 스레드로 처리하는 예제
 * (Lock 객체를 이용한 동기화 처리)
 */
public class T17LockAccountTest {
/*
 * 락(Lock) 기능을 제공하는 클래스
 * 
 * ReentrantLock : Read 및 Write 구분없이 사용하기 위한 락 클래스로 동기화 처리르 위해
 * 					사용한다. synchronized를 이용한 동기화 처리보다 부가적인 기능이 제공된다.
 * 					ex) Fairness 설정 등. => 가장 오래 기다린 스레드가 가장먼저 락을 회득하게 함.
 * 
 * ReentrantReadWriteLock : Read 및 Writhe 락을 구분하여 사용 가능함. 
 */
	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock(true);
		
		LockAccount lAcc = new LockAccount(lock);
		lAcc.deposit(10000);

		BankThread2 th1 = new BankThread2(lAcc);
		BankThread2 th2 = new BankThread2(lAcc);

		th1.start();
		th2.start();
	}
}

// 입출금을 담당하는 클래스(공유 객체)
class LockAccount {
	private int balance; // 잔액이 저장될 변수

	// 2. lock객체 생성 => 되도록이면 private final로 만든다.
	private final ReentrantLock lock = new ReentrantLock();

	public LockAccount(ReentrantLock lock) {
	}

	synchronized public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 3. 입금처리 하는 메서드
	public void deposit(int money) {
		// Lock객체의 lock()메서드가 동기화의 시작이고, unlock()메서드가
		// 동기화의 끝을 나타낸다.
		// lock() 메서드로 동기화를 설정한 곳에서는 반드시 unlock()메서드로
		// 해제해 주어야 한다.
		lock.lock(); // 락설정 시작
		balance += money; // 동기화 처리 부분
		lock.unlock(); // 락 해제 필수
	}

	// 4. 출금하는 메서드 (출금 성공: true, 출금 실패: false 반환)
	public boolean withdraw(int money) {
		boolean chk = false;

		// try ~ catch 블럭을 사용할 경우에는
		// unlock()메서드 호출은 finally 블럭에서 하도록 한다.

		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName()
					+ "락 설정(획득) 완료.");
			if (balance >= money) {
				for (int i = 0; i < 1000000000; i++) {} // 시간 떄우기
				balance -= money;
				System.out.println("메서드 안에서 = " + getBalance());
				chk = true;
			}
		} catch (Exception e) {
			chk = false;
		} finally {
			lock.unlock(); // 락 해제
			System.out.println(Thread.currentThread().getName()
					+ "락 해제(반납) 완료.");
		}

		return chk;
	}
}

// 은행 업무를 처리하는 쓰레드
class BankThread2 extends Thread {
	  private LockAccount lAcc;

	  public BankThread2(LockAccount lAcc) {
	    this.lAcc = lAcc;
	  }

	  @Override
	  public void run() {
	    boolean result = lAcc.withdraw(6000);
	    System.out.println("쓰레드 안에서 result = " + result 
	        + ", balance = " + lAcc.getBalance());
	}
}