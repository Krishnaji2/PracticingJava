package thread;

public class JoinTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread());
		t1.start();
		
		Thread t2 = new Thread(new MyThread());
		t2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyThread implements Runnable {

	@Override
	public void run() {
		
		for(int i=0; i< 5; i++) {
			System.out.println(Thread.currentThread().getName() +" " + i);
		}
	}
	
}
