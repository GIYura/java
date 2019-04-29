package tutorial_7;

import java.util.Scanner;

public class Appl {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, enter a line of text:");
		
		String userLine = input.nextLine();
		
		System.out.println("You have entered: " + userLine);

		
		System.out.println("Please, enter a number:");
		
		int userValue = input.nextInt();
		
		try {
			
			System.out.println("You have entered: " + userValue);
			
		} catch (Exception e) {
	
		}
		
		input.close();
	}
}
