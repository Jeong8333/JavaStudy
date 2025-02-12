package Result05;

public class Account {
	private String Account; // 계좌번호
	private String name;	// 이름
	private String money;	// 잔액
	
	public Account() {
	}
	
	public Account(String account, String name, String money) {
		this.Account = account;
		this.name = name;
		this.money = money;
	}

	public String getAccount() {
		return Account;
	}

	public void setAccount(String account) {
		Account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [Account=" + Account + ", name=" + name + ", money=" + money + "]";
	}
	

	
	
}
