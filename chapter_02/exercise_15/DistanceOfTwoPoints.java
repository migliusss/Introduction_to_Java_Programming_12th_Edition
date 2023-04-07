package chapt2;

/*
 * Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) 
 * and displays their distance. 
 */

import java.util.Scanner; 

public class DistanceOfTwoPoints {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two points. 
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// Calculate the distance between two points. 
		double a = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		
		double distance = Math.pow(a, 0.5);
		
		// Display results. 
		System.out.println("The distance between the two points is " + distance);
	}
}
