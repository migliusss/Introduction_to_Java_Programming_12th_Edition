package chapt2;

/*
 * Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of accuracy when converting a duble 
 * value to an int value. Enter the input as an integer whose last two digits represents the cents. 
 * For example, the input 1156 represents 11 dollars and 56 cents. 
 */

import java.util.Scanner;

public class MonetaryUnits {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter amount as an integer, for example 1156: ");
		// Receive the amount. 
		int amount = input.nextInt();
		
		double remainingAmount = amount;
		
		// Find the number of one dollars. 
		double numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		// Find the number of quarters in the remaining amount. 
		double numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		// Find the number of dimes in the remaining amount. 
		double numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		// Find the number of nickels in the remaining amount. 
		double numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		// Find the number of pennies in the remaining amount. 
		double numberOfPennies = remainingAmount;
		
		// Display results. 
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");

	}
}
