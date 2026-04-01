package shapeworld;

public class Triangle {
	private Point p1, p2, p3;

    public Triangle() {
        p1 = new Point(0,0);
        p2 = new Point(0,1);
        p3 = new Point(1,0);
    }

    public Triangle(Point a, Point b, Point c) {
        this.p1 = a;
        this.p2 = b;
        this.p3 = c;
    }

    private double distance(Point a, Point b) {
        return Math.sqrt(
            Math.pow(a.getX() - b.getX(), 2) +
            Math.pow(a.getY() - b.getY(), 2)
        );
    }

    public double perimeter() {
        return distance(p1, p2) +
               distance(p2, p3) +
               distance(p3, p1);
    }
    
    public double area() {
    	double a = distance(p1, p2);
        double b = distance(p2, p3);
        double c = distance(p3, p1);

        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public String toString() {
        return "Triangle: " + p1 + ", " + p2 + ", " + p3;
    }
}
