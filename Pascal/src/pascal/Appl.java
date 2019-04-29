package pascal;

public class Appl {
	
	public static void main(String[] args) {
		int coeff = 1;
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				if( (i == j) || (j == 0) )  {
					coeff = 1;
					System.out.print(coeff + " ");
				} else {
					coeff = coeff * (i - j + 1) / j;
					if (coeff == 0) {
						System.out.print(" ");
					} else {
						System.out.print(coeff + " ");	
					}
				}
			}
			System.out.println();
		}
		
		System.out.println("***********************");
		coeff = 0;
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j <= i; j++) {
				coeff += 1; 
				System.out.print(coeff + " ");
			}
			coeff = 0;
			System.out.println();
		}
	}
}
