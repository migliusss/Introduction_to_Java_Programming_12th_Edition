package chapt2;

/*
 * A program that prompts the user to enter the initial velocity u in 
 * meters/second time span t in seconds and acceleration a in meters/second * 2
 * and returns the distance covered. 
 */

import java.util.Scanner;

public class Motion {
	public static void main(String[] args) {
		// Create a Scanner 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter u, t, and a
		System.out.print("Enter a, t and a: ");
		double velocity = input.nextDouble();
		double timeSpan = input.nextDouble();
		double acceleration = input.nextDouble();
		
		// Calculate distance covered 
		double distance = velocity * timeSpan + 1 / 2 * Math.pow((acceleration * timeSpan), 2);
		
		// Display results 
		System.out.println("The distance covered is " + distance);
	}
}
