package in.ineuron.utility;

public class Account {
	
	private long accountNumber;
	private String AccountType;
	private long balance;

	private User holder;
	
	
	public Account(String accountType, long balance,User user,Bank bank) {
		this.holder = user;
		this.AccountType = accountType;
		this.balance = balance;
		this.accountNumber=bank.newAccountNo();
	}
	
	public Long getAccountNumber() {
		return accountNumber;
	}
	public String getAccountType() {
		return AccountType;
	}
	public long getBalance() {
		return balance;
	}

	
	
	
	//Testing Purpose
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", AccountType=" + AccountType + ", balance=" + balance
				+ "]";
	}
	
	
	
	
	

}
