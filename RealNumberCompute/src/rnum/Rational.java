package rnum;

public class Rational {
    private int num, den;

    public Rational(int n, int d) {
        if (d == 0) throw new IllegalArgumentException("denominator = 0");
        int g = gcd(Math.abs(n), Math.abs(d));
        num = d < 0 ? -n / g : n / g;
        den = Math.abs(d) / g;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public Rational add(Rational r) {
        return new Rational(
            num * r.den + den * r.num,
            den * r.den
        );
    }

    public Rational subtract(Rational r) {
        return new Rational(
            num * r.den - den * r.num,
            den * r.den
        );
    }

    public Rational multiply(Rational r) {
        return new Rational(
            num * r.num,
            den * r.den
        );
    }

    public Rational divide(Rational r) {
        return new Rational(
            num * r.den,
            den * r.num
        );
    }

    @Override
    public String toString() {
        return den == 1 ? String.valueOf(num) : num + "/" + den;
    }
}
