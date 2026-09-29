package mini_Projects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors:");
		int player = sc.nextInt();

		int computer = rand.nextInt(3);
		System.out.println("Computer chose: " + computer);

		if (player == computer) {
			System.out.println("It's a Draw!");
		} else if ((player == 0 && computer == 2) || (player == 1 && computer == 0) || (player == 2 && computer == 1)) {
			System.out.println("You Win!");
		} else {
			System.out.println("Computer Wins!");
		}
		
	}
}
