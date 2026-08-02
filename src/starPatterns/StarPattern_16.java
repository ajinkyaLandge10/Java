package starPatterns;

public class StarPattern_16 {

// Creating Method & Just pass input

	public static void rightTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		StarPattern_16.rightTriangle(10);
	}
}
