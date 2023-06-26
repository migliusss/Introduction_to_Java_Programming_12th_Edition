package chapt3;

/*
 * Write a program that prompts the user enter 
 * the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the 
 * user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert 
 * from Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S. 
 * dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively. 
 */

import java.util.Scanner;

public class CurrencyExchange {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user.
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = input.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int conversionOrder = input.nextInt();
		
		// Based on conversion order display results. 
		if (conversionOrder == 0) {
			System.out.print("Enter the dollar amount: ");
			double amountDollars = input.nextDouble();
			
			double amountDollarsToRmb = amountDollars * exchangeRate;
			
			System.out.println("$" + amountDollars + " is " + amountDollarsToRmb + " yuan");
		}
		else if (conversionOrder == 1) {
			System.out.print("Enter the RMB amount: ");
			double amountRmb = input.nextDouble();
			
			double amountRmbToDollars = amountRmb / exchangeRate;
			
			System.out.println(amountRmb + " yuan is $" + amountRmbToDollars);
		}
		else {
			System.out.println("Incorrect input");
		}
	}
}
