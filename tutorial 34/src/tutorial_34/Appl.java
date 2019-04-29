package tutorial_34;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Appl {
	public static void main(String[] args) {
		File fl = new File("test1.txt");
		
		
		try {
			Scanner sr = new Scanner(fl);
			FileReader fr = new FileReader(fl);
			
			while (sr.hasNextLine()) {
				String line = sr.nextLine();
				System.out.println(line);
			}
			sr.close();
			
		} catch (IOException ex) {
			System.out.println(ex.toString());
		}
		
		int[] arr = new int[10];
		System.out.println(arr.length);
	}
}
