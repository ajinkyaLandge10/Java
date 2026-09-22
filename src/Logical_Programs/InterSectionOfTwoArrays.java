package Logical_Programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class InterSectionOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 3, 4, 5, 6, 7 };

		Set<Integer> set1 = new HashSet<>();

		for (int num : arr1) {
			set1.add(num);
		}

		Set<Integer> result = new LinkedHashSet<>();

		for (int num : arr2) {
			if (set1.contains(num)) {
				result.add(num);
			}
		}
		System.out.println(result);
	}

}
