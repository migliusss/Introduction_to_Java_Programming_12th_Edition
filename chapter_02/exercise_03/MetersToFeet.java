package chapt2;

/*
 * A program that reads number in meters, 
 * converts it to feet and displays results.
 */

import java.util.Scanner;

public class MetersToFeet {
	public static void main(String[] args) {
		// Create a constant. 
		final double FEET = 3.2786;
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter meters.
		System.out.print("Enter a value for meter: ");
		int meters = input.nextInt();
		
		// Calculate feet.
		double feet = meters * FEET;
		
		// Display results.
		System.out.println(meters + " meters is " + feet + " feet.");
	}
}
