package chapter_08;

import java.util.Scanner;

/*
 * (Average the major diagonal in a matrix) Write a method that averages all the numbers  
 * in the major diagonal in an n * n matrix of double values using the following  
 * header:                                                                        
 *                                                                                
 * public static double averageMajorDiagonal(double[][] m)                            
 *                                                                                
 * Write a test program that reads a 4-by-4 matrix and displays the averages of all    
 * its elements on the major diagonal.
 */

public class Exercise_08_02 {
	public static void main(String[] args) {
		final int ROWS = 4;
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
		System.out.println("Average of the elements is the major diagonal is " + sumMajorDiagonal(matrix));
	}
	
	/** Method that averages all the numbers in the major diagonal in an n * n matrix of double values. **/
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		
		return sum / m.length;
	}
}
