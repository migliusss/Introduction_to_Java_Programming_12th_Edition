package chapter_09;

import java.util.Scanner;

/*
 * (Algebra: quadratic equations) Design a class named QuadraticEquation for 
 * a quadratic equation ax^2 + bx + c = 0. 
 * 
 * Methods are useful only if the discriminant is nonnegative. Let these methods
 * return 0 if the discriminant is negative. 
 * 
 * Draw the UML diagram for the class then implement the class. Write a test program 
 * that prompts the user to enter values for a, b, and c and displays the result
 * based on the discriminant. If the discriminant is positive, display the two roots. If
 * the discriminant is 0, display the one root. Otherwise, display "The equation has 
 * no roots." See Programming Exercise 3.1 for sample runs. 
 */

public class Exercise_09_10 {
	/** Main method. */
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user.
		System.out.print("Enter a, b, c: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// Create QuadraticEquation object. 
		QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
		
		// If else statements to display results based on the discriminant. 
		if (quadraticEquation.getDiscriminant() > 0)
			System.out.println("The equation has two roots " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
		else if (quadraticEquation.getDiscriminant() == 0)
			System.out.println("The equation has one root " + quadraticEquation.getRoot1());
		else 
			System.out.print("The equation has no real roots");
	}
}
