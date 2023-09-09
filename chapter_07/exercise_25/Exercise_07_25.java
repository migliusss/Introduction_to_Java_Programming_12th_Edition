package chapter_07;

import java.util.Scanner;

/*
 * (Algebra: solve quadratic equations) Write a method for solving a quadratic equation
 * using the following header:
 * 
 * public static int solveQuadratic(double[] eqn, double[] roots)
 * 
 * The coefficients of a quadratic equation ax^2 + bx + c = 0 are passed to the array
 * eqn and the real roots are stored in roots. The method returns the number of real 
 * roots. See programming Exercise 3.1 on how to solve quadratic equation. 
 * 
 * Write a program that prompts the user to enter values for a, b, and c and displays 
 * the number of real roots and all real roots. 
 */

public class Exercise_07_25 {
	public static void main(String[] args) {
		// Create a Scanner. 
			Scanner input = new Scanner(System.in);
				
			// Prompt the user. 
			System.out.print("Enter a, b, c: ");
				
			double a = input.nextDouble();				
			double b = input.nextDouble();
			double c = input.nextDouble();
			
			// Create arrays to store the coefficients and roots.
	        double[] coefficients = { a, b, c };
	        double[] roots = new double[2]; // Quadratic equations can have at most two real roots.
	        
	        // Call the solveQuadratic method to solve the equation and get the number of real roots.
	        int numberOfRoots = solveQuadratic(coefficients, roots);

	        // Display the results.
	        if (numberOfRoots == 0) {
	            System.out.println("The equation has no real roots.");
	        } 
	        else if (numberOfRoots == 1) {
	            System.out.println("The equation has one real root: " + roots[0]);
	        } 
	        else {
	            System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
	        }
	}
	/** Method for solving quadratic equations. **/
    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            // Two distinct real roots.
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            return 2;
        } else if (discriminant == 0) {
            // One real root (repeated).
            roots[0] = -b / (2 * a);
            return 1;
        } else {
            // No real roots.
            return 0;
        }
    }
}
