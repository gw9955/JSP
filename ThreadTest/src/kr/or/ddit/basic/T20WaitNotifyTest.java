package kr.or.ddit.basic;

public class T20WaitNotifyTest {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();

		  ProducerThread pth = new ProducerThread(dataBox);
		  ConsumerThread cth = new ConsumerThread(dataBox);

		  pth.start();
		  cth.start();
	}
}

// 데이터를 공통으로 사용하는 클래스
class DataBox {
	private String data;

	// 1. data가 null이 아닐때 data값을 반환하는 메서드
	public synchronized String getData() {
		if (this.data == null) {
			try {
				System.out.println(Thread.currentThread().getName() + " wait() 호출");
				wait(); // 데이터가 없을 땐 반환할 데이터가 없으니 wait으로 기다림
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// data가 null이 아니면 data를 returnData에 담아서 반환함
		String returnData = data;
		System.out.println("읽어온 데이터 : " + returnData);

		// 데이터를 누군가에게 줬으니 내가 가진 데이터는 없음
		// => null로 셋팅
		// => 다시 getter가 호출되면 data==null 이어서 wait()
		this.data = null;
		System.out.println(Thread.currentThread().getName() + "notify()호출");
		notify();
		return returnData;
	}

	// 2. data가 null일 경우에만 자료를 셋팅하는 메서드
	public synchronized void setData(String data) {
		if (this.data != null) { // 값을 set하러 왔는데 이미 값이 있으니 할 일이 없으므로 wait
			try {
				System.out.println(Thread.currentThread().getName() + " wait() 호출");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// data == null 이므로 파라미터로 받은 값으로 데이터 셋팅
		this.data = data;
		System.out.println("셋팅한 데이터 : " + this.data);

		// 혹시나 get하러 갔다가 값이 없어서 wait하고 있는 스레드를 위해 값 가져가라고 notify로 깨워준다
		System.out.println(Thread.currentThread().getName() + "notify()호출");
		notify();
	}
}

// 데이터를 셋팅만 하는 쓰레드
class ProducerThread extends Thread {
	private DataBox dataBox;

	public ProducerThread(DataBox dataBox) {
		super("ProducerThread"); // 쓰레드 이름
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			String data = "Data-" + i;
			System.out.println("dataBox.setData(" + data + ")호출");
			dataBox.setData(data);
		}
	}
}

// 데이터를 읽어만 오는 쓰레드
class ConsumerThread extends Thread {
	private DataBox dataBox;

	public ConsumerThread(DataBox dataBox) {
		super("ConsumerThread");
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			String data = dataBox.getData();
			System.out.println("dataBox.getData() : " + data);
		}
	}
}