package helloWorld;
import java.io.IOException;

public class helloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inumber = 10;
		System.out.println(inumber);
		
		double dnumber = 2.33;
		System.out.println(dnumber);
		
		float fnumber = 1.55f;
		System.out.println(fnumber);
		
		short snumber = 500;
		System.out.println(snumber);
		
		byte bnumber = 127;
		System.out.println(bnumber);
		
		char cnumber = 'A';
		System.out.println(cnumber);
		
		boolean bonumber = true;
		System.out.println(bonumber);
		
		System.out.println("Please, enter a number");
		int inChar;

        System.out.println("Enter a Character:");
        try {
            inChar = System.in.read();
            System.out.print("You entered ");
            System.out.println(inChar);
        }
        catch (IOException e){
            System.out.println("Error reading from user");
        }
	}

}
