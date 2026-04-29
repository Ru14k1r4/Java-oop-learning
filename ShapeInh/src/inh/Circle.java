package inh;

public class Circle extends Shape {
	protected double r;
	
	public Circle(double x, double y, double r) {
		super(x, y);
		this.r = r;
	}
	
	public double getR() { return r; }
    public void setR(double r) { this.r = r; }
	
    @Override
	public double area() {
		return r*r*Math.PI;
	}
	
	@Override
	public String toString() {
		return "圓形:\n" + 
				"圓心: (" + x + ", " + y + ")" + "\n" +
				"半徑: " + r + "\n" +
				"面積: " + this.area() + "\n";
	}
}
