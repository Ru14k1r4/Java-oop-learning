package inh;

public class Shape {
	protected double x, y;
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() { return x; }
    public double getY() { return y; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
	
    public double area() {
    	return 0;
    }
    
	@Override
	public String toString() {
		return "點座標: (" + x + ", " + y + ")\n";
	}
}
