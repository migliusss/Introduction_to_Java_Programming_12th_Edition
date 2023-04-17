package chapt2;

/*
 * Write a program that reads the balance and the annual percentage interest rate 
 * and displays the interest rate for the next month. 
 */

import java.util.Scanner; 

public class CalculateInterest {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		
		double balance = input.nextDouble();
		double annualInterest = input.nextDouble();
		
		// Calculate interest using formula in the book. 
		double interest = balance * (annualInterest / 1200);
		
		// Display results. 
		System.out.println("The interest is " + interest);
	}
}
