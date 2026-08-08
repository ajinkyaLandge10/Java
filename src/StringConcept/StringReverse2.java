package StringConcept;

public class StringReverse2 {

	public static void main(String[] args) {
		String str = "Selenium";

		// Reverse String using StringBuilder:
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());

		// Reverse String using StringBuffer:
		StringBuffer sb1 = new StringBuffer(str);
		System.out.println(sb1.reverse());

	}

}
