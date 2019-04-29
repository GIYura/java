package tutorial_15;

class Person {
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
	
	public int setAge(int age) {
		if (age < 0 || age > 100) {
			return 1;
		} else {
			this.age = age;
			return 0;
		}
	}
	
	public void speak() {
		System.out.println("My name is: " + name);
	}
	
	public int calcYears2Retirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
}

public class Appl {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.setName("Ross");	
		p1.setAge(55);
		p1.speak();
		
		int years = p1.calcYears2Retirement();
		System.out.println("Years till retirement: " + years);
	}
}
