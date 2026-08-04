package basicProgramming;

import java.util.Arrays;
//@formatter:off
public class TwoDimensionalArrayConcept {

	public static void main(String[] args) {

		int arr[][] = new int[4][5];
		arr[0][0] = 100;
		arr[0][1] = 200;

		System.out.println(arr.length);

		// Array Literals:
		int num[][] = { 
					{ 1, 2, 3 },
					{ 2, 3, 4 },
					{ 3, 4, 5 }
				};

		System.out.println(num.length);
		System.out.println(Arrays.deepToString(num));

//		 To iterate 2D array: use two loops: outer-inner loops
		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num[row].length; col++) {
				System.out.print(num[row][col] + " ");// [0][0]=1 2 3
				// break;
			}
			System.out.println();
		}
		
		System.out.println();
		
		Object empInfo[][] = {
						{"Neha", 25, "SDET1", true},
						{"Ajinkya", 27, "SDET2", false},
						{"Ritesh", 28, "SDET3", true}
				};
		
//		iterate Array Using For Loop
		for(int row =0 ;row<empInfo.length ;row++) {
			for(int col =0 ;col<empInfo[row].length;col++) {
				System.out.print(empInfo[row][col]+ " ");
			}
			System.out.println();
		}
		System.out.println();
	
		
//		iterate Array Using For Each Loop
		// Using nested for-each loops
        for (Object[] row : empInfo) {
            for (Object value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

	}

}
