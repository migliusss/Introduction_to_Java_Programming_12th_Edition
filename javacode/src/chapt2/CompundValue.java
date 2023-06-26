package chapt2;

/*
 * Write a program that prompts the user to enter a monthly saving amount and displays the account 
 * value after the sixth month. 
 */

import java.util.Scanner;

public class CompundValue {
	public static void main(String[] args) {
		
		// Create constants. 
		final double ANNUAL_INTEREST_RATE = 3.75;
		final double MONTHLY_INTEREST_RATE = 0.003125;
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the monthly saving amount: ");
		int amount = input.nextInt();
		
		// Calculate the value after 6 months. 
		double oneMonth = amount * (1 + MONTHLY_INTEREST_RATE); 
		double twoMonth = (amount + oneMonth) * (1 + MONTHLY_INTEREST_RATE);
		double threeMonth = (amount + twoMonth) * (1 + MONTHLY_INTEREST_RATE);
		double fourMonth = (amount + threeMonth) * (1 + MONTHLY_INTEREST_RATE);
		double fiveMonth = (amount + fourMonth) * (1 + MONTHLY_INTEREST_RATE);
		double sixMonth = (amount + fiveMonth) * (1 + MONTHLY_INTEREST_RATE);
		
		// Display results. 
		System.out.println("After the first month, the account value is " + oneMonth);
		System.out.println("After the second month, the account value is " + twoMonth);
		System.out.println("After the third month, the account value is " + threeMonth);
		System.out.println("After the fourth month, the account value is " + fourMonth);
		System.out.println("After the fifth month, the account value is " + fiveMonth);
		System.out.println("After the sixt month, the account value is " + sixMonth);
	}
}
