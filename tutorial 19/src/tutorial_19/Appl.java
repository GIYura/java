package tutorial_19;

class Thing {
	public static final int MY_VAR = 1000;
	
	public String name;
	public static String description;
	public  static int count = 0;
	
	public int id = 0;
	
	public void showName() {
		System.out.println(this.name);
	}
	
	public static void showInfo() {
		System.out.println(description); 
	}
	
	public Thing() {
		id  = count;
		count++;
	}
}

public class Appl {
	public static void main(String[] args) {
		
		Thing.description = "I'm class variable";
		Thing.showInfo();
		
		System.out.println("Before creating objects count is: " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		Thing thing3 = new Thing();
		Thing thing4 = new Thing();
		
		System.out.println("After creating objects count is: " + Thing.count);
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		System.out.println(Thing.MY_VAR);
		
		System.out.println(Thing.count);
		
		System.out.println("Object ID: " + thing1.id);
		System.out.println("Object ID: " + thing2.id);
		System.out.println("Object ID: " + thing3.id);
		System.out.println("Object ID: " + thing4.id);
	}
}
