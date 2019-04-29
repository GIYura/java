package recursion;

import java.util.Scanner;

class Recursion {
	public int factorial(int i) {
		int res = 1;
		while (i > 1) {
			res = res * i;
			i--;
		}
		return res;
	}
	
	public int fact(int n) {
        if (n == 1)
            return 1;
        return fact(n - 1) * n;
    }
}

public class Appl {
	public static void main(String[] args) {
		Recursion r = new Recursion();
		Scanner sr = new Scanner(System.in);
		
		System.out.println("Please, enter a number: ");
		int userIn = sr.nextInt();
		System.out.println("Factorial of " + userIn + " = " + r.factorial(userIn));
		System.out.println("------------------------");
		System.out.println("Factorial of " + userIn + " = " + r.fact(userIn));
	}
}
