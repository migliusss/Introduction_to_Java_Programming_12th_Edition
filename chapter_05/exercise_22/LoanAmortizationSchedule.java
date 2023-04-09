package chapt5;

import java.util.Scanner;

/*
 * Write a program that lets the user enter the loan amount, number of years, and interest rate
 * the displays the amortization schedule for the loan.  
 */

public class LoanAmortizationSchedule {
	public static void main(String[] args) {
		// Declare and initialize variables.
		double monthlyInterestRate = 0; 
		double monthlyPayment = 0; 
		double interest = 0;
		double principal = 0;
		double balance = 0;
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		double interestRate = input.nextDouble();
		
		// Calculate monthlyInterestRate
		monthlyInterestRate = interestRate / 1200;
		
		// Compute the monthly payment outside the loop because it is always the same. 
		monthlyPayment = loanAmount * monthlyInterestRate / (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12));
		
		// Give balance a value of loan amount. 
		balance = loanAmount;
		
		// Print general information. 
		System.out.println("Monthly Payment: " + (int) (monthlyPayment * 100) / 100.0);
		System.out.println("Total Payment: " + (int) (monthlyPayment * 12 * numberOfYears * 100) / 100.0 + "\n");
		
		// Print the column names. 
		System.out.println("Payment#\tInterest\tPrincipal\tBalance\n");
		
		// For loop for calculating amortization schedule for the loan. 
		for (int i = 1; i <= numberOfYears * 12; i++) {
			interest = (int) (monthlyInterestRate * balance * 100) / 100.0;
			principal = (int) ((monthlyPayment - interest) * 100) / 100.0;
			balance = (int) ((balance - principal) * 100) / 100.0; // Update balance with a new value. 
			// Display the table. 
			System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
		}
				
	}
}
