package Logical_Programs;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		String text = "hello welcome to java";
		String[] words = text.split(" ");
		for (int i = 0; i < words.length; i++) {
			char[] letters = words[i].toCharArray();
			if (letters.length > 0) {
				letters[0] = Character.toUpperCase(letters[0]);
			}
			words[i] = new String(letters);
		}
		System.out.println(String.join(" ", words));

	}

}
