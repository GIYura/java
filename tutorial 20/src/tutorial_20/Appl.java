package tutorial_20;

public class Appl {
	public static void main(String[] args) {
		String info = "";
		info += "My name is Jura";
		info += " ";
		info += "I'm an engineer";
		
		System.out.println(info);
		
		StringBuilder sb = new StringBuilder("");
		sb.append("my name is vasa");
		sb.append(" ");
		sb.append("i'm a welder");
		
		System.out.println(sb.toString());
		
		StringBuffer sbuff = new StringBuffer();
		sbuff.append("hi, this is me");
		System.out.println(sbuff);
		
		/**/
		
	}
}
