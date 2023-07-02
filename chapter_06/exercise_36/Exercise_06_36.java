package chapter_06;

import java.util.Scanner;

/*
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon 
 * in which all sides are of the same lenght and all angles have the same degree (i. e.,
 * the polygon is both equilateral and equiangular). The formula for computing the area of a regular polygon is 
 * 
 * Area = 5 * s^2 / 4 * tan * (PI / n) 
 * 
 * Write a method that return the area of a regular polygon using the following 
 * header: 
 * 
 * public static double area(int n, double side) 
 * 
 * Write a main method that prompts the user to enter the number of sides and the 
 * side of a regular polygon and displays its area. 
 */

public class Exercise_06_36 {
	/** Main method. */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the number of sides: ");
		int numberOfSides = input.nextInt();
		
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		// Display results. 
		System.out.println("The area of the pentagon is " + area(numberOfSides, side));
	}
	/** Return the area of a regular polygon. */
	public static double area(int n, double side) {
		double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
		
		return area; 
	}
}
