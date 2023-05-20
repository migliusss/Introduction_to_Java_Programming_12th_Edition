package chapt4;

/*
 * Write a program that prompts the user to enter 
 * a letter grade A, B, C, D, or F and displays its corresponding numeric value: 4, 3, 
 * 2, 1, or 0. For other input display invalid grade. 
 */

import java.util.Scanner;

public class ConvertLetterToGrade {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a letter grade: ");
		char letterGrade = input.nextLine().charAt(0);
		
		// Convert letter to uppercase and display numeric value. 
		switch(Character.toUpperCase(letterGrade)) {
			case 'A' : System.out.println("The numeric value for grade A is 4"); break;
			case 'B' : System.out.println("The numeric value for grade B is 3"); break;
			case 'C' : System.out.println("The numeric value for grade C is 2"); break;
			case 'D' : System.out.println("The numeric value for grade D is 1"); break;
			case 'E' : System.out.println("The numeric value for grade F is 0"); break;
			default: System.out.println(letterGrade + " is invalid grade");
		}
	}
}
