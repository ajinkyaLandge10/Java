package basicProgramming;

public class IncrementAndDecrementOperators2 {
//@formatter:off
	
	public static void main(String[] args) {

		int i = 11;
		 i = i++ + ++i;
		System.out.println(i);

		int a = 11, b = 22, c;
		c = a + b + a++ + b++ + ++a + ++b;
//		    11 + 22 + 11 + 22 + 13 + 24
		System.out.println("a=" + a);// 13
		System.out.println("b=" + b);// 24
		System.out.println("c=" + c);// 103

		int j = 0;// 0
		int k = j++ - --j + ++j - j--;
//		    k = 0 - 0 + 1 - 1 
		System.out.println(k);//0
		System.out.println(j);//0

		boolean g = true;
//		System.out.println(g++);

		int i2 = 19, j2 = 29, k2 = 0;
		int m2 = i2-- - j2-- - k2--;
//		    m2 =
		System.out.println("i2 = "+i2);// i=18
		System.out.println("j2 = "+j2);// j=28
		System.out.println("k2 = "+k2);// k=-1
		System.out.println("m2 = "+m2);// -10

		int m3 = 0, n3 = 0;
		int p3 = --m3 * --n3 * n3-- * m3--;
		System.out.println("p3 = "+p3);
		System.out.println("m3 = "+m3);
		System.out.println("n3 = "+n3);

		int a1 = 1;
		int b1 = a1++ + ++a1 * --a1 - a1--;
		System.out.println(b1);
		System.out.println(a1);

		int ch = 'A';// 65
		System.out.println(ch++);//65
		System.out.println(ch);//66
		System.out.println((char) ch);//B

		char ch1 = 'A';// 65
		System.out.println(ch1++);// A
		System.out.println(ch1);// B
		
		double d = 1.5, D = 2.5;
		double d1 = d++ + ++D;
		System.out.println(d1);
		System.out.println(d);
		System.out.println(D);
		
	}

}
