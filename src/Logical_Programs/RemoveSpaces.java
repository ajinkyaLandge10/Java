package Logical_Programs;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();

		String result = str.replaceAll("\\s+", "");
		System.out.println("String after removing Spcaes : " + result);

	}

}
