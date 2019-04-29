package tutorial_12;

public class Appl {
	
	public static void main(String[] args) {
	
		
		int[] values = {3, 555, 12388};
		int[][] table = {
				
				{3, 555, 12388},
				{1, 2, 3, 4, 6},
				{0, 66, 77, 999}
		};
		
		System.out.println(table[1][1]);
		
		String[][] texts = new String[2][3];
		
		for (int row = 0; row < table.length; row++) {
			for (int col = 0; col < table[row].length; col++) {
				System.out.print(table[row][col] + "\t");
			}
			System.out.println();
		}
		
	}
}
