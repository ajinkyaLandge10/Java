package CollectionsPract;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Ex_03 {
	public static void main(String[] args) {

// Create an array of String type
		String[] arr = { "Dog", "Cat", "Horse" };

// Print array
		System.out.println("Array Elements......");
		for (String str : arr) {
			System.out.println(str);
		}

// Create an ArrayList from an array
		ArrayList animals = new ArrayList(Arrays.asList(arr));
		System.out.println("Array List Elements......" + animals);

	}
}
