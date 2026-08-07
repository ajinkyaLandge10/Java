package StringConcept;

import java.util.Arrays;

//@formatter:off
public class StringManipulation {
	public static void main(String[] args) {

		String str = "Hi This is my java code and i am so happy";
		
		System.out.println(str.length()); //41
		System.out.println("Lowest Index = " + 0); //0
		System.out.println("Highest Index = " + (str.length() - 1));//40
		System.out.println(str.charAt(0));//H
		System.out.println(str.charAt(40));//Y
		
//		System.out.println(str.charAt(41));//StringIndexOutOfBoundsException-SIOB
//		System.out.println(str.charAt(-1));//StringIndexOutOfBoundsException-SIOB
		
		System.out.println(str.indexOf("H"));//0
		
		System.out.println(str.indexOf("i"));//1 -->First occurrence of i
		System.out.println(str.indexOf("i", str.indexOf("i")+1));//5 -->Second occurrence of i
		System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1));//8 -->Third occurrence of i
		System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1)+1));//28 -->Fourth occurrence of i

		System.out.println(str.indexOf("java"));//14
		System.out.println(str.indexOf("Ajinkya"));//-1
		
		String mesg = "Welcome admin";
		if(mesg.indexOf("admin")!= -1) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
//		trim: --> Clear the space from both corners not middle space
		String sr = "     Hello    World   ";
		System.out.println(sr.trim());//Hello    World
		
//		replace: --> Replace specific value with other value
		String dob = "01-01-1990";//01/01/1990
		dob = dob.replace("-", "/");
		System.out.println(dob);//01/01/1990
		
//		Remove space
		String sr1 = "    Hello        World    ";
		System.out.println(sr1.replace(" ", ""));//HelloWorld
		
//		toLower and toUpper
		String st1 = "Selenium";
		System.out.println(st1.toUpperCase());//SELENIUM
		System.out.println(st1.toLowerCase());//selenium
		
//		String comparison:
		String l1 = "Hello Selenium";
		String l2 = "hello selenium";
		System.out.println(l1.equals(l2));//False --> Hard Comparison
		System.out.println(l1.equalsIgnoreCase(l2));//True --> Soft Comparison
		
//		Contains:
		String m1 = "Hello this is java language";
		System.out.println(m1.contains("java"));//true
		//
		if(m1.contains("java")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
//		Sub-string:
		String order = "Your order id is 1234";
		System.out.println(order.substring(17));//1234
		System.out.println(order.substring(0, 10));//Your order
		System.out.println(order.substring(order.indexOf("is")+3, order.length()));//1234
		
//		Split:
		String lang = "Java_Python_Ruby_JavaScript_TypeScript";
		String lg[] = lang.split("_");
		System.out.println(lg[4]);//TypeScript
		System.out.println(Arrays.toString(lg));
		
		System.out.println("---------------------");
		
//		Interview Question
		String pop = "xXHelloSeleniumxXXTestingXxXAutomationXXxXJava";
		String p[] = pop.split("xX");
		System.out.println(p[0]);//Blank-empty value - Nothing
		System.out.println(p[1]);//HelloSelenium
		System.out.println(p[2]);//XTestingX
		System.out.println(p[3]);//AutomationXX
		System.out.println(p[4]);//Java
		System.out.println(Arrays.toString(p));//[, HelloSelenium, XTestingX, AutomationXX, Java]
		
		System.out.println("---------------------");
		
		String empInfo = "Neha;IBM;Pune;QA";
		System.out.println(empInfo.split(";")[0]);//Neha
		System.out.println(empInfo.split(";")[1]);//IBM
		System.out.println(empInfo.split(";")[2]);//Pune
		System.out.println(empInfo.split(";")[3]);//QA


	}

}
