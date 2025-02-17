package practice.result05;

public class Account {
	private String Account; // 계좌번호
	private String Name;	// 이름
	private int Money;	// 잔액

	public Account(String account, String name, int money) {
		Account = account;
		Name = name;
		Money = money;
	}

	public String getAccount() {
		return Account;
	}

	public void setAccount(String account) {
		Account = account;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMoney() {
		return Money;
	}

	public void setMoney(int money) {
		Money = money;
	}

	@Override
	public String toString() {
		return "Account [Account=" + Account + ", Name=" + Name + ", Money=" + Money + "]";
	}


	
}
