package chapt2;

/*
 * Write a program that prompts the user to enter the side of a hexagon and displays its area. 
 */

import java.util.Scanner; 

public class AreaOfHexagon {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the length of this side: ");
		double sideLength = input.nextDouble();
		
		// Use a formula to calculate hexagon area. 
		double area = (3 * Math.sqrt(3) / 2) * Math.pow(sideLength, 2);
		
		// Display results. 
		System.out.println("The area of the hexagon is " + area);
	}
}
