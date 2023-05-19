package chapt3;

/*
 * Write a program that prompts the user to enter the center 
 * coordinates and radius of two circles and determines whether the second circle 
 * is inside the first or overlaps with the first, as shown in Figure 3.10. 
 */

import java.util.Scanner;

public class TwoCicles {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double circle1x = input.nextDouble();
		double circle1y = input.nextDouble();
		double circle1Radius = input.nextDouble();
		
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double circle2x = input.nextDouble();
		double circle2y = input.nextDouble();
		double circle2Radius = input.nextDouble();
		
		// Check the conditions and display results. 
		if (Math.pow(Math.pow(circle2x - circle1x, 2) + Math.pow(circle2y - circle1y, 2), 0.5) <= Math.abs(circle1Radius - circle2Radius))
			System.out.println("circle2 is inside circle1");
		else if (Math.pow(Math.pow(circle2x - circle1x, 2) + Math.pow(circle2y - circle1y, 2), 0.5) <= circle1Radius + circle2Radius)
			System.out.println("circle2 overlaps circle1");
		else
			System.out.println("circle2 does not overlap circle1");
	}
}
