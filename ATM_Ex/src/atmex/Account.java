package atmex;

public class Account {

	private long balance;
	private String id, password;
	
	public Account(String id, String password, long money) {
		this.id = id;
		this.password = password;
		this.balance = money;
	}
	
    public String getId()       { return this.id; }
    public String getPassword() { return this.password; }
	
	void deposite(long money) throws AccountError {
		if(money < 0)
			throw new AccountError("存款金額不可為負值");
		else
			this.balance += money;
	}

	void withdraw(long money) throws AccountError {
		if(money > this.balance)
			throw new AccountError("餘額不足");
		else
			this.balance -= money;
	}
	
	public long checkbalance() { return this.balance; }
}
