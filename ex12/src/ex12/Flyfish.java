package ex12;

public class Flyfish extends Fish implements Flyer {
    public Flyfish(String name) {
        super(name);
    }
 
    @Override
    public void fly() {
        System.out.println("a flyer.");
    }
    
    @Override
    public void move() {
    	System.out.println("I can fly and swim.");
    }
 
    @Override
    public String toString() {
        return "I am an animal, a fish, a flyfish, ";
    }
}

