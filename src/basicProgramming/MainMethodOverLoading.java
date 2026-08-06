package basicProgramming;

public class MainMethodOverLoading {
	
//	can we OverLoad main Method --- Yes

	public static void main(String[] args) {
		System.out.println("Main Method");
		MainMethodOverLoading.main(10);
	}
	public static void main(int a) {
		System.out.println("Main Method " + a);
	}
	public static void main(int a, int b) {
		System.out.println("Main Method " + a+b);
	}
	public static void main(String args) {
		System.out.println("Main Method "+ args);
	}
	
}
