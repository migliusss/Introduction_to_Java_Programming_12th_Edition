package chapter_06;

import java.util.Scanner;

/*
 * (Geometry: area of a pentagon) The area of a pentagon can be computed using
 * the following formula:
 * 
 * Area = 5 * s^2 / 4 * tan * (PI / 5) 
 * 
 * Write a method that returns the area of a pentagon using the following header: 
 * 
 * public static double area(double side) 
 * 
 * Write a main method that prompts the user to enter the side of a pentagon and 
 * displays its area. 
 */

public class Exercise_06_35 {
	/** Main method. */ 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		// Display results. 
		System.out.println("The area of the pentagon is " + area(side));
	}
	
	/** Returns the area of a pentagon. */
	public static double area(double side) {
		double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
		
		return area; 
	}
}
