package hello;

public class Main {
	public static void main(String[] args) {
		
		int counter = 10;
		int [] arr = new int [10];
		
		while (counter > 0) {
			System.out.println("Counter: " + counter);
			counter--;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arr" + "[" + i + "]: " + arr[i]);
		}
	}
}
