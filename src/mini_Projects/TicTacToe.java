package mini_Projects;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends Frame implements ActionListener {

	Button[] buttons = new Button[9];
	char currentPlayer = 'X';

	public TicTacToe() {

		setLayout(new GridLayout(3, 3));

		for (int i = 0; i < 9; i++) {
			buttons[i] = new Button("");
			buttons[i].setFont(new Font("Arial", Font.BOLD, 40));
			buttons[i].addActionListener(this);
			add(buttons[i]);
		}

		setSize(400, 400);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		Button clicked = (Button) e.getSource();

		if (clicked.getLabel().equals("")) {
			clicked.setLabel(String.valueOf(currentPlayer));

			if (checkWinner()) {
				showResult("Player " + currentPlayer + " Wins!");
				return;
			}

			if (isBoardFull()) {
				showResult("Match Draw!");
				return;
			}

			currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
		}
	}

	// Check Winning Conditions
	boolean checkWinner() {

		String p = String.valueOf(currentPlayer);

		int[][] winPatterns = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, // rows
				{ 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 }, // columns
				{ 0, 4, 8 }, { 2, 4, 6 } // diagonals
		};

		for (int[] pattern : winPatterns) {
			if (buttons[pattern[0]].getLabel().equals(p) && buttons[pattern[1]].getLabel().equals(p)
					&& buttons[pattern[2]].getLabel().equals(p)) {
				return true;
			}
		}
		return false;
	}

	// Check if all boxes filled
	boolean isBoardFull() {
		for (Button b : buttons) {
			if (b.getLabel().equals("")) {
				return false;
			}
		}
		return true;
	}

	// Show result and ask Restart or Quit
	void showResult(String message) {

		int option = javax.swing.JOptionPane.showConfirmDialog(this, message + "\nRestart Game?", "Game Over",
				javax.swing.JOptionPane.YES_NO_OPTION);

		if (option == javax.swing.JOptionPane.YES_OPTION) {
			resetBoard();
		} else {
			System.exit(0);
		}
	}

	// Reset Game
	void resetBoard() {
		for (Button b : buttons) {
			b.setLabel("");
		}
		currentPlayer = 'X';
	}

	public static void main(String[] args) {
		new TicTacToe();
	}
}