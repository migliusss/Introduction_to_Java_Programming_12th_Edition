package chapt3;

/*
 * Write a program that read two edges of a 
 * rectangle and computes the perimeter if the input is valid. Otherwise, display that
 * the input is invalid. The input is valid if both edges are of different lengths. 
 */

import java.util.Scanner;

public class PerimeterOfATriangle {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter length and width of a rectangle. 
		System.out.print("Enter lenght and width of a rectangle: ");
		double length = input.nextDouble();
		double width = input.nextDouble();
		
		double perimeter; 
		
		// Calculate perimeter only if both edges are of different lengths. 
		if (length == width) {
			System.out.println("Error: invalid input");
		}
		else {
			perimeter = 2 * (length + width);
			System.out.println("Perimeter of a rectangle is " + perimeter);
		}
	}
}
