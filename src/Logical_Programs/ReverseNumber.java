package Logical_Programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = sc.nextInt();
		int rev = 0;
		while (n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		sc.close();
		System.out.println(rev);
	}

}
