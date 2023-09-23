package chapter_09;

import java.util.Scanner;

/*
 * (Geometry: intersecting point) Suppose two line segments intersect. The two 
 * endpoints for the first line segment are (x1, y1) and (x2, y2) and for the second line
 * segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter 
 * these four endpoints and displays the intersecting point. As discussed in Programming
 * Exercise 3.25, the intersecting point can be found by solving a linear 
 * equation. Use LinearEquation class in Programming Exercise 9.11 to solve this 
 * equation. See Programming Exercise 3.25 for sample runs. 
 */

public class Exercise_09_12 {
	/** Main method. */
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		double a = y1 - y2;
		double b = -1 * (x1 - x2);
		double c = y3 - y4;
		double d = -1 * (x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		
		// Create LinearEquations object. 
		LinearEquations linearEquations = new LinearEquations(a, b, c, d, e, f);
		
		// Print results. 
		if (linearEquations.isSolvable()) {
			System.out.println("The intersecting point is at (" + linearEquations.getX() + ", " + linearEquations.getY() + ")");
		}
		else {
			System.out.println("The two lines are parallel");
		}
	}
}
