package fibonachi;

import java.util.Scanner;

class Ff {
	public int fib(int n) {
		return (n <= 2 ? 1 : fib(n - 1) + fib(n - 2));
	}
}

public class Appl {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 0;
		
		System.out.print(a + " " + b + " ");
		
		for(int i = 0; i < 7; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
		System.out.println();
		Scanner sr = new Scanner(System.in);
		System.out.println("Please, enter a number: ");
		int userIn = sr.nextInt();
		Ff f = new Ff();
		
		for (int i = 1; i <= userIn; i++) {
            System.out.print(f.fib(i) + " ");
		}
        System.out.println("...");
        sr.close();
	}
}
