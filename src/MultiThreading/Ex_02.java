package MultiThreading;

//Creating thread using Thread class

public class Ex_02 extends Thread {

	public void run() {
//      task for thread
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Ex_02 t2 = new Ex_02();
		t2.start();
	}
}
