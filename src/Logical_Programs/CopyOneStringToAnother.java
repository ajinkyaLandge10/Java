package Logical_Programs;

import java.util.Scanner;

//  Write a program to copy one String to another String

public class CopyOneStringToAnother {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");

		String first = sc.nextLine();
		String second = first;
		System.out.println(second);

		sc.close();
	}
}
