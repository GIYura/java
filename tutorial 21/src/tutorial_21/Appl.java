package tutorial_21;

class Frog {
	private String name;
	private int id;
	
	public Frog(int id, String name) {
		this.id  = id;
		this.name = name;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
	}
}

public class Appl {
	public static void main(String[] args) {
		Object obj = new Object();	
		
		Frog frog1 = new Frog(7, "Bob");
		Frog frog2 = new Frog(555, "Marly");
		
		System.out.println(frog1);
		System.out.println(frog2);
		
		int a = 10;
		System.out.println(Integer.toString(a));
	}
}
