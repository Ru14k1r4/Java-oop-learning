import java.util.*;

public class Lotus {

	public static void main(String[] args) {
		
		BuyTicket[] ticks = new BuyTicket[3];
		for(int i=0;i<3;i++){
            ticks[i] = new BuyTicket();
            System.out.printf("Tick %d: ", i+1);
            for(int k=0; k<6; k++) {
            	System.out.printf("%02d ", ticks[i].normal[k]);
            }
            System.out.printf("| %02d\n", ticks[i].normal[6]);
        }
		
		Scanner sc = new Scanner(System.in);
		int[] win = new int[7];
		
		System.out.print("\nInput Winning nubers and special number: ");
		for(int i=0; i<7; i++) {
			win[i] = sc.nextInt();
		}		
		System.out.println();

		for(int i=0; i<3; i++) {
			
			int count = 0;
			boolean sp = false;
			
			for(int num=0; num<6; num++) {
				for(int t=0; t<6; t++) {
					if(ticks[i].normal[num] == win[t])
						count++;
				}
			}
			if(ticks[i].normal[6] == win[6])
				sp = true;
			
			
			System.out.printf("Tick %d: ", i+1);
			if(count == 6)
				System.out.println("頭獎");
			else if(count == 5 && sp == true)
				System.out.println("貳獎");
			else if(count == 5)
				System.out.println("參獎");
			else if(count == 4 && sp == true)
				System.out.println("肆獎");
			else if(count == 4)
				System.out.println("伍獎");
			else if(count == 3 && sp == true)
				System.out.println("陸獎");
			else if(count == 2 && sp == true)
				System.out.println("柒獎");
			else if (count == 3)
				System.out.println("普獎");
			else
				System.out.println("沒中");
		}
		
	}

}
