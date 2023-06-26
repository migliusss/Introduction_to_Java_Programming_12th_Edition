/*
 * Write a program that displays a table with conversion from Inches to Centimeters. 
 */

package chapt5;

public class FromInchToCentimeter {
	public static void main(String[] args) {
		final double INCH_TO_CM = 2.54; // 1 inch is 2.54 centimeters. 
		
		// Print names for the columns. 
		System.out.println("Inches    Centimeters");
		
		// Create a for loop to calculate Inches to Centimeters from 0-10.
		for (int i = 0; i <= 10; i++) {
			
			// Formating the console output. 
			System.out.printf("%-15d%6.2f\n", i, (i * INCH_TO_CM));
		}
	}
}
