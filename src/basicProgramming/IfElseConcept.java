package basicProgramming;

public class IfElseConcept {
	public static void main(String[] args) {
		int marks = 101;

		if (marks > 100) {
			System.out.println("Incorrect Marks");
		} else {
			if (marks >= 90) {
				System.out.println("Grade A");
				if (marks == 100) {
					System.out.println("Eligible to Scholarship");
				}
			} else {
				System.out.println("Less than 90 marks");
				if (marks >= 80) {
					System.out.println("Grade B");
				} else {
					System.out.println("Less than 80");
					if (marks >= 70) {
						System.out.println("Grade C");
					} else {
						System.out.println("Less than 70");
					}
				}
			}
		}
	}
}
