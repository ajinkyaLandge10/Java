package mini_Projects;

import java.util.Scanner;

public class QuizGame {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] questions = { "1) Which language is used for Android?", "2) Which keyword is used for inheritance?",
				"3) Who developed Java?", "4) Which symbol is used for single-line comment in Java?",
				"5) Which method is entry point of Java program?", "6) Which keyword is used to create object?",
				"7) Which concept allows method overriding?", "8) Which loop runs at least once?",
				"9) Which operator is used for comparison?", "10) Which company owns Java now?" };

		String[][] options = { { "A. Python", "B. Java", "C. C++", "D. Swift" },
				{ "A. extends", "B. import", "C. implement", "D. package" },
				{ "A. Microsoft", "B. Apple", "C. Sun Microsystems", "D. Google" },
				{ "A. //", "B. /*", "C. <!--", "D. #" }, { "A. start()", "B. run()", "C. main()", "D. execute()" },
				{ "A. class", "B. new", "C. object", "D. create" },
				{ "A. Encapsulation", "B. Abstraction", "C. Polymorphism", "D. Interface" },
				{ "A. for loop", "B. while loop", "C. do-while loop", "D. foreach" },
				{ "A. =", "B. ==", "C. +", "D. !" }, { "A. Microsoft", "B. Google", "C. Oracle", "D. IBM" } };

		char[] answers = { 'B', 'A', 'C', 'A', 'C', 'B', 'C', 'C', 'B', 'C' };

		int score = 0;

		System.out.println("===== Welcome to Quiz Game =====\n");

		for (int i = 0; i < questions.length; i++) {

			System.out.println(questions[i]);

			for (int j = 0; j < options[i].length; j++) {
				System.out.println(options[i][j]);
			}

			System.out.print("Your Answer: ");
			char userAnswer = sc.next().toUpperCase().charAt(0);

			if (userAnswer == answers[i]) {
				System.out.println("Correct! ✅\n");
				score++;
			} else {
				System.out.println("Wrong! ❌ Correct answer is " + answers[i] + "\n");
			}
		}

		System.out.println("Final Score: " + score + "/" + questions.length);

		sc.close();
	}

}
