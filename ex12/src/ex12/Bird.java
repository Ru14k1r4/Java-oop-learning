package ex12;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
 
    public void move() {
        System.out.println("I can fly.");
    }
 
    @Override
    public String toString() {
        return "I am an animal, a bird.";
    }
}

