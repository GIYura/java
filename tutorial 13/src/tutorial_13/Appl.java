package tutorial_13;

public class Appl {
	public static void main(String[] args) {
		Fruit f = new Fruit();
		
		f.setName("Grapes");
		f.setWeight(2);
		
		System.out.println(f.getName());
		System.out.println(f.getWeight());
		
		
		Person[] person = new Person[2];
		
		for (int i = 0; i < person.length; i++) {
			person[i] = new Person();
			
		}
		
		person[0].setName("Julia");
		person[0].setAge(29);
		
		person[1].setName("Bob");
		person[1].setAge(55);
		
		System.out.print(person[0].getName() + "\t");
		System.out.println(person[0].getAge());
		System.out.print(person[1].getName() + "\t");
		System.out.println(person[1].getAge());
	}
}
