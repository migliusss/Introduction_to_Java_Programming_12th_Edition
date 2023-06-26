package chapt3;

/*
 * Given a directed line from point p0(x0, y0) to p1(x1, 
 * y1), you can use the following condition to decide whether a point p2(x2, y2) is
 * one the left of the line, on the right, or on the same line. 
 */

import java.util.Scanner;

public class PointPosition {
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
		
		// Condition. 
		if (pointPosition > 0)
			System.out.println("p2 is on the left side of the line");
		else if (pointPosition == 0)
			System.out.println("p2 is on the same line");
		else if (pointPosition < 0)
			System.out.println("p2 is on the right side of the line");
	}
}
