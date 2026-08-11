package Logical_Programs;

//Suing for loop
public class ReverseString_04 {

	public static void main(String[] args) {
		String str = "Ajinkya";
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		System.out.println(reversed);

	}

}
