package chapt4;

/*
 * Rewrite Listing 2.10, ComputeChange.java,
 * to fix the possible loss of accuracy when converting a float value to an int 
 * value. Read the input as a string such as "11.56". Your program should ex-
 * tract the dollar amount before the decimal point, and the cents after the decimal 
 * amount using the indexOf and substring methods. 
 */

import java.util.Scanner;

public class MonetaryUnits3 {
	public static void main(String[] args) {
		// Create a Scanner, 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the amount in double, for example 11.56: ");
		String amount = input.nextLine();
		
		
		int dot = amount.indexOf('.');
		double numberOfOneDollars = Double.parseDouble(amount.substring(0, dot)); // Get number of dollars. 
		double cents = Double.parseDouble(amount.substring(dot + 1)); // Get number of cents. 
		
		// Find quarters, dimes and nickels. 
		double numberOfQuarters = cents / 25;
		cents = cents % 25;
		
		double numberOfDimes = cents / 10;
		cents = cents % 10;
		
		double numberOfNickels = cents / 5;
		cents = cents % 5;
		
		// Display results. 
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + cents + " pennies");
	}
}
