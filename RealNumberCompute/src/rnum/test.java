package rnum;

public class test {

	public static void main(String[] args) {
		
		Rational a = new Rational(6, 8);
		Rational b = new Rational(1, 4);
		Rational c = new Rational(2, 7);
		
		System.out.printf("a = %s\nb = %s\nc = %s\n\n", a, b, c);
		
		System.out.println("a + b = " + a.add(b));
		System.out.println("b - a = " + b.subtract(a));
		System.out.println("a * c = " + a.multiply(c));
		System.out.println("c / b = " + c.divide(b));
	}

}