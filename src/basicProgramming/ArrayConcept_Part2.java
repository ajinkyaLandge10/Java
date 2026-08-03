package basicProgramming;

import java.util.Arrays;

public class ArrayConcept_Part2 {

	public static void main(String[] args) {

		byte b[] = new byte[3];// 0-2
		short sh[] = new short[4];// 0-3
		double d[] = new double[3];// 0-2

		float marks[] = new float[3];// 0-2
		marks[0] = 12.33f;
		marks[1] = 23.44f;
		marks[2] = 100; // 100.0
		System.out.println(Arrays.toString(marks));

		System.out.println();

		String empNames[] = new String[3];// 0-2
		System.out.println(Arrays.toString(empNames));
		empNames[0] = "Akshay";
		empNames[1] = "Ajinkya";
		empNames[2] = "Neha";

		System.out.println(Arrays.toString(empNames));
		System.out.println(empNames.length);// 3

//		index based loop
		for (int i = 0; i <= empNames.length - 1; i++) {
			System.out.println(empNames[i]);
			if (empNames[i].equals("Ajinkya")) {
				System.out.println("Promote to SDET-2");
				break;
			}
		}
		System.out.println();

//		for each loop: enhanced for loop:
		for (String e : empNames) {
			System.out.println(e);
			if (e.equals("Ajinkya")) {
				System.out.println("Promote to SDET-2");
				break;
			}
		}
		System.out.println();

		int i[] = new int[4]; // 0-3
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		for (int e : i) {
			System.out.println(e);
		}
		System.out.println();

		float numbers[] = new float[3];// 0-2
		numbers[0] = 12.33f;
		numbers[1] = 23.44f;
		numbers[2] = 100.22f;

		for (float e : numbers) {
			System.out.println(e);
		}
		System.out.println();

		char ch[] = new char[4];// 0-3
//		System.out.println((byte)ch[0]); //'\u0000' (or 0)
		ch[0] = 'a';
		ch[1] = 'A';
		ch[2] = '9';
		ch[3] = '$';

		System.out.println(ch); // aA9$-->no Garbage value: concatenated values of char array
		System.out.println(Arrays.toString(ch));// [a, A, 9, $]

		for (char e : ch) {
			System.out.println(e);
		}
		System.out.println();

//		Employee info: Name(string), Age(int), Salary(double), DOB(String), isActive(boolean), Gender(char)
//		Object Array:
		Object empInfo[] = new Object[6];// 0-5
		System.out.println(Arrays.toString(empInfo));
		empInfo[0] = "Ajinkya";
		empInfo[1] = 30;
		empInfo[2] = 35.55;
		empInfo[3] = "01-01-1995";
		empInfo[4] = true;
		empInfo[5] = 'M';

		System.out.println(Arrays.toString(empInfo));

//		index based loop
		for (int e = 0; e <= empInfo.length - 1; e++) {
			System.out.println(e + " = " + empInfo[e]);
		}
		System.out.println();

//		for each Loop
		int count = 0;
		for (Object e : empInfo) {
			System.out.println(count + " = " + e);
			count++;
		}

	}

}
