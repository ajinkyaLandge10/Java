package MultiThreading;

public class Ex_03_T2 extends Thread {

	@Override
	public void run() {
		for (int i = 5; i >= 1; i--) {
			System.out.println("Reverse : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
