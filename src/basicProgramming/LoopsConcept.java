package basicProgramming;

public class LoopsConcept {
	public static void main(String[] args) {
//@formatter:off
		
//1. while loop:	
/*	when to use while loop: use cases:
	-when number of iterations are not fixed
	-waiting for the web element on the page
	-waiting for the page loading
	-linkdIn,Facebook,Swiggy,Zomato: infinite scrolling
	-payment: waiting for the confirmation alert
	-pagination
	-calendar
	-file download : 5 secs, 10 secs, 50 secs
*/		
		System.out.println("-------While Loop-------");
		System.out.println("Print 1 to 10");
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		int z=10;
		while(z>=1) {
			System.out.println(z);
			z--;
		}
		System.out.println();
		
		boolean flag = true;
		while(flag) {
		System.out.println("Welcome to Selenium Java Automation");
			break;
		}
		System.out.println();
		
		int j = 1;
		while (j <= 50) {
			System.out.println(j);
			if (j % 5 == 0) {
				System.out.println("Hello");
				break;
			}
			j++;
		}

//	Print Even Number between 1 to 20 using while loop
//	Print Odd Number between 1 to 20 using while loop
		System.out.println();

		
//2. For loop:
/*	when to use for loop: use cases:
	-When number of iterations are already fixed:
	-Arrays
	-Drop down: month: 12
	-Menu items: 
	-Read excel sheet: 10 rows: for loop
*/
		System.out.println("-------For Loop-------");
		System.out.println("Print 1 to 10");
		for (int k = 1; k <= 10; k++) {
			System.out.println(k);
		}
		System.out.println();
		
		for (byte b = 1; b <= 5; b++) {
			System.out.println(b);
		}
		System.out.println();
		
		for (float c = 1.1f; c <= 5.5; c++) {
			System.out.println(c);
		}
		System.out.println();
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + " = " + (byte) ch);
		}
		System.out.println();
		
		for(;;) { //it will create infinite loop if not break
			System.out.println("Welcome To Taj");
			break;
		}
		System.out.println();
		
//		for--break;
		for (int n = 1; n <= 50; n++) {
			System.out.println(n);
			if (n % 5 == 0) {
				System.out.println("End");// Bye
				break;
			}
			break;
		}
		System.out.println();
		
		for(int n=1; n<=20; n++) {
			if(n % 2 == 0) {
				System.out.println(n + " = Even number");
			}else {
				System.out.println(n + " = Odd number");
			}
		}

//		Print Even Number between 1 to 20 using while loop
//		Print Odd Number between 1 to 20 using while loop
//		Print ASCII Table --> a-z, A-Z, 0-9 
		System.out.println();

		
//3. Do-While loop:		
/*	when to use Do-While loop: use cases
	-when number of iterations are not fixed
	-web Page: link: 10 secs to be loaded --> 
	-1st: 0 sec: link is available: no need to go the loop part - click on it
	-2nd:  2 4 6 8
*/
		int s = 1;
		do {
			System.out.println(s);
			s++;
		}while(s<=10);
		System.out.println();
		
		int x=10;
		do {
			System.out.println(x);
			x--;
		}while(x>0);
		System.out.println();
		
		do {
			System.out.println("Welcome to Selenium Java Automation");
		}
		while(false);
		
		
		
		
		
		
		
		

	}
}
