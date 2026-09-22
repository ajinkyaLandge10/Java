package Logical_Programs;

public class MoveAllZerosToTheEnd {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 3, 4, 0 };
		int index = 0;

		for (int num : arr) {
			if (num != 0) {
				arr[index++] = num;
			}
		}

		while (index < arr.length) {
			arr[index++] = 0;
		}

		for (int num : arr) {
			System.out.print(num + " ");
		}

	}
}
