package Logical_Programs;

import java.util.Scanner;

public class CountNumberOfWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String str = sc.nextLine().trim();
		int count = 0;
		if (str.length() == 0) {
			System.out.println("Number of Words = 0");
			return;
		}
		String[] words = str.split("\\s+");
		count = words.length;
		System.out.println("Number of words : " + count);

	}

}
