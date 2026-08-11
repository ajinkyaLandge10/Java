package Logical_Programs;

// Suing stringbuilder
public class ReverseString_01 {

	public static void main(String[] args) {
		String str = "Ajinkya";
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(reversed);

	}

}
