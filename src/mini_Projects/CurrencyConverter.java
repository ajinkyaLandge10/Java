package mini_Projects;

import java.util.Scanner;

public class CurrencyConverter {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----*Currency Converter*-----");

		System.out.print("Enter Amount: ");
		double amount = sc.nextDouble();

		System.out.println("Select Source Currency:");
		System.out.println("1. USD");
		System.out.println("2. INR");
		System.out.println("3. EUR");
		int from = sc.nextInt();

		System.out.println("Select Target Currency:");
		System.out.println("1. USD");
		System.out.println("2. INR");
		System.out.println("3. EUR");
		int to = sc.nextInt();

		double result = amount;

		if (from == 1 && to == 2) { // USD → INR
			result = amount * 92.60;
		} else if (from == 2 && to == 1) { // INR → USD
			result = amount / 92.60;
		} else if (from == 1 && to == 3) { // USD → EUR
			result = amount * 0.86;
		} else if (from == 3 && to == 1) { // EUR → USD
			result = amount / 0.86;
		} else if (from == 2 && to == 3) { // INR → EUR
			result = amount * 0.0094;
		} else if (from == 3 && to == 2) { // EUR → INR
			result = amount / 0.0094;
		}

		System.out.println("Converted Amount: " + result);

		sc.close();

	}
}
