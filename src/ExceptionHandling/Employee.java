package ExceptionHandling;

public class Employee {
	String name;

	public static void main(String[] args) {

		System.out.println("Start");
		System.out.println("Start");
		System.out.println("Start");

		Employee obj = new Employee();
		obj = null;

		try {
			obj.name = "Neha"; // NullPointerException
			int i = 9 / 0; // ArithmeticException
			System.out.println("Hello");
		} 
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException is Coming...");
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException is coming...");
			e.printStackTrace();
		}

		System.out.println("End");
		System.out.println("End");
		System.out.println("End");

	}

}
