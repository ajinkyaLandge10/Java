package Logical_Programs;

import java.util.Scanner;

public class AreaOfCircle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		double radius = sc.nextDouble();
		sc.close();

		System.out.println("Area Of Circle is : " + Math.PI * radius * radius);
	}
}
