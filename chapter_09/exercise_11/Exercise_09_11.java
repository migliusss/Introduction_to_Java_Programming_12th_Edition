package chapter_09;

import java.util.Scanner;

/*
 * (Algebra: 2 * 2 linear equations) Design a class named LinearEquations for a
 * 2 * 2 system of linear equations. 
 * 
 * Draw the UML diagram for the class then implement the class. Write a test program 
 * that prompts the user to enter a, b, c, d, e, and f and displays the result. 
 * If ad - bc is 0, report that "The equation has no solution." See Programming 
 * Exercise 3.3 for sample runs. 
 */

public class Exercise_09_11 {
	/** Main method. */
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		// Create LinearEquations object. 
		LinearEquations linearEquations = new LinearEquations(a, b, c, d, e, f);
		
		// Print results. 
		if (!linearEquations.isSolvable())
			System.out.println("The equation has no solution");
		else {
			System.out.println("x is " + linearEquations.getX() + " and y is " + linearEquations.getY());
		}
	}
}
