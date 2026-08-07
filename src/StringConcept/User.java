package StringConcept;
//@formatter:off
public class User {

	public static void main(String[] args) {

// String: Is a class
		
//		1. Using literals:
		String s2 = "Selenium"; // 1
		
//		2. Using new keyword
		String s1 = new String("Hello");// 2 - Heap,SCP
		
		String s3 = "Hello";// 0 -- Already present in SCP
		String s4 = new String("Hello");// 1 - Heap
		
		System.out.println(s1 == s3);// False
		System.out.println(s1.equals(s3));// True
		System.out.println(s1 == s4);// False
		System.out.println(s1.equals(s4));// True
		
		String s5 = "Hello";// 0
		System.out.println(s3 == s5);// True
		System.out.println(s1.equals(s5));// True
		
		String s6 = "hello";// 1 - SCP
		String s7 = new String("Neha");// 2 - Heap,SCP
		
		String s8 = s7.intern();//so when we create string with new keyword 1 - Heap & 1-SCP will be created but the SCP one is not referred
								//this method will help to create reference for that
		
		System.out.println(s7 == s8);// False
		System.out.println(s7.equals(s8));//True
		
		System.out.println();
		
		String str = "Hello";
		System.out.println(str+"Selenium");//HelloSelenium
		System.out.println(str);// Hello
		
		String str1 = "hello";	
		str1 = str1+"Automation"; 
		System.out.println(str1); //helloAutomation
		
		System.out.println(str1+100);//helloAutomation100
		System.out.println(str1+200);//helloAutomation200
		
		System.out.println();
		//
		StringBuilder sb = new StringBuilder("Automation");//1
		System.out.println(sb.append("Testing"));
		System.out.println(sb);

	}

}
