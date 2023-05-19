package chapt3;

/*
 * Exercise 3.32 shows how to test whether a 
 * point is on an unbounded line. Revise Exercise 3.32 to test whether a point is on 
 * a line segment. Write a program that prompts the user to enter the three points  for 
 * p0, p1 and p2 and displays whether p2 is on the line segment from p0 to p1. 
 */

import java.util.Scanner;

public class PointOnLine {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter three points for p0, p1, and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// Calculate point position. 
		double pointPosition = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		
		// Find out if a point is on the line segment or not. 
		if (pointPosition == 0 && (((x0 <= x2) && (x2 <= x1)) || ((x0 >= x2) && (x2 >= x1)))) {
			System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from (" + x0 + ", " + y0
					+ ") to (" + x1 + ", " + y1 + ")");
		}
		
		else {
			System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from (" + x0 + ", " + y0
					+ ") to (" + x1 + ", " + y1 + ")");
		}
	}
}
