package chapt4;

/*
 * A regular polygon is an n-sided polygon 
 * in which all sides are of the same length and all angles have the samee degree (i.e., 
 * the polygon is both equilateral and equiangular). Write a program that prompts the user to enter 
 * the number of sides and their length of a regular polygon and displays its area.  
 */

import java.util.Scanner;

public class AreaOfPolygon {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the number of sides: ");
		int numberOfSides = input.nextInt();
		
		System.out.print("Enter the side: ");
		double sideLength = input.nextDouble();
		
		// Calculate area using formula in the book. 
		double area = (numberOfSides * Math.pow(sideLength, 2)) / (4 * Math.tan((Math.PI / numberOfSides)));
		
		// Display results. 
		System.out.println("The area of the polygon is " + area);
	}
}
