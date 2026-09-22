package Logical_Programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		
		if(s1.length() != s2.length()) {
			System.out.println("Not Anagram");
			return;
		}
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean isAnagram = Arrays.equals(arr1, arr2);
		System.out.println(isAnagram ? "Anagram" : "Not Anagram");
	}
}
