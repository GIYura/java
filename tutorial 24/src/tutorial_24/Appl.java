package tutorial_24;

import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.sqrt;

import ocean.Fish;
import ocean.Seaweed;


public class Appl {
	public static void main(String[] args) {
		Fish fish1 = new Fish();
		
		Fish fish2 = new Fish("salmon");
		
		System.out.println(fish1.getName());
		System.out.println(fish2.getName());
		
		Seaweed weed = new Seaweed();
		
		int a = 10;
		int b = 20;
		System.out.println("Max value is: " + max(a, b));
		
		int c = -22;
		System.out.println("Abs of c is: " + abs(c));
		
		int r = 13;
		System.out.printf("Sqrt of r is: %10.2f\n", sqrt(r));
	}
}
