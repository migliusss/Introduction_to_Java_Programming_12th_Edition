/*
 * Write a program that displays two tables side by side. 
 * Tables show conversion from Celsius to Fahrenheit and from Fahrenheit to Celsius. 
 */

package chapt5;

public class ConversionFromCToFAndFToC {
	public static void main(String[] args) {
		// Print names for the columns. 
		System.out.println("Celsius      Fahrenheit   |   Fehrenheit    Celsius");
		
		// Create a for loop to calculate results. Variable i and j two tables. 
		for (int i = 0, j = 20; i <= 100 && j <= 270; i+=2, j+=5) {
			
			// Formating the console output. 
			System.out.printf("%-15d%8.3f   |   %-14d%7.3f\n", i, (i * 9 / 5.0 + 32), j, ((j - 32) * 5 / 9.0));
		}
	}
}
