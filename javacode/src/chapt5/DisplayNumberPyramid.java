package chapt5;

import java.util.Scanner;

/*
 * Write a program that prompts the user to enter an integer from 1 to 15
 * and displays a pyramid. 
 */

public class DisplayNumberPyramid {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the number of lines: ");
		int lines = input.nextInt();
		
		// Create a for loop. 
		for (int i = lines; i >= 1; i--) { // Outer loop for printing numbers on a new line. 
			for (int j = i; j >= 1; j--) { // Inner loop for printing numbers in descending order. 
				System.out.print(j + " ");
				
			}
			for (int h = 1 + 1; h <= i; h++) { // Inner loop for printing numbers in ascending order. 
				System.out.print(h + " ");
			}
			
			System.out.println();
		}
	}
}
