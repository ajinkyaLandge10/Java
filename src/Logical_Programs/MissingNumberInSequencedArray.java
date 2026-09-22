package Logical_Programs;

public class MissingNumberInSequencedArray {

	public static void main(String[] args) {
		int [] arr = {1,3,6,7};
		for(int i=0 ;i< arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]+1 != arr[j]) {
					int missing = arr[i]+1;
					while(missing < arr[j]) {
						System.out.println("Missing Number : " + missing);
						missing++;
					}
					break;
				}
			}
		}
	}

}
