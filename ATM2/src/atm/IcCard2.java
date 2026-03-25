package atm;
import java.util.*;

public class IcCard {
	private String id;
	private String pwd;
	private int money;
	
	public int getmoney() {	return this.money; }
	public String getid() { return this.id; }
	public String getpwd() { return this.pwd; }
	public void setmoney(int money) { this.money += money; }
	//public void editmoney(int money) { this.money += money; }
	public void setid(String id) { this.id = id; }
	public void setpwd(String pwd) { this.pwd = pwd; }

	
	public IcCard(String id, String pwd, int money) {
//		this.id = newID;
//		this.pwd = passwd;
//		this.money = firstMoney;
		setid(id);
		setpwd(pwd);
		setmoney(money);
	}
	
	public IcCard(String pwd, int money) {
//		this.id = UUID.randomUUID().toString();
//		this.pwd = pwd;
//		this.money = money;
		setid(UUID.randomUUID().toString());
		setpwd(pwd);
		setmoney(money);
	}


	public boolean withdraw(int wmoney) {
		if(wmoney > getmoney()) {
			System.out.println("\n餘額不足");
			return false;
		}
		else {
			// money -= wmoney;
			setmoney(-wmoney);
			System.out.printf("\n已提領 %d 元\n餘額: %d元\n", wmoney, getmoney());
			return true;
		}
	}
	
	public boolean deposit(int dmoney) {
		// money += dmoney;
		setmoney(dmoney);
		System.out.printf("\n已存入 %d 元\n餘額: %d元\n", dmoney, getmoney());
		return true;
	}
	
	public void show() {
		System.out.printf("\n卡片卡號: %s\n餘額: %d\n", getid(), getmoney());
	}
	
	public boolean transfer(IcCard bCard, int tmoney) {
		if(tmoney > money) {
			System.out.println("\n餘額不足");
			return false;
		}
		else {
			// money -= tmoney;
			setmoney(-tmoney);
			// bCard.money += tmoney;
			bCard.setmoney(tmoney);

			System.out.printf("\n已成功轉帳!\n"
					+ "%s餘額: %d元\n"
					+ "%s餘額: %d元\n", 
					getid(), getmoney(), 
					bCard.getid(), bCard.getmoney());
			return true;
		}
	}
}