package ani;

public class Bird extends Animal {
	
//	public Bird(String n) {
//		super(n);
//		this.type = "Bird";	
//	}
	
	protected Bird(String type, String n) {
        super(type, n);
    }
	
	public Bird(String n) {
        super("Bird", n);
    }
	
	@Override
	public void move() {
		System.out.println("I can fly.");
	}
	
	@Override
	public String toString() {
		return type + ", " + name;
	}
}
