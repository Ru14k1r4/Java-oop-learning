package ex12;

public class Fish extends Animal implements Swimmer {
    public Fish(String name) {
        super(name);
    }
 
    @Override
    public void swim() {
        System.out.println("a swimmer.");
    }
 
    public void move() {
        System.out.println("I can swim.");
    }
 
    @Override
    public String toString() {
        return "I am an animal, a fish, ";
    }
}

