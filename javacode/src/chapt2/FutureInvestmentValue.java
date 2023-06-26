package chapt2;

/*
 * Write a program that reads in investment amount, annual interest rate, and number of years 
 * and displays the future investment value using a formula. 
 */

import java.util.Scanner;

public class FutureInvestmentValue {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Enter annual investment rate in percentage: ");
		double annualInterestRate = input.nextDouble();
		
		System.out.print("Enter number of years: ");
		int numberOfYears = input.nextInt();
		
		// Calculate monthly interest. 
		double monthlyInterestRate = annualInterestRate / 1200;
		
		// Calculate future investment value. 
		double futureInvestmentValue = investmentAmount * Math.pow((++monthlyInterestRate), (numberOfYears * 12));
		
		// Display results. 
		System.out.println("Future value is " + futureInvestmentValue);
	}
}
