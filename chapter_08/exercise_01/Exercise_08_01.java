package chapter_08;

import java.util.Scanner;

/*
 * (Sum elements row by row) Write a method that returns the sum of all the 
 * elements in a specified row in a matrix using the following header:   
 *       
 * public static double sumRow(double[][] m, int rowIndex)        
 *           
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each row. 
 */

public class Exercise_08_01 {
	public static void main(String[] args) {
		final int ROWS = 3;
		final int COLUMNS = 4;
		double[][] matrix = new double[ROWS][COLUMNS];
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a " + ROWS + "-by-" + COLUMNS + " matrix row by row: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		// Display results. 
		System.out.println("Sum of the elements at row 0 is " + sumRow(matrix, 0));
		System.out.println("Sum of the elements at row 1 is " + sumRow(matrix, 1));
		System.out.println("Sum of the elements at row 2 is " + sumRow(matrix, 2));
	}
	
	/** Method that returns the sum of all the elements in a specified row in a matrix. **/
	public static double sumRow(double[][] m, int rowIndex) {
		double sumOfRows = 0; 
		
		for (int i = 0; i < 4; i++) {
			sumOfRows += m[rowIndex][i];
		}
		
		return sumOfRows;
	}
}
