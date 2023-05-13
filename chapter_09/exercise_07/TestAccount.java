package chapt9;

public class TestAccount {
	// Main method.
	public static void main(String[] args) {
		// Create an Account object. 
		Account account = new Account(1122, 20000);
		
		// Set annual interest rate to 4,5%.
		account.setAnnualInterestRate(4.5);
		
		// Withdraw $2,500.
		account.withdraw(2500);
		
		// Deposit $3,000.
		account.deposit(3000);
		
		System.out.println("Account: " + account.getId());
		
		// Print the date when this account was created. 
		System.out.println("Date created: " + account.getDateCreated()); 
		
		// Print balance.
		System.out.println("Balance: $" + account.getBalance());
		
		// Print monthly interest. 
		System.out.println("Monthly interest: $" + account.getMonthlyInterest());
		
	}
}
