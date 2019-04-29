package tutorial_17;

class Frog {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String purchas(boolean eggs, boolean bread) {
		if (bread && eggs) {
			return "bread, " + "eggs";
		} else if (bread) {
			return "bread";
		} else if (eggs) {
			return "eggs";
		} else {
			return "empty";
		}
	}
}

public class Appl {
	public static void main(String[] args) {
		Frog frog1 = new Frog();
		frog1.setName("Bertie");
		frog1.setAge(55);
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
		
		boolean eggs = false;
		boolean bread = false;
		
		System.out.println(frog1.purchas(eggs, bread));
	}
}
