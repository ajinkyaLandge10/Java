package Logical_Programs;

public class Move_FirstCharToLast_LastToFirst {
	
	public static void main(String[] args) {
		moveFirstCharToLastAndLastToFIrst("SeleniumAutomation");
	}
	
	public static void moveFirstCharToLastAndLastToFIrst(String str) {
		String res = str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
		System.out.println(res);
	}

}
