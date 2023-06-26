package chapt4;

/*
 * Write a program that prompts the user to enter 
 * the length from the center of a pentagon to a vertex and computes the area of the 
 * pentagon, as shown in figure. 
 */

import java.util.Scanner;

public class AreaOfPentagon {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the lenght from the center to a vertex: ");
		double length = input.nextDouble();
		
		// s is the length of a side. 
		double s = 2 * length * Math.sin((Math.PI / 5));
		
		// Compute area. 
		double area = (5 * Math.pow(s, 2)) / (4 * Math.tan((Math.PI / 5)));
		
		// Print results. 
		System.out.printf("The area of the pentagon is %.2f", area);
	}
}
