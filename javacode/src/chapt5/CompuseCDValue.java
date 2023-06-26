package chapt5;

import java.util.Scanner;

/*
 * Suppose you put $10,000 into a CD 
 * with an annual percentage yield of 6.15%. After one month, the CD is worth
 * 10000 + 10000 * 6.15 / 1200 = 10051.25
 * After two months, the CD is worth 
 * 10051.25 + 10051.25 * 6.15 / 1200 = 10102.76
 * After three months, the CD is worth 
 * 10051.25 + 10051.25 * 6.15 / 1200 = 10102.76 
 * and so on.
 * 
 * Write a program that prompts the user to enter an amount (e.g., 10000), the
 * annual percentage yield (e.g., 6.15), and the number of months (e.g., 18) and 
 * displays a table as shown in figure in the sample run. 
 */

public class CompuseCDValue {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the initial deposit amount: ");
		double depositAmount = input.nextDouble();
		
		System.out.print("Enter annual percentage yield: ");
		double annualPercentageYield = input.nextDouble();
		
		System.out.print("Enter maturity period (number of months): ");
		int numberOfMonths = input.nextInt();
		
		// Print table header.
		System.out.println("\nMonth\tCD Value");
		
		// Calculate the worth using a for loop. 
		for (int i = 1; i <= numberOfMonths; i++) {
			depositAmount += depositAmount * annualPercentageYield / 1200;
			
			// Display the table. 
			System.out.printf("%-8d%.2f\n", i, depositAmount);
		}
	}
}
