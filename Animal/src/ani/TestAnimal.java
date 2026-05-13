package ani;
import java.util.Arrays;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal[] ani = {
	            new Bird("b1"),
	            new Bird("b2"),
	            new Swan("s1"),
	            new Swan("s2"),
	            new Goldfish("f1"),
	            new Goldfish("f2"),
	            new Goldfish("f3"),
	            new Goldfish("f4"),
	            new Goldfish("f5")
	    };
		
		Arrays.sort(ani, (a, b) -> a.name.compareTo(b.name)); //sort根據後面comparator比大小回傳的結果排序
		
		for (Animal a : ani) {
		    System.out.println(a);
		    a.move();
		    System.out.println();
		}
	}

}
