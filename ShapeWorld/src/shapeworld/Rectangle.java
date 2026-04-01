package shapeworld;

public class Rectangle {

	private Point p1, p2;
	
    public Rectangle() {
        p1 = new Point(1,0);
        p2 = new Point(0,1);
    }

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double perimeter() {
        int width = Math.abs(p2.getX() - p1.getX()); //abs取絕對值
        int height = Math.abs(p1.getY() - p2.getY());
        return 2 * (width + height);
    }
    
    public double area() {
    	int width = Math.abs(p2.getX() - p1.getX()); //abs取絕對值
        int height = Math.abs(p1.getY() - p2.getY());
        return width * height;
    }

    public String toString() {
        return "Rectangle: " + p1 + " , " + p2;
    }
	
}
