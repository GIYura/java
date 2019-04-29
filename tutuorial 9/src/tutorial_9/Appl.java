package tutorial_9;

import java.util.Scanner;

public class Appl {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter a command:");
		String userIn = input.nextLine();
		
		switch (userIn) {
		case "start":
			System.out.println("The machine started!");
			break;
		
		case "stop":
			System.out.println("The machine stoped!");
			break;

		default:
			System.out.println("Wrong command!");
			break;
		}
		input.close();
	}
}
