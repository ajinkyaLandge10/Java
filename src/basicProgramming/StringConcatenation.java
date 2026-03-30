package basicProgramming;

public class StringConcatenation {

	public static void main(String[] args) {

		String s1 = "Selenium Java";
		String s2 = "100";
		
		String x = "Hello";
		String y = "World";
		
		int a = 100;
		int b = 200;
		double c = 12.33;
		double d = 22.22;
		
		System.out.println(a + b); //300
		System.out.println(x + y); //HelloWorld
		System.out.println(a + x); //100Hello
		System.out.println(a + x + b); //100Hello200
		System.out.println(a + b + x + y); //300HelloWorld
		System.out.println(x + y + a + b);// HelloWorld100200
		System.out.println(x + y + (a + b));// HelloWorld300
		System.out.println(a + b + x + y + a + b);// 300HelloWorld100200
		System.out.println(c + d + x + y); //34.55HelloWorld
		System.out.println(c + d + x + y + c + d);// 34.55HelloWorld12.3322.22
		System.out.println(a + b + c + d + x + y); //334.54999999999995HelloWorld
		
		System.out.println("the value of a " + a); //the value of a 100
		System.out.println("the value of b " + b); //the value of b 200
		System.out.println("the sum is: " + (a + b)); //the sum is: 300
		
		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1);// a
		System.out.println((byte) c1);// 97
		System.out.println(c1 + c2);// 97+98=195
		System.out.println(c1 + 1);// 97+1=98
		System.out.println(c1 + "1");// a1
		System.out.println(c1 + c2 + x + y);// 195HelloWorld
		System.out.println(c1 + " " + c2);// a b
		System.out.println("c1" + "c2"); //c1c2

	}

}
