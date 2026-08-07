package ExceptionHandling;
//@formatter:off
public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println("Start");
		try {
			int i = 9 / 0;
			System.out.println("Hello");
		} 
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException is coming...");
		} 
		finally {
			System.out.println("Finally block");
		}

	}
}

/* Use cases of finally block:
 		- DB connection with JAVA:
 		1.make the connection with DB -- Pass
 		2.hit the SQL query -- Pass
 		try {
 		3.fetch the data from a table -- Exception
 		}catch() {}
 		4.close the connection with DB --finally block
*/
//
