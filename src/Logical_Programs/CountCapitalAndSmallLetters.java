package Logical_Programs;

import java.util.Scanner;

//Write a program to count the Capital letters and Small letters from the given String

public class CountCapitalAndSmallLetters {
	
	public static String numberOfCapAndSmall(String str) {
		int cap = 0, small = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
					cap++;
				} else {
					small++;
				}
			}
		}
		return "Capital: " + cap + "\nSmall: " + small;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();

		System.out.println(numberOfCapAndSmall(str));
		sc.close();
	}
}
