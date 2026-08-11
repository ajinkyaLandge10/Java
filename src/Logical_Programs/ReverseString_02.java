package Logical_Programs;

// using Character array
public class ReverseString_02 {

	public static void main(String[] args) {
		String str = "Ajinkya";
		char[] arr = str.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}

	}

}
