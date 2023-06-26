package chapt2;

/*
 * A program that reads in the length of sides 
 * of an equilateral triangle and computes the area 
 * and volume using a formula. 
 */

import java.util.Scanner;

public class TriangleVolume {
	public static void main(String[] args) {
		// Create a Scanner 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter length of the equilateral triangle
		System.out.print("Enter lenght of the sides and height of the equilateral triangle: ");
		double lenght = input.nextDouble();
		
		// Calculate area
		double area = Math.sqrt(3) / 4  * Math.pow(lenght, 2);
		
		// Calculate volume
		double volume = area * lenght;
		
		// Display results
		System.out.println("The area is " + area);
		System.out.println("The volume of the Triangular prism is " + volume);
	}
}
