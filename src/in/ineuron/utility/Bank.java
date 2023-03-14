package in.ineuron.utility;
import java.util.*;
public class Bank  {

	private static  String bankName="SBI";

	private ArrayList<User>accountholders;
	private ArrayList<Account>account;
	
	
	public Bank() {
		this.accountholders =new ArrayList<User>();
		this.account = new ArrayList<Account>();
	}

	public static String getBankName() {
		return bankName;
	}

	//get new account number
	public long newAccountNo() {
		long accountNo=0;
		int k=12;
		while(k-->0) {
			accountNo= accountNo*10 + new Random().nextInt(10)+1;
		}
		return accountNo;
	}

	//add new account to Bank
	public void addAccount(Account acnt) {
		this.account.add(acnt);
	}
	
	//add new User in Bank
	public User addNewCustomer(String firstName, String lastName, Integer custPin) {
		User newUser=new User(firstName,lastName,custPin);	
		this.accountholders.add(newUser);
		return newUser;
	}
	
	
	//new Account creation
	public Account newAccount(String accountType, long balance,User user) {
		Account account=new Account(accountType,balance,user,this);
		this.addAccount(account);
		user.addAccount(account);
		return account;
		
	}
	public User validateCustomer(Integer customerId,Integer customerPin) {
		
		for(User user:this.accountholders) {
			if(customerId.compareTo(user.getCustId())==0 && customerPin.compareTo(user.getCustPin())==0)
			{
				
				return user;
			}
		}
		
		return null;		
	}

	@Override
	public String toString() {
		return "Bank [accountholders=" + accountholders + ", account=" + account + "]";
	}

	public void checkAmount(User user) {
		
		System.out.println("======================================");
		System.out.println("User Name: "+user.getFirstName()+" "+user.getLastName());
		System.out.println("Account No: "+user.getAccount().get(0).getAccountNumber());
		System.out.println("Account Type: "+user.getAccount().get(0).getAccountType());
		System.out.println("Account Balance: "+user.getAccount().get(0).getBalance());
		System.out.println("======================================");
	}
	
	
	
	//Testing Purpose
	
	
	
	
}
