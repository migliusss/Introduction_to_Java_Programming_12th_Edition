package chapt4;

/*
 * Write a program that prompts the user to enter the latitude and longitude of two 
 * points on the earth in degrees and displays its great circle distance. 
 */

import java.util.Scanner;

public class GreatCircleDistance {
	public static void main(String[] args) {
		final double AVERAGE_EART_RADIUS = 6371.01; 
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter point 1 (latitude and longtitude) in degrees: ");
		double x1 = Math.toRadians(input.nextDouble());
		double y1 = Math.toRadians(input.nextDouble());
		
		System.out.print("Enter point 2 (latitude and longtitude) in degrees: ");
		double x2 = Math.toRadians(input.nextDouble());
		double y2 = Math.toRadians(input.nextDouble());
		
		// Calculate average earth radius. 
		double d = AVERAGE_EART_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + 
				Math.cos(x1) * Math.cos(x2) * Math.cos((y1-y2)));
		
		// Display results. 
		System.out.println("The distance between the two points is " + d + " km");
		
	}
}
