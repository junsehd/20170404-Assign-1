public class Account {
	private String owner;
	private long balance;
	
	//생성자
	public Account() {}
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	public Account(String owner) {
		this.owner = owner;
	}
	public Account(long balance) {
		this.balance = balance;
	}

	//getter, setter
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public static void main(String[] args) {
		

	}

}
