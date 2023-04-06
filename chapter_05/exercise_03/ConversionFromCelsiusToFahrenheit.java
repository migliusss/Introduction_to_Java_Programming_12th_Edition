/*
 * Write a program that displays a table with conversion from Celsius to Fahrenheit. 
 */

package chapt5;

public class ConversionFromCelsiusToFahrenheit {
	public static void main(String[] args) {
		// Print names for the columns. 
		System.out.println("Celsius    Fahrenheit");
		
		// Create a for loop to calculate Celsius to Fahrenheit from 0-100. Increase by 2 Celsius. 
		for (int celsius = 0; celsius < 102; celsius += 2) {
			
			// Formating the console output. 
			System.out.printf("%-15d%6.1f\n", celsius, (celsius * 9 / 5.0 + 32));
			
		}
	}
}
