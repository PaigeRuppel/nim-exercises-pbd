package whileloops;

import java.util.ArrayList;
import java.util.Scanner;

public class Nim {

	public static void main(String[] args) {
		// Start by placing counters (coins or toothpicks or something) into 3
		// piles.
		// Player #1 picks a pile, then removes one or more counters from that
		// pile. (It's okay to take the whole pile.)
		// Player #2 picks a pile, then removes one or more counters from that
		// pile.
		// Player #1 plays again. (It's okay to choose a different pile this
		// time.)
		// Whichever player is forced to take the last counter is the LOSER.
		Scanner input = new Scanner(System.in);

		int a = 5;

		int b = 5;

		int c = 5;

		int countersRemaining = a + b + c;

		System.out.println("Player 1, enter your name:");
		String player1 = input.next();
		System.out.println("Player 2, enter your name:");
		String player2 = input.next();

		while (countersRemaining > 1) {
			counterCheck(a, b, c);
			System.out.println(player1 + ", please pick a pile");
			String player1Pick = input.next();
			System.out.println("How many to remove from pile " + player1Pick.toUpperCase() + "?");
			int player1Remove = input.nextInt();
			switch (player1Pick.toUpperCase()) {
			case ("A"):
				a = a - player1Remove;
				if (a < 0) {
					System.out.println("Pile A can not be less than zero.");
					a = 0;
				}
				break;
			case ("B"):
				b = b - player1Remove;
				if (b < 0) {
					System.out.println("Pile B can not be less than zero.");
					b = 0;
				}
				break;
			case ("C"):
				c = c - player1Remove;
				if (c < 0) {
					System.out.println("Pile C can not be less than zero.");
					c = 0;
				}
				break;
			}

			counterCheck(a, b, c);
			countersRemaining = a + b + c;
			if (countersRemaining == 0) {
				System.out.println(player2 + " there are no counters remaining, so you WIN!");
			}
			System.out.println(player2 + ", please pick a pile");
			String player2Pick = input.next();
			System.out.println("How many to remove from pile " + player2Pick.toUpperCase() + "?");
			int player2Remove = input.nextInt();
			switch (player2Pick.toUpperCase()) {
			case ("A"):
				a = a - player2Remove;
				if (a < 0) {
					System.out.println("Pile A can not be less than zero.");
					a = 0;
				}
				break;
			case ("B"):
				b = b - player2Remove;
				if (b < 0) {
					System.out.println("Pile B can not be less than zero.");
					b = 0;
				}
				break;
			case ("C"):
				c = c - player2Remove;
				if (c < 0) {
					System.out.println("Pile C can not be less than zero.");
					c = 0;
				}
				break;
			}
			countersRemaining = a + b + c;
		}

		System.out.println(player2 + " there is only one counter remaining... " + player1 + ", you WIN!");
	}

	public static void counterCheck(int a, int b, int c) {
		System.out.println("A: " + a + "  |  " + "B: " + b + "  |  " + "C: " + c);
	}

}