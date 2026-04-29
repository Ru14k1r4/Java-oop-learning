package inh;

public class Cylinder extends Circle{
	private double h;
	
	public Cylinder(double x, double y, double r, double h) {
		super(x, y, r);
		this.h = h;
	}
	
	public double getH() { return h; }
    public void setH(double h) { this.h = h; }
	
	@Override
	public double area() {
		return r*r*Math.PI*2 + 2*Math.PI*r*h;
	}
	
	@Override
	public String toString() {
		return "圓柱:\n" +
				"座標: (" + x + ", " + y + ")" + "\n" + 
				"半徑: " + r + "\n" +
				"表面積: " + this.area() + "\n";
	}
}
