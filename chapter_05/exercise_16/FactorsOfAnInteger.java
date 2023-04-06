/*
 * Write a program that reads an integer and displays all its smallest factors in an increasing order. 
 */

package chapt5;

import java.util.Scanner;

public class FactorsOfAnInteger {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter an integer. 
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		// Create a for loop thats runs through all the number. 
		for (int i = 1; i <= number; i++) {
			// An if statement that checks if number divided by i is 0. Print i if true.
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
