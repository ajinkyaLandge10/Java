package Logical_Programs;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
		System.out.println("Before Removing Duplicates : " + Arrays.toString(arr));

		LinkedHashSet<Integer> unique = new LinkedHashSet<Integer>();
		for (int num : arr) {
			unique.add(num);
		}
		System.out.println("After Removing Duplicates : " + unique);
	}
}
