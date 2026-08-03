package basicProgramming;

import java.util.Arrays;

public class ArrayLiterals {
	public static void main(String[] args) {
		
//Declaration of  Array
		
//	1.	with new keyword --> when you are not sure about the values
		int i[] = new int[10];//0-9
		
//	2.  Array Literals --> when you are already aware of the values
		int num[] = {1,2,3,4,5,6};//0-5
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[5]);
//		System.out.println(num[6]);//AIOB
		
		System.out.println(num.length);//6
		System.out.println(num);//[I@4517d9a3
		System.out.println(Arrays.toString(num));//[1, 2, 3, 4, 5, 6]
		
		for(int e : num) {
			System.out.println(e);
		}
		System.out.println();
		
		
		String stNames[] = {"Ajinkya", "Akshay", "Neha", "Ritesh"};
//		indexbased loop
		for(int s=0 ;s<=stNames.length-1;s++) {
			System.out.println(stNames[s]);
		}
		System.out.println();
		
//		for each loop
		for(String e: stNames) {
			System.out.println(e);
		}
		System.out.println();
		
		
		Object empInfo[] = {"Priya", 25, 34.55, true, 'f'};
//		indexbased loop
		for(int e=0 ;e<=empInfo.length-1;e++) {
			System.out.println(empInfo[e]);
		}
		System.out.println();
		
//		for each loop
		for(Object e: empInfo) {
			System.out.println(e);
		}
		System.out.println();
		
		int number[] = {1,2,3,4,5,6};//0-5==>6
		for(int r = number.length-1;  r>=0 ; r--) {
		System.out.println(number[r]);
		}
		
	}

}
