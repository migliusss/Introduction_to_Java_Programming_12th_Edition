package chapt2;

/*
 * Write a program that prompts the user to enter three points, (x1, y1), (x2, y2) and (x3, y3), 
 * of a triangle then displays its area. 
 */

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		// Create a Scanner.
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the coordinates of three points separated by spaces like "
				+ "x1 y1 x2 y2 x3 y3: ");
		
		double aX = input.nextDouble();
		double aY = input.nextDouble();
		double bX = input.nextDouble();
		double bY = input.nextDouble();
		double cX = input.nextDouble();
		double cY = input.nextDouble();
		
		// Calculate area of a triangle by using formula in the book. 
		double areaTriangle = (aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;
		
		// Display results. 
		System.out.println("The area of the triangle is " + areaTriangle);
	}
}
