package tutorial_23;

public class Machine implements Info {
	private int id = 66;
	
	public void start() {
		System.out.println("Machine started");
	}

	@Override
	public void showInfo() {
		System.out.println("Machine ID is: " + id);
	}
}
