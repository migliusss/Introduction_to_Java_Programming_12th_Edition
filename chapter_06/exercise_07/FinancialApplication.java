package chapt6;

import java.util.Scanner;

/*
 * Write a test program that prompts the user to enter the investment amount(e.g., 1,000) 
 * and the interest rate (e.g., 9%) and prints a table that displays future value for the years from 1 to 30. 
 */

public class FinancialApplication {
	// Main method. 
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("The amount invested: ");
		double amount = input.nextDouble();
		
		System.out.print("Annual interest rate: ");
		double anualInterestRate = input.nextDouble();
		
		// Calculate monthly interest rate. 
		double monthlyInterestRate = anualInterestRate / 1200;
		
		// Print a header. 
		System.out.println("Years\tFutureValue");
		
		// Create a for loop to display future value for the years from 1 to 30. 
		for (int i = 1; i <= 30; i++) { // i = years. 
			System.out.printf("%d \t %10.2f \n", i, futureInvestmentValue(amount, monthlyInterestRate, i));
		}
	}
	
	// Create a method to calculate future investment value and returns invesmentValue. 
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		// Calculate monthly payment. 
		double investmentValue = (int) (investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12)) * 100) / 100.0;
		
		return investmentValue;
	}
}
