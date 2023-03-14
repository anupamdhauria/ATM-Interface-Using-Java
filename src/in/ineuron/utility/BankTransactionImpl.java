
package in.ineuron.utility;

import java.util.Scanner;

public class BankTransactionImpl implements BankTransaction {

	@Override
	public User validateUser(Integer customerId,Integer customerPin,Bank bank) {
		
		User isValidCustomer=null;
		isValidCustomer=bank.validateCustomer(customerId,customerPin);	
		return isValidCustomer;
	}

	@Override
	public void checkBalance(User user,Bank bank) {
	
		bank.checkAmount(user);

	}

	@Override
	public void transferMoney(User user,Scanner sc) {
		

	}

	@Override
	public void transactionHistory(User user) {
		
	}

	@Override
	public void withdrawAmount(User user,Scanner sc) {
	

	}

	@Override
	public void depositeAmount(User user, Scanner sc) {
		
		
	}

	@Override
	public void exitAtm() {
		System.out.println("Thank you for using Ineuron ATM");
		System.exit(0);
		
	}

}
