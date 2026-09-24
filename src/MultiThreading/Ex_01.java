package MultiThreading;

import MultiThreading.Ex_01;

//Creating thread using runnable interface

public class Ex_01 implements Runnable {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Value of i : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	public static void main(String[] args) {
//	    Creating object of MyThread
		Ex_01 t1 = new Ex_01();
		Thread thread = new Thread(t1);
		thread.start();

	}

}
