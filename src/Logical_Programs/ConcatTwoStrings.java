package Logical_Programs;

import java.util.Scanner;

//  Write a program to concatenate two Strings

public class ConcatTwoStrings {

	public static String concatString(String str1, String str2) {
		String ans = "";
		ans = str1 + " " + str2;
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String str1 = sc.next();
		System.out.println("Enter second string: ");
		String str2 = sc.next();
		System.out.println(concatString(str1, str2));

		sc.close();

	}

}
