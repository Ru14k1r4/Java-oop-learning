package ani;

public class Swan extends Bird {
	
//	public Swan(String n) {
//		super(n);
//		this.type = "Swan";
//	}
	
	public Swan(String n) {
        super("Swan", n);
    }
	
	@Override
	public void move() {
		System.out.println("I can fly and swim.");
	}
	
	@Override
	public String toString() {
		return type + ", " + name;
	}
	
}
