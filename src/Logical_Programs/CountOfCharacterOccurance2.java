package Logical_Programs;

import java.util.HashMap;
import java.util.Scanner;

public class CountOfCharacterOccurance2 {
	
	public static void getCharCount(String givenString, char searchChar) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char charArray[] = givenString.toCharArray();
		for (char c : charArray) {
			// Convert both to lowercase for case-insensitive matching
			c = Character.toLowerCase(c);

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		searchChar = Character.toLowerCase(searchChar);

		if (map.containsKey(searchChar)) {
			System.out.println("Occurrence of '" + searchChar + "' is : " + map.get(searchChar));
		} else {
			System.out.println("Character not found");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.nextLine();
		System.out.println("Enter Character to Search:");
		char ch = sc.next().charAt(0);
		getCharCount(str, ch);
		sc.close();
	}
	

}
