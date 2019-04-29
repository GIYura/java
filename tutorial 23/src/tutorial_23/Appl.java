package tutorial_23;

import java.util.Arrays;

public class Appl {
	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("Albert");
		person1.greet();
		
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		
		outputInfo(mach1);
		outputInfo(person1);
		
		int[] myArr = new int [] {3,6,8,33,78,9};
		for (int i : myArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		Arrays.sort(myArr);
		
		for (int i : myArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------------------");
		int[] myArr1 = new int [10];
		for (int i : myArr1) {
			System.out.print(i + " ");
		}
		Arrays.fill(myArr1, 10);
		System.out.println();
		for (int i : myArr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------------------");
		
		int[] myArr2 = new int [] {33,5,88,1000,5,0,-1};
		for (int i : myArr2) {
			System.out.print(i + " ");
		}
		System.out.println();
		Arrays.sort(myArr2, 0, myArr2.length - 1);
		for (int i : myArr2) {
			System.out.print(i + " ");
		}
	}
	
	public static void outputInfo(Info info) {
		info.showInfo();
	}
}
