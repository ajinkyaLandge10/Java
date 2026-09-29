package interviewQuestions;

public class InterviewQuestion_03 {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		System.out.println("Before Swapping Values");
		System.out.println(num1);
		System.out.println(num2);

		num1 = num1 + num2; // 10+20=30
		num2 = num1 - num2; // 30-20=10
		num1 = num1 - num2; // 30-10=20

		System.out.println("After Swapping Values");
		System.out.println(num1);
		System.out.println(num2);

	}
}
