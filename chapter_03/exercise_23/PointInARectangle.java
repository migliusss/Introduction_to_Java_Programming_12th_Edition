package chapt3;

/*
 * Write a program that prompts the user to enter
 * a point (x, y) and checks whether the point is within the rectangle centered at 
 * (1, 1) with width 10 and height 5. For example (2, 2) is inside the rectangle and 
 * (6, 4) is outside the rectangle, as shown in Figure 3.7b. 
 */

import java.util.Scanner;

public class PointInARectangle {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		// Find the coordinates of the point and display the message if the point is inside or outside the rectangle. 
		if (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 && (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2)) {
			System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
		}
		else {
			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
		}
	}
}
