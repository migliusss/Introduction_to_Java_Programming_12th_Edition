package chapt2;

/* 
 * A program that converts square meters into ping.
 */

import java.util.Scanner;

public class SquareMeterToPing {
	public static void main(String[] args) {
		// Create a constant.
		final double PING = 0.3025;
		
		// Create a Scanner.
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter square meters.
		System.out.print("Enter a number in square meters: ");
		double squareMeters = input.nextDouble();
		
		// Calculate ping.
		double ping = squareMeters * PING;
		
		// Display results.
		System.out.println(squareMeters + " square meters is " + ping + " pings.");
	}
}
