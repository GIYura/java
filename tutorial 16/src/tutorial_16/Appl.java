package tutorial_16;

class Robot {
	
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("Jumping..." + height);
	}
}

public class Appl {
	public static void main(String[] args) {
		Robot r = new Robot();
		r.speak("I'm a robot");
		r.jump(88);
	}
}
