package chapt6;

import java.util.Scanner;

/*
 * Implement the following two method: 
 * 
 * Return true if the sum of every two sides is greater that the third side.
 * public static boolean isValid(
 * 	double side1, double side2. double, side3)
 * 
 * Return the area of the triangle. 
 * public static double area(
 * 	double side1, double side2, double side3)
 * 
 * Write a test program that reads three sides for a triangle and uses the isValid 
 * method to test if the input is valid and uses the area method to obtain the area. 
 * The program displays the area if the input is valid. Otherwise, it displays that
 * the input is invalid. The formula for computing the area of a triangle is given in 
 * Programming Exercise 2.19. 
 */

public class Triangles {
	/** Main method. */
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter three sides of a triangle: ");
		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		// Display the area if the input is valid.
		if (isValid(side1, side2, side3)) {
			System.out.println("The area of a triangle is: " + area(side1, side2, side3));
		}
		else {
			System.out.println("Invalid input.");
		}
	}
	
	/** Return true if the sum of every two sides is greater that the third side. */
	public static boolean isValid(double side1, double side2, double side3) {
		return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
	}
	
	/** Return the area of the triangle. */
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
}
