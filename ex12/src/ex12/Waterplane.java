package ex12;

public class Waterplane implements Swimmer, Flyer {
    protected String name;
 
    public Waterplane(String name) {
        this.name = name;
    }
 
    @Override
    public void swim() {
    	System.out.print("a swimmer.");
    }
 
    @Override
    public void fly() {
    	System.out.print("a flyer.");
    }
 
    @Override
    public String toString() {
        return "I am a waterplane, ";
    }
}

