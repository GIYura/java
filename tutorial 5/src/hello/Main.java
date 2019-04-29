package hello;

public class Main {
	public static void main(String[] args) {
		
		int arr [] = new int [10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(i == 3)
			{
				continue;
			}
			System.out.printf("arr [%d] = %d\n", i, arr[i]);
		}

		if (arr[5] > 5) {
			System.out.printf("arr[5] is bigger than 5\n");
		} else {
			System.out.printf("arr[5] is NOT bigger than 5\n");
		}
	}
}
