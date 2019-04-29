package tutorial_18;

class Machine {
	private String name;
	private int code;
	
	public Machine() {
		System.out.println("Constructor 1 is running");
		name = "Bugaga";
	}
	
	public Machine(String name) {
		this.name = name;
		System.out.println("Constructor 2 is running");
	}
	
	public Machine(String name, int code) {
		this.code = code;
		this.name = name;
		System.out.println("Constructor 3 is running");
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getCode() {
		return this.code;
	}
}

public class Appl {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Bert");	
		Machine machine3 = new Machine("Abba", 13);
		
		System.out.println("name is: " + machine1.getName());
		System.out.println("name is: " + machine2.getName());
		System.out.println("name is: " + machine3.getName());
	}
}
