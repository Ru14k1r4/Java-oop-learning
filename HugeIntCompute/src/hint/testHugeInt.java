package hint;

public class testHugeInt {

	public static void main(String[] args) {
	    HugeInt a = new HugeInt("1000");
	    HugeInt b = new HugeInt("1");

	    System.out.println(a.subtract(b)); // 999

	    HugeInt c = new HugeInt("123");
	    HugeInt d = new HugeInt("456");

	    System.out.println(c.subtract(d)); // -333
	}

}
