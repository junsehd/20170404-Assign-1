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
	
	//메소드 deposit() 인자인 금액을 저축하는 메소드
	public long deposit(long amount) {
		return this.balance += amount; 
	}
	
	//메소드 withdraw() 인자인 금액을 인출하는 메소드
	public long withdraw(long amount) {
		return this.balance -= amount;
	}
	
	public static void main(String[] args) {
		Account a1 = new Account();
		
		a1.setBalance(1_000_000);
		
		a1.deposit(100_000);
		
		a1.deposit(800_000);
		
		a1.withdraw(450_000);
		
		a1.withdraw(220_000);
		
		a1.deposit(780_000);
		
		System.out.println("현재 잔금 : " + a1.getBalance());
	}

}
