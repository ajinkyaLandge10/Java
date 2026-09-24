package MultiThreading;

public class Ex_03_T3 extends Thread {

	public static void main(String[] args) {
		Ex_03_T1 t1 = new Ex_03_T1();
		Thread thread = new Thread(t1);

		Ex_03_T2 t2 = new Ex_03_T2();

		thread.start();
		t2.start();
	}
}
