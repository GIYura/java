package tutorial_25;

public class Appl {
	public static void main(String[] args) {
		Plant plant = new Plant();
		Oak oak = new Oak();
		
		System.out.println(plant.name);
		System.out.println(Plant.ID);
		System.out.println(plant.size);
		System.out.println(oak.size);
	}
}
