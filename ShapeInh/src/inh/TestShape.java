package inh;

public class TestShape {

	public static void main(String[] args) {
		
		Shape P = new Shape(0, 0);
		Circle C = new Circle(0, 0, 2);
		Rectangle R = new Rectangle(1, 1, 2, 4);
		Cylinder Cy = new Cylinder(2, 2, 3, 2);
		
		Object[] shapes = {P, C, R, Cy};
		
		for(int i=0; i<4; i++) {
			System.out.println(shapes[i]);
		}
	}

}
