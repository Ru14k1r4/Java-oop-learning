package atm;

import java.util.*;

public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cmd = 0;
		
		IcCard[] bank = new IcCard[10];
		
		while(cmd != 7) {
			System.out.print("輸入操作指令: (1 開戶(含ID), 2 開戶(不含ID), 3 存款, 4 提款, 5 轉帳, 6查詢, 7離開)\n: ");
			cmd = sc.nextInt();
			System.out.println();
			
			switch(cmd) {
				case 1:
					System.out.print("輸入ID 密碼 金額\n: ");
					String iid = sc.next();
					String ipw = sc.next();
					int imoney = sc.nextInt();
					
					for(int i=0; i<10; i++) {
						if(bank[i] == null) {
							bank[i] = new IcCard(iid, ipw, imoney);
							System.out.printf("開戶成功!\nID: %s\n", bank[i].id);
							break;
						}
						else if(bank[i].id == iid) {
							System.out.printf("此帳號已存在\n");
							break;
						}
					}
					break;
					
				case 2:
					System.out.print("輸入密碼 金額\n: ");
					String ipw2 = sc.next();
					int imoney2 = sc.nextInt();
					
					for(int i=0; i<10; i++) {
						if(bank[i] == null) {
							bank[i] = new IcCard(ipw2, imoney2);
							System.out.printf("開戶成功!\nID: %s\n", bank[i].id);
							break;
						}
					}
					break;
					
				case 3:
					System.out.print("輸入ID與密碼\n: ");
					String id = sc.next();
					String pwd = sc.next();
					int i=0;
					for(; i<10; i++) {
						if(bank[i] != null && bank[i].id.equals(id)) {  //不能寫==字串
							if(!bank[i].pwd.equals(pwd)) {
								System.out.printf("密碼錯誤\n");
								break;
							}
							else {
								System.out.print("輸入存款金額\n: ");
								int dmoney = sc.nextInt();
								if(bank[i].diposit(dmoney)) {
									System.out.print("存款成功\n");
								}
							}
							break;
						}
						
					}
					if(i==10) {
						System.out.printf("帳號不存在\n");
					}
					break;
					
				case 4:
					System.out.print("輸入ID與密碼\n: ");
					String id2 = sc.next();
					String pwd2 = sc.next();
					int i4=0;
					for(; i4<10; i4++) {
						if(bank[i4] != null && bank[i4].id.equals(id2)) {
							if(!bank[i4].pwd.equals(pwd2)) {
								System.out.printf("密碼錯誤\n");
								break;
							}
							else {
								System.out.print("輸入提款金額\n: ");
								int wmoney = sc.nextInt();
								if(bank[i4].withdraw(wmoney)) {
									System.out.print("提款成功\n");
								}
							}break;
						}
					}
					if(i4==10) {
						System.out.printf("帳號不存在\n");
					}
					break;
					
				case 5:
					System.out.print("輸入ID與密碼\n: ");
					String id5 = sc.next();
					String pwd5 = sc.next();
					int i5 = 0;
					for(; i5<10; i5++) {
						if(bank[i5] != null && bank[i5].id.equals(id5)) {
							if(!bank[i5].pwd.equals(pwd5)) {
								System.out.printf("密碼錯誤\n");
								break;
							}
							else {
								System.out.print("輸入轉帳ID與金額\n: ");
								String tid = sc.next();
								int tmoney = sc.nextInt();
								
								int b=0;
								for(; b<10; b++) {
									if(bank[b] != null && bank[b].id.equals(tid)) {
										bank[i5].transfer(bank[b], tmoney);
									}
								}
								if(b==10) {
									System.out.print("找不到對方帳號\n");
								}
							}
							break;
						}
					}
					if(i5==10) {
						System.out.printf("帳號不存在\n");
					}
					break;
					
				case 6:
					System.out.print("輸入ID與密碼\n: ");
					String id6 = sc.next();
					String pwd6 = sc.next();
					int i6=0;
					for(; i6<10; i6++) {
						if(bank[i6] != null && bank[i6].id.equals(id6)) {
							bank[i6].check();
							break;
						}
					}
					if(i6==10) {
						System.out.printf("帳號不存在\n");
					}
					break;
				case 7:
					System.out.print("已離開\n");
					return;
			}
			cmd = 0;
		}
	}
}

