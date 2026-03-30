package alphabetPatterns;

public class AlphabetPattern_05 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int s = 1; s <= 5-i; s++) {
				System.out.print(" ");
			}
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			ch -= 2;
			for (int j = 1; j < i; j++) {
				System.out.print(ch);
				ch--;
			}
			System.out.println();
		}
	}

}
