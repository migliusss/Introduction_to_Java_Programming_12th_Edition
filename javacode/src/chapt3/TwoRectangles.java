package chapt3;

/*
 * Write a program that prompts the user to enter the 
 * center x-, y-coordinates, width, and height of two rectangles and determines 
 * whether the second rectangle is inside the first or overlaps with the first, as 
 * shown in Figure 3.9. 
 */

import java.util.Scanner;

public class TwoRectangles {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
	
		// Check the conditions and display results. 
		if ((Math.pow(Math.pow(y2 - y1, 2), 0.5) + height2 / 2 <= height1 / 2) && 
				(Math.pow(Math.pow(x2 - x1, 2), 0.5) + width2 / 2 <= width1 / 2) &&
				(height1 / 2 + height2 / 2 <= height1) &&
				(width1 / 2 + width2 / 2 <= width1)) {
			System.out.println("r2 is inside r1");
		}
		else if ((x1 + width1 / 2 > x2 - width2) || (y1 + height1 / 2 > y2 - height2)) {
			System.out.println("r2 overlaps r1");
		}
		else {
			System.out.println("r2 does not overlap r1");
		}
	}
}
