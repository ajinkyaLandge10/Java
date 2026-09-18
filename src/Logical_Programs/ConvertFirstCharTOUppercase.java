package Logical_Programs;

public class ConvertFirstCharTOUppercase {

	public static void main(String[] args) {
		
		firstCharToUpper("selenium");
	}
	
	public static void firstCharToUpper(String str) {
		str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
		System.out.println(str);
	}

}
