package Logical_Programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 6, 3, 7, 4, 8 };

		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new LinkedHashSet<>();

		for (int num : arr) {
			if (!seen.add(num)) {
				duplicates.add(num);
			}
		}
		System.out.println(seen);
		System.out.println(duplicates);
	}
}
