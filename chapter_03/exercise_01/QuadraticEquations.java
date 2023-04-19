package chapt3;

/*
 * Write a program that prompts the user to enter values for a, b and c and 
 * displays the resukts based on the discriminant. If the discriminant is positive, 
 * display two roots. If the discriminant is 0, display one root. Otherwise display "The equation has no real roots."
 */

import java.util.Scanner;

public class QuadraticEquations {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a, b, c: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// Calculate discriminant using formula in the book. 
		double discriminant = Math.pow(b * b - 4 * a * c, 0.5);
		
		// Calculate root one and root two. 
		double root1 = (- b + discriminant) / (2 * a);
		double root2 = (- b - discriminant) / (2 * a);
		
		// If else statements to display results based on the discriminant. 
		if (discriminant > 0)
			System.out.println("The equation has two roots " + root1 + " and " + root2);
		else if (discriminant == 0)
			System.out.println("The equation has one root " + root1);
		else 
			System.out.print("The equation has no real roots");
		
	}
}
