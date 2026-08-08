package StringConcept;
//@formatter:off
/*	- Write a generic method to reverseString
 	- Parameter : String
 	- return string : reversed String
 */

public class StringReverse {
	public static String reverseString(String str) {

// 1. null check : this check should be 1st check
		if (str == null) {
			System.out.println("String is null...");
			return null;
		}

		int len = str.length();
// 2. Blank check :
		if(str.isBlank()) {
			System.out.println("String is Blank");
			return str;
		}	
// 3. length check :
		if (len==1 || len==0) {
			return str;
		}

		
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
//		System.out.println(reverseString("Selenium Automation"));
//		System.out.println(reverseString("Selenium"));
//		System.out.println(reverseString("123"));
//		System.out.println(reverseString("T"));
//		System.out.println(reverseString(null));
//		System.out.println(reverseString(""));
		System.out.println(reverseString("           "));

	}
}
