package chapt3;

/*
 * Suppose a right triangle is placed in a plane as 
 * shown below. The right-angle point is placed at (0, 0), and the other two points 
 * are placed at (200, 0) and (0, 100). Write a program that prompts the user to enter 
 * a point with x- and y-coordinates and determines whether the point is inside
 * the triangle. 
 */

import java.util.Scanner;

public class PointsInATriangle {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		// Check if the point is inside or outside the triangle and display results. 
		if (Math.pow(Math.pow(x, 2), 0.5) == 0 && (Math.pow(Math.pow(x, 2), 0.5) <= 200)
				&& ((Math.pow(Math.pow(y, 2), 0.5) <= 100 && (Math.pow(Math.pow(y, 2), 0.5) == 0)))) {
			System.out.println("The point is in the triangle");
		}
		else {
			System.out.println("The point is not in the triangle");
		}
	}
}
