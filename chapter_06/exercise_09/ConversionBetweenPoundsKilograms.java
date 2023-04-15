package chapt6;

/*
 * Write a class that contains the following two methods: 
 * public static double poundToKilogram(double pound)
 * public static double kilogramToPound(double kilogram)
 * 
 * The formula for the conversion is: 
 * pound = 0.453 * kilogram
 * kilogram = 2.204 * pound
 * 
 * Write a test program that invokes these methods to displays two tables. 
 */

public class ConversionBetweenPoundsKilograms {
	public static void main(String[] args) {
		// Print header. 
		System.out.println("Kilograms    Pounds    |    Pounds    Kilograms");
		System.out.println("-----------------------------------------------");
		
		// A for loop to print a two tables. 
		for (double i = 1, j = 20; i <= 199 && j <= 515; i += 2, j += 5) {
			System.out.printf("%-10.0f%7.1f      |    %-10.0f%.2f \n", i, poundToKilogram(i), j, kilogramToPound(j));
		}
	}
	
	// Convert from pounds to kilograms. 
	public static double poundToKilogram(double pound) {
		return 2.204 * pound;
	}
	
	// Convert from kilograms to pounds. 
	public static double kilogramToPound(double kilogram) {
		return 0.453 * kilogram;
	
	}
}
