package Logical_Programs;

import java.util.Scanner;

public class PrimeNumber_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num = sc.nextInt();
		sc.close();
		int temp = 0;

		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println(num + ":Is Prime Number");
		} else {
			System.out.println(num + ":Is Non-Prime Number");
		}

	}

}
