package shapeworld;

public class ShapeWorld {

	public static void main(String[] args) {
		
		//Point
		Point p1 = new Point();
		Point p2 = new Point(1, 2);
		
		// Rectangle
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(new Point(0, 10), new Point(5, 0));

        // Circle
        Circle c1 = new Circle();
        Circle c2 = new Circle(new Point(0, 0), 5);

        // Triangle
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(
            new Point(0, 0),
            new Point(3, 0),
            new Point(0, 4)
        );

        // output
        System.out.printf(p1 + "\n\n");
        System.out.printf(p2 + "\n\n");
        System.out.printf(r1 + "\n周長: %7.2f\n面積: %7.2f\n\n", r1.perimeter(), r1.area());
        System.out.printf(r2 + "\n周長: %7.2f\n面積: %7.2f\n\n", r2.perimeter(), r2.area());
        System.out.printf(c1 + "\n周長: %7.2f\n面積: %7.2f\n\n", c1.perimeter(), c1.area());
        System.out.printf(c2 + "\n周長: %7.2f\n面積: %7.2f\n\n", c2.perimeter(), c2.area());
        System.out.printf(t1 + "\n周長: %7.2f\n面積: %7.2f\n\n", t1.perimeter(), t1.area());
        System.out.printf(t2 + "\n周長: %7.2f\n面積: %7.2f\n\n", t2.perimeter(), t2.area());
        
	}

}
