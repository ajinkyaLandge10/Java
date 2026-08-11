package Logical_Programs;

public class DeCompressString {

	public static void main(String[] args) {
		String str = "4a3j27";
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i)) && i+1 < str.length()) {
				int count = str.charAt(i) - '0';
				char ch = str.charAt(i + 1);
				
				for(int j=0;j<count;j++) {
					System.out.print(ch);
				}
			}
		}

	}

}
