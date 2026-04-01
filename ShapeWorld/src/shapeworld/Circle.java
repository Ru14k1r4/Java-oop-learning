package shapeworld;

public class Circle {
	
	private Point center;
    private int radius;

    public Circle() {
        center = new Point();
        radius = 1;
    }

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle: center=" + center + ", r=" + radius;
    }
	
}
