package chapt4;

/*
 * The area of a five-pointed star can be 
 * computed using the following formula (r is the radius of the inscribing circle). 
 * 
 * Write a program that prompts the user to enter the radius of the inscribing circle 
 * and displays its area. 
 */

import java.util.Scanner;

public class AreaOfFivePointedStar {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the radius of th circle inscribing the star: ");
		double radius = input.nextDouble();
		
		// Calculate area using formula in the book. 
		double area = 10 * (Math.tan((Math.PI / 10)) / (3 - Math.tan((Math.PI / 10)) * Math.tan((Math.PI / 10)))) 
				* Math.pow(radius, 2);
		
		// Display results. 
		System.out.println("The are of the star is " + area);
	}
}
