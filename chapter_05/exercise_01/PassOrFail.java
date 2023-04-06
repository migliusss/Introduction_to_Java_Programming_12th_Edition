/** 
 * Write a program that prompts a student to enter a Java score. 
 * If the score is greater or equal to 60, display "you pass the exam"; 
 * otherwise, display "you don't pass the exam". 
 * Your program ends with input -1. 
 */

package chapt5;

import java.util.Scanner;

public class PassOrFail {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the score. 
		System.out.print("Enter your score: ");
		int score = input.nextInt();
		
		// Create a while loop to run the program until the user enters -1.
		while (score != -1) {
			
			// Check the score. 
			if (score >= 60) {
				System.out.println("You pass the exam.");
			}
			else {
				System.out.println("You don't pass the exam.");
			}
			
			score = input.nextInt();
		}
	}
}
