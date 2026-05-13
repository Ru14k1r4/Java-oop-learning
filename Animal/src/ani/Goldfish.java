package ani;

public class Goldfish extends Animal {

//	public Goldfish(String n) {
//		super(n);
//		this.type = "Goldfish";	
//	}
	
	public Goldfish(String n) {
        super("Goldfish", n);
    }
	
	@Override
	public void move() {
		System.out.println("I can swim.");
	}
	
	@Override
	public String toString() {
		return type + ", " + name;
	}
	
}
