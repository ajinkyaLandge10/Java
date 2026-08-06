package basicProgramming;

public class Calculator {

	public int addition(int a, int b) {
		int addition = a+b;
		return addition;
	}
	public int subtraction(int a, int b) {
		int subtraction = a-b;
		return subtraction;
	}
	public int division(int a, int b) {
		int division = a/b;
		return division;
	}
	public int multiplication(int a, int b) {
		int multiplication = a*b;
		return multiplication;
	}
	
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		int add = c.addition(10, 20);
		System.out.println("The Addition is : " + add);
		
		int sub = c.subtraction(20, 10);
		System.out.println("The Subtraction is : " + sub);
		
		int div = c.division(20, 10);
		System.out.println("The Division is : " + div);
		
		int mul = c.multiplication(10, 20);
		System.out.println("The Multiplication is : " + mul);
	}

}
