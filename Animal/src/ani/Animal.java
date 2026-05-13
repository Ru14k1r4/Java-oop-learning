package ani;

public class Animal {
	protected String type, name;
	
//	public Animal(String n) {
//		this.type = "Animal";
//		name = n;
//	}
	
	public Animal(String type, String name) {
	    this.type = type;
	    this.name = name;
	}
	
	protected void move() {
		System.out.println("Move.");
	}
	
	public String toString() {
		return type + ", " + name;
	}
}
