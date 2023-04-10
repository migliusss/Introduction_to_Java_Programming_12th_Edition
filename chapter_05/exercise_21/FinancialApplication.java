package chapt5;

import java.util.Scanner;

/*
 * Write a program that lets the user enter the loan amount and load period in number of years
 * and displays the monthly and total payments for each interest rate starting from 5% to 10%, 
 * with an increment of 1/4. 
 */

public class FinancialApplication {
	public static void main(String[] args) {
		// Declare and initialize variables. 
		double monthlyPayment = 0;
		double totalPayment = 0;
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Number Of Years: ");
		int numberOfYears = input.nextInt();
		
		// Print column names. 
		System.out.println("\nInterest Rate\t\tMonthly Payment\t\tTotal Payment\t\t");
		
		// Create a for loop to calculate payments for each interest rate. 
		for (double i = 5.0; i <= 10.0; i+=0.25) {
			
			// Obtain monthly interest rate. 
			double monthlyInterestRate = i / 1200;
			
			// Calculate monthly payment. 
			monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			
			// Calculate total payment.
			totalPayment = (int) (monthlyPayment * numberOfYears * 12 * 100) / 100.0;
			
			// Display results. 
			System.out.println(i + "\t\t\t" + (int) (monthlyPayment * 100) / 100.0 + "\t\t\t" + totalPayment + "\t\t\t");
			
		}
	}
}

