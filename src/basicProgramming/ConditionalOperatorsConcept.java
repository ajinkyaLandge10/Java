package basicProgramming;

public class ConditionalOperatorsConcept {
	public static void main(String[] args) {
		
		int a = 20;
		if (a == 10) { // Condition is false
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		int x = 100;
		int y = 100;
		if (x == y) { // Condition is true
			System.out.println("Both are Equal");
		}
		
		if (true) {
			System.out.println("Hello World");
		} else {// dead code
			System.out.println("bye World");
		}
		
		boolean flag = false;
		if (flag) {
			System.out.println("Hello World");
		} else {
			System.out.println("bye World");
		}
			
		int g = 100;
		int h = 200;
		if (h >= g) {// Condition is true
			System.out.println("h is greater than g");
		} else {
			System.out.println("g is greater than h");
		}

//		WAP three different values ---> max value
		int X = 700;
		int Y = 900;
		int Z = 600;
//		&& --> short circuit operator
//		true && true && false && true && true
		
		if (X > Y && X > Z) { // false && true = false
			System.out.println("X is the greatest");
		} else if (Y > Z) { // true
			System.out.println("Y is the greatest");
		} else {
			System.out.println("Z is the greatest");
		}

	}

}
