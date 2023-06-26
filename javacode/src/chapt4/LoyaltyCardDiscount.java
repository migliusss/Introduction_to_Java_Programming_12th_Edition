package chapt4;

/*
 * Write a program that reads the following information 
 * and prints discount information for the customer's loyalty card at the local cafe:
 * 
 * Customer's name (e.g., Nessa)
 * Number of coffees bought in total (e.g., 35)
 * Coffee price (e.g., 3)
 * Standard discount rate (e.g., 15%)
 * Mailing list member discount rate (e.g., 3%)
 */

import java.util.Scanner;

public class LoyaltyCardDiscount {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter customer's name: ");
		String customersName = input.nextLine();
		
		System.out.print("Enter number of coffees bought in total: ");
		int coffeesBought = Integer.parseInt(input.nextLine());

		System.out.print("Enter average coffee price: ");
		double coffeePrice = Double.parseDouble(input.nextLine());
		
		System.out.print("Enter standard discount rate: ");
		double standardDiscount = Double.parseDouble(input.nextLine());
		
		System.out.print("Enter mailing-list member discount: ");
		double memberDiscount = Double.parseDouble(input.nextLine());
		
		// Calculate discount information. 
		double totalSpending = coffeesBought * coffeePrice;
		double totalStandardDiscount = totalSpending * standardDiscount;
		double totalSmemberDiscount = totalSpending * memberDiscount;
		double totalSaved = totalStandardDiscount + totalSmemberDiscount;
		double totalSpendingAfterDiscount = totalSpending - totalSaved;
		
		// Display results. 
		System.out.println("Customer Name: " + customersName);
		System.out.println("Coffees Bought: " + coffeesBought);
		System.out.printf("Average Coffee Price: $%.2f\n", coffeePrice);
		System.out.printf("Total Spending on Coffee: $%.2f\n", totalSpending);
		System.out.println("Discounts: ");
		System.out.printf("  Standard Discount (" + (standardDiscount * 100) + "%%): $%.2f\n", totalStandardDiscount);
		System.out.printf("  Mailing-list membership discount: (" + (memberDiscount * 100) + "%%): $%.2f\n", totalSmemberDiscount);
		System.out.printf("  Total Saved: $%.2f\n", totalSaved);
		System.out.printf("Total Spending after Discount: $%.2f", totalSpendingAfterDiscount);
	}
}
