package chapt3;

/*
 * A shipping company uses a function to calculate 
 * the cost (in dollars) of shipping based on the weight of the package (in pounds). 
 * Write a program that prompts the user to enter the weight of the package and 
 * display the shipping cost. If the weight is greater than 20, display a message "the 
 * package cannot be shipped". 
 */

import java.util.Scanner;

public class CostOfShipping {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter weight in pounds. 
		System.out.print("Enter the weight of the package (pounds): ");
		double packageWeight = input.nextDouble();
		
		double shippingCost = 0;
		
		// Calculate shipping cost and display a message accordingly. 
		if (packageWeight > 0 && packageWeight <= 2) {
			shippingCost = packageWeight * 2.5;
			System.out.println("Shipping cost is $" + shippingCost);
		}
		else if (packageWeight <= 4) {
			shippingCost = packageWeight * 4.5;
			System.out.println("Shipping cost is $" + shippingCost);
		}
		else if (packageWeight <= 10) {
			shippingCost = packageWeight * 7.5;
			System.out.println("Shipping cost is $" + shippingCost);
		}
		else if (packageWeight <= 20) {
			shippingCost = packageWeight * 10.5;
			System.out.println("Shipping cost is $" + shippingCost);
		}
		else {
			System.out.print("The package cannot be shipped");
		}
	}
}
