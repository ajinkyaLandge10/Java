package Logical_Programs;

import java.util.Scanner;

//  Write a program to count the Consonants and Vowels from the given String

public class CountConsonantsAndVowels {

	public static String countVowelsAndConsonent(String str) {
		int cons = 0, vowel = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				vowel++;
			} else {
				cons++;
			}
		}
		return "Vowels : " + vowel + "\nConsonent: " + cons;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println(countVowelsAndConsonent(str));
		sc.close();
	}
}
