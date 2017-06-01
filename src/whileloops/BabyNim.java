package whileloops;

import java.util.Scanner;

public class BabyNim {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a = 3;
		int b = 3;
		int c = 3;
		int total = 9;

		while (total > 0) {
			System.out.println("A: " + a + "  |  " + "B: " + b + "  |  " + "C: " + c);

			System.out.println("Choose a pile:");
			String pilePick = input.next();

			System.out.println("Choose how many to remove from pile " + pilePick.toUpperCase() + ".");
			int remove = input.nextInt();

			switch (pilePick.toLowerCase()) {
			case ("a"):
				a = a - remove;
				break;
			case ("b"):
				b = b - remove;
				break;
			case ("c"):
				c = c - remove;
				break;
			}

			if (a < 0) {
				System.out.println("Pile A can not be less than zero.");
				a = 0;
			}
			if (b < 0) {
				System.out.println("Pile B can not be less than zero.");
				b = 0;
			}
			if (c < 0) {
				System.out.println("Pile C can not be less than zero.");
				c = 0;
			}

			total = a + b + c;
		}

		System.out.println("You have emptied all the piles. Great Job!");
		input.close();
	}
	
	
}
