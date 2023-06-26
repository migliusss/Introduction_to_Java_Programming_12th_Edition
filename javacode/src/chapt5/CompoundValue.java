package chapt5;

import java.util.Scanner;

/*
 * Suppose you save $100 each month in a savings account with annual interest rate 3.75%.
 * The monthly interest rate is 0.0375 / 12 = 0.003125. After the first month, the value in the account becomes
 * 100 * (1 + 0.003125) = 100.3125
 * After the second month, the value in the account becomes 
 * (100 + 100.3125) * (1 + 0.003125) = 200.938
 * and so on.
 * 
 * Write a program that prompts the user to enter an amount, the annual interest rate, 
 * and the number of months and displays the amount in the savings account after the given month. 
 */

public class CompoundValue {
	public static void main(String[] args) {
		// Declare and initialize variables. 
		double monthlyInterestRate = 0;
		double valueInAccount = 0;
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user.
		System.out.print("Enter an amount (e.g., 100): ");
		double amount = input.nextDouble();
		
		System.out.print("Enter the annual interest rate (e.g., 3.75): ");
		double annualInterestRate = input.nextDouble();
		
		System.out.print("Enter the number of months (e.g., 6):");
		int numberOfMonths = input.nextInt();
		
		// Calculate monthly interest. 
		monthlyInterestRate = (annualInterestRate / 100) / 12;
		
		// Calculate the value in a savings account by using a for loop. 
		for (int i = 1; i <= numberOfMonths; i++) {
			valueInAccount = (amount + valueInAccount) * (1 + monthlyInterestRate);
			
			// Display results.
			System.out.println("Amount in the savings account after " + i 
					+ " month is $" + (int) (valueInAccount * 100) / 100.0);
		} 

	}
}
