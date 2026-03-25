package atm;
import java.util.*;

public class IcCard {
	String id;
	String pwd;
	int money;
	
	public IcCard(String newID, String passwd, int firstMoney) {
		id = newID;
		pwd = passwd;
		money = firstMoney;
		
	}
	
	public IcCard(String passwd, int firstMoney) {
		id = UUID.randomUUID().toString();
		pwd = passwd;
		money = firstMoney;
	}
	
	boolean withdraw(int wmoney) {
		if(wmoney > money) {
			System.out.println("\n餘額不足");
			return false;
		}
		else {
			money -= wmoney;
			System.out.printf("\n已提領 %d 元\n餘額: %d元\n", wmoney, money);
			return true;
		}
	}
	
	boolean diposit(int dmoney) {
		money += dmoney;
		System.out.printf("\n已存入 %d 元\n餘額: %d元\n", dmoney, money);
		return true;
	}
	
	void check() {
		System.out.printf("\n卡片卡號: %s\n餘額: %d\n", id, money);
	}
	
	boolean transfer(IcCard bCard, int tmoney) {
		if(tmoney > money) {
			System.out.println("\n餘額不足");
			return false;
		}
		else {
			money -= tmoney;
			bCard.money += tmoney;
			System.out.printf("\n已成功轉帳!\n"
					+ "%s餘額: %d元\n"
					+ "%s餘額: %d元\n", 
					id, money, 
					bCard.id, bCard.money);
			return true;
		}
	}
}
