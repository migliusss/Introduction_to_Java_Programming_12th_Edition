package chapt3;

/*
 * Write a program that prompts the user to enter an integer 
 * and displays whether the integer is an odd number or not. 
 */

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		// Find if a number is even or odd. 
		if (number % 2 == 0) {
			System.out.println(number + " is even number");
		}
		else {
			System.out.println(number + " is odd number");
		}
		
	}
}
