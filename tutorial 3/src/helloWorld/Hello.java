package helloWorld;


class Person {
	String name;
	int age;
	
	void setName(String newName) {
		this.name = newName;
	}
	
	void setAge(int newAge) {
		this.age = newAge;
	}
	
	String getName() {
		return this.name;
	}
	
	int getAge() {
		return this.age;
	}
}

public class Hello {
	public static void main(String[] args) {
	
		String text = new String();
		text = "Hello";
		
		String name = "JAVA";
		
		System.out.println(text);
		System.out.println(text + " " + name);
		
		int myInt = 100;
		System.out.println("My int: " + myInt);
		
		Person man = new Person();
		man.setName("Bob");
		man.setAge(66);
		
		System.out.print("Man: " + man.getName());
		System.out.println(" Age: " + man.getAge());
		
		Person woman = new Person();
		woman.setName("Julia");
		woman.setAge(22);
		
		System.out.print("Woman: " + woman.getName());
		System.out.println(" Age: " + woman.getAge());
		
	}
}
