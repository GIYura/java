package tutorial_14;


class Person {
	String name;
	int age;
	
	public void speak() {
		System.out.println("Hello my name is " + name + " I'm " + age + " years old");
	}
	
	public void move() {
		System.out.println("The person is moving...");
	}
}

public class Appl {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "Bob";
		p1.age = 55;
		
		p2.name = "Julia";
		p2.age = 66;
		
		p1.speak();
		p1.move();
		
		p2.speak();
		p2.move();
	}
}
