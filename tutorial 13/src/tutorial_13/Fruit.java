package tutorial_13;

public class Fruit {
	String kind;
	int weight;
	
	public void setName(String name) {
		kind = name;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getName() {
		return kind;
	}
	
	public int getWeight() {
		return weight;
	}
}
