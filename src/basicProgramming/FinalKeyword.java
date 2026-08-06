package basicProgramming;

public class FinalKeyword {
	
//	Only class level variables : we can declare static as well as final
//	local variable (inside main method or any method): we can declare variables final but not static
	
	static final int wheels = 4;

	public static void main(String[] args) {
		
		final int days = 7; //local var
		System.out.println(days*100);
		
//		days = 10;
//		System.out.println(days*100);
		

//		Why main method is Public ,Static & Void in nature ?
//		- Public so that it can be accessed from any where by JVM without creating Object
//	    - because by making it static it is freely available from CMA to JVM no need to create object unnecessarily
//		- Caller/user method: No business logic: no return: void
//		- static: no need to create the object by JVM
	}

}
