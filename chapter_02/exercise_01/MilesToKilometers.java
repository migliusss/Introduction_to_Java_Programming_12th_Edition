package chapt2;

/*
 * A program that reads a mile in a double value from the console, 
 * converts it to kilometers and displays the result. 
 */

import java.util.Scanner;

public class MilesToKilometers {
	public static void main(String[] args) {
		
		// Create a constant.  
		final double KILOMETERS = 1.6; // 1 mile is 1.6 kilometers. 
		
		// Create a Scanner.
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter miles.
		System.out.print("Enter miles: ");
		double miles = input.nextDouble();
		
		// Calculate meters.
		double kilometers = miles * KILOMETERS;
		
		// Display results.
		System.out.println(miles + " miles is " + kilometers + " kilometers.");
		
	}

}
