/*
 * Write a program that displays two tables side by side. 
 * One table with conversion from Ping to Square meter. 
 * Another table with conversion from Square meter to Ping. 
 */

package chapt5;

public class FromSquareMeterToPing {
	public static void main(String[] args) {
		
		final double PING_TO_SQUARE_METERS = 3.305; // 1 Ping is 3.305 Square meters. 
		
		// Print column names for the two tables. 
		System.out.println("Ping      Square meter   |   Square meter      Ping");
		
		// Create a for loop to calculate results. Variables and i and j are for two tables. 
		for (int i = 10, j = 30; i <= 80 && j <= 100; i+=5, j+=5) {
			
			// Formating the console output. 
			System.out.printf("%-14d%8.3f   |   %-15d%7.3f\n", i, (i * PING_TO_SQUARE_METERS), j, (j / PING_TO_SQUARE_METERS));
		}
	}
}
