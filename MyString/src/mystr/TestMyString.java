package mystr;

public class TestMyString {

	public static void main(String[] args) {
		
		MyString a = new MyString();
		MyString b = new MyString("test1");
		MyString c = new MyString("test2");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("Char at 6 in String c: " + a.charAt(6));
		//System.out.println(b.compareTo(a));
		System.out.println("Substring from 6 to 10 in String a: " + a.substring(6, 10));

	}

}
