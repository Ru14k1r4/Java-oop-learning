package ex12;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
 
        ArrayList<Animal>  animals  = new ArrayList<>();
        ArrayList<Swimmer>  swimers  = new ArrayList<>();
        ArrayList<Flyer>   flyers   = new ArrayList<>();
 
        Bird      bird      = new Bird("Bird");
        Eagle     eagle     = new Eagle("Eagle");
        Fish      fish      = new Fish("Fish");
        Flyfish   flyfish   = new Flyfish("Flyfish");
        Waterplane wp       = new Waterplane("Waterplane");
 
        animals.add(bird);
        animals.add(eagle);
        animals.add(fish);
        animals.add(flyfish);
 
        swimers.add(fish);
        swimers.add(flyfish);
        swimers.add(wp);
 
        flyers.add(flyfish);
        flyers.add(wp);
 
        System.out.println("Animals:");
        for (Animal a : animals) {
            System.out.println(a);
            a.move();
            System.out.println();
        }
 
        System.out.println("\nSwimers:");
        for (Swimmer s : swimers) {
            System.out.print(s);
            s.swim();
            System.out.println();
        }
 
        System.out.println("\n\nFlyers:");
        for (Flyer f : flyers) {
            System.out.print(f);
            f.fly();
            System.out.println();
        }
    }
}

