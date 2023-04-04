package chapt2;

/*
 * A program that reads a mile in a double value from the console, 
 * converts it to kilometers and displays the result. 
 */

import java.util.Scanner;

public class MilesToKilometers {
	public static void main(String[] args) {
		
		// Create a constant for 1 mile
		final double MILE = 1.6;
		
		// Create a Scanner 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter miles
		System.out.print("Enter miles: ");
		double miles = input.nextDouble();
		
		// Calculate meters
		double meters = miles * MILE;
		
		// Display results 
		System.out.println(miles + " miles is " + meters + " kilometers.");
		
	}

}
