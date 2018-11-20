package thread;

public class EvenOddPrint {
	public static Object objLock = new Object();
	public static String currentState = "EVEN";

	public static void main(String[] args) {
		Thread t1 = new Thread(new EvenThread());
		Thread t2 = new Thread(new OddThread());
		t1.start();
		t2.start();
	}
}

class EvenThread implements Runnable {
	String allowedState = "EVEN";

	@Override
	public void run() {
		for (int i = 0; i <= 10; i = i + 2) {
			synchronized (EvenOddPrint.objLock) {				
				if (allowedState != EvenOddPrint.currentState) {
					try {
						Thread.sleep(10000);
						EvenOddPrint.objLock.wait();
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
				System.out.print(" " + i);
				EvenOddPrint.currentState = "ODD";
				EvenOddPrint.objLock.notify();
			}
		}
	}
}

class OddThread implements Runnable {
	String allowedState = "ODD";

	@Override
	public void run() {
		for (int i = 1; i <= 9; i = i + 2) {
			synchronized (EvenOddPrint.objLock) {
				if (allowedState != EvenOddPrint.currentState) {
					try {
						EvenOddPrint.objLock.wait();
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
				System.out.print(" " + i);
				EvenOddPrint.currentState = "EVEN";
				EvenOddPrint.objLock.notify();
			}
		}
	}
}
