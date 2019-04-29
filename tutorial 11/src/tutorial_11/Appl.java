package tutorial_11;

class Month {
	String monthName(int aMon) {
		String[] months = {	
							"Illigal month",
							"Jan", "Feb", 
							"March", "April", "May",
							"June", "July", "Aug",
							"Sep", "Oct", "Nov",
							"Dec"
							};
		return (aMon < 1 || aMon > 12) ? months[0] : months[aMon];
	}
}

public class Appl {
	public static void main(String[] args) {
		
		Month m = new Month();
		
		String[] vegs = {"beet", "carrot", "cabage", "potato"};
		for (String veg : vegs) {
			System.out.println(veg);
		}
		
		System.out.printf("Month is: %s\n", m.monthName(1));
		System.out.printf("Month is: %s\n", m.monthName(0));
		System.out.println("Month is: " + m.monthName(5));

	}
}
