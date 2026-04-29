package inh;

public class Rectangle extends Shape {
	
	private double h, w;
		
	public Rectangle(double x, double y, double h, double w) {
		super(x, y);
		this.h = h;
		this.w = w;
	}
	
	public double getW() { return w; }
    public double getH() { return h; }
    public void setW(double w) { this.w = w; }
    public void setH(double h) { this.h = h; }

    @Override
	public double area() {
		return h*w;
	}
	
	@Override
	public String toString() {
		return "矩形:\n" +
				"座標: (" + x + ", " + y + ")" + "\n" +
				"長: " + h + "\n" + "寬: " + w + "\n" +
				"面積: " + this.area() + "\n";
	}
	
}
