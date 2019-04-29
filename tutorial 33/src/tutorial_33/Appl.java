package tutorial_33;

import java.io.*;
import java.util.*;

public class Appl {
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "/home/jura/javaLessons/test.txt";
		File f = new File(fileName);
		Scanner in = new Scanner(f);
		
		int[] buffer = new int[10];
		
		System.out.println("Initial buffer: ");
		for (int i : buffer) {
			System.out.println(i);
		}
		
		for (int i = 0; i < buffer.length; i++) {
			buffer[i] = (int)(Math.random() * 101);//in.nextInt();
		}
		
		System.out.println("Read from file: ");
		for (int i : buffer) {
			System.out.print(i + " ");
		}
		
		Arrays.sort(buffer);
		
		System.out.println();
		System.out.println("Sorted: ");
		for (int i : buffer) {
			System.out.print(i + " ");
		}
		
		
		File f1 = new File("test1.txt");
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
			
			for (int i = 0; i < buffer.length; i++) {
				bw.write("Hello");
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		in.close();
	}
}
