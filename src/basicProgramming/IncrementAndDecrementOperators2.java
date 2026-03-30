package basicProgramming;

public class IncrementAndDecrementOperators2 {

	public static void main(String[] args) {

		int i = 11;
		int j = i++ + ++i;
		System.out.println(j);

		int a = 11, b = 22, c;
		c = a + b + a++ + b++ + ++a + ++b;
//		    11 + 22 + 11 + 22 + 13 + 24
		System.out.println("a=" + a);// a=13
		System.out.println("b=" + b);// 24
		System.out.println("c=" + c);// 103

		int j1 = 0;// 0
		int k = j1++ - --j1 + ++j1 - j1--;
//		    k =
		System.out.println(k);
		System.out.println(j);

		boolean g = true;
//		System.out.println(g++);

		int i2 = 19, j2 = 29, k2 = 0;
		int m2 = i2-- - j2-- - k2--;
//		    m2 =
		System.out.println("i=" + i2);// i=19
		System.out.println("j=" + j2);
		System.out.println("k=" + k2);
		System.out.println(m2);

		int m3 = 0, n3 = 0;
		int p3 = --m3 * --n3 * n3-- * m3--;
		System.out.println(p3);
		System.out.println(m3);
		System.out.println(n3);

		int a1 = 1;
		int b1 = a1++ + ++a1 * --a1 - a1--;
		System.out.println(b1);
		System.out.println(a1);

		int ch = 'A';// 65
		System.out.println(ch++);
		System.out.println((char) ch);

		char ch1 = 'A';// 65
		System.out.println(ch1++);// A
		System.out.println(ch1);// B

	}

}
