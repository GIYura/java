package ocean;

public class Fish {
	private String name;
	
	public Fish() {
		System.out.println("Fish is created");
	}
	
	public Fish(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
