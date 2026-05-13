package ex12;

abstract public class Animal {
	protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
 
    abstract public void move();
    
    @Override
    public String toString() {
        return "I am an animal.";
    }

}
