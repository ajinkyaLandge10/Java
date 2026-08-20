package Logical_Programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any year");
		int year = sc.nextInt();
		sc.close();

		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + ":Is Leap year");
		} else {
			System.out.println(year + ":Is not Leap year");
		}

	}

}
