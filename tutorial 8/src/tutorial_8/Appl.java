package tutorial_8;

import java.util.Scanner;

public class Appl {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		int userIn = 0;
		/*
		System.out.println("Please, enter a number:");
		int userIn = input.nextInt();
		
		while (userIn != 5) {
			System.out.println("Please, enter a number:");
			userIn = input.nextInt();
		}*/
		
		do {
			
			System.out.println("Please, enter a number:");
			userIn = input.nextInt();
		} while (userIn != 5);
		System.out.println("Got 5!");
		input.close();
	}
}
