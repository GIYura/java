package tutorial_22;

public class Appl {
	public static void main(String[] args) {
	
		Machine mach1 = new Machine();
		System.out.println("Hash code: " + mach1.hashCode());
		
		mach1.start();
		mach1.stop();
		
		Car car1 = new Car();
		car1.start();
		car1.stop();
	}
}
