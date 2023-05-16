package chapt3;

/*
 * Write a program that prompts the user to enter a 
 * point (x, y) and checks whether the point is within the circle centered at (0, 0)
 * with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
 * circle. 
 */

import java.util.Scanner;

public class PointInACircle {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		// Calculate distance of the points and display a message if the point is inside or outside the circle. 
		double distance = Math.pow(Math.pow(-x, 2) + Math.pow(-y, 2), 0.5);
		
		if (distance <= 10) {
			System.out.println("Point (" + x + ", " + y + ") is in the circle");
		}
		else {
			System.out.println("Point (" + x + ", " + y + ") is not in the circle");
		}
	}
}
