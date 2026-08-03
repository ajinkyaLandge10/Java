package basicProgramming;

import java.util.Arrays;
//@formatter:off
public class ArraysConcept_Part1 {
	
	public static void main(String[] args) {
/*		Array: collection of similar types of data: 
 		limitations: 
 		1. size is fixed:static array: to overcome this, we use dynamic array (ArrayList) 
		2. can store only similar types of data
*/

//		Declaring an array
//		1. using new keyword:
//		Li = 0; Hi=len-1 =4-1 =3; len = Hi+1 = 4
		int i[] = new int[4]; // 0-3
		
//		i[-1] = 60;//AIOB
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
//		i[4] = 50;//AIOB
		
		System.out.println(i.length);// 4
		System.out.println(i[0]);
		System.out.println(i[3]);
//		System.out.println(i[4]); ArrayIndexOutOfBoundsException: AIOB
		System.out.println(i[0] + i[1]);
		
		
//		fetch/print all the values of Array:
		System.out.println(i); //[I@4517d9a3 --> Garbage / memory address of the array
		System.out.println(Arrays.toString(i));//[10, 20, 30, 40]
		
		
//		using for loop:
		for (int k = 0; k <= i.length - 1; k++) {
			System.out.println(i[k]);// 10 20 Hello 30 40
			if (i[k] == 20) {
				System.out.println("Hello");
				break;
			}
		}

		int pop[] = new int[5];
		pop[0] = 100;
		pop[2] = 200;
		pop[4] = 500;
		System.out.println(Arrays.toString(pop));
		
		String str[] = new String[3];
		System.out.println(str[0]);
	}
}
