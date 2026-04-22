package rnum;

public class rational {
	private int num;
	private int den;
	
	public rational(int n, int d) {
		this.num = n;
		this.den = d;
		simplify();
	}
	
	public void setn(int n) { this.num = n; }
	public void setd(int d) { this.den = d;	}
	public int getn() { return this.num; }
	public int getd() { return this.den; }
	
	public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
	
	public void simplify() {
		int k = gcd(Math.abs(getn()), getd());
		setn(getn()/k);
		setd(getd()/k);
	}
	
	public rational add(rational other) {
		rational ans = new rational(getn(), getd());
		
		if(ans.getd() == other.getd()) {
			ans.setn(getn() + other.getn());
		}
		else {
			ans.setn(getn()*other.getd() + getd()*other.getn());
			ans.setd(getd() * other.getd());
		}
		ans.simplify();
		return ans;
	}
	
	public rational subtract(rational other) {
		rational nother = new rational(-other.getn(), other.getd());
		return add(nother);
	}
	
	public rational multiply(rational other) {
		rational ans = new rational(getn(), getd());
		ans.setn(getn() * other.getn());
		ans.setd(getd() * other.getd());
		ans.simplify();
		return ans;
	}
	
	public rational divide(rational other) {
		rational nother = new rational(other.getd(), other.getn());
		return multiply(nother);
	}
	
	public String toString() {
		return getn() + (getd()==1?"":"/"+getd());
	}
}