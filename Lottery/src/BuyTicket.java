import java.util.*;

public class BuyTicket {

	int[] normal = new int[7];
	Random r = new Random();
	boolean[] numlist = new boolean[50];
	
	int[] checksame(int[] normal, int i) {
        while(numlist[normal[i]] == true) {
            normal[i]++;
            if(normal[i]>49)
                normal[i] = 1;
        }
		return normal;
	}
	
	public BuyTicket() {
		for(int i=0; i<7; i++) {
			normal[i] = r.nextInt(49) + 1;
			normal = checksame(normal, i);
			numlist[normal[i]] = true;
		}
	}
	
}
