/*
 * Write a program that prompts the user to enter the number of students and each student's name and score,
 * and finally displays the name of the student with the highest score. 
 * Assume that the number of students is at least 1. 
 */

package chapt5;

import java.util.Scanner;

public class HighestScore {
	public static void main(String[] args) {
		
		// Create variables. 
		int highestScore = 0;
		String highestScoreName = "";
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a number of students. 
		System.out.print("Enter a number of students: ");
		int numberOfStudents = input.nextInt();
		
		// Create a for loop that runs a program for the number of students.  
		for (int i = 1; i <= numberOfStudents; i++) {
			
			System.out.print("Enter student's name: ");
			String name = input.next();
			
			System.out.print("Enter sudent's score: ");
			int score = input.nextInt();
			
			// An if statement to check if the score is higher than the current score. If true update variable. 
			if (score > highestScore) {
				highestScore = score;
				highestScoreName = name;
			}

		}
		
		// Display results. 
		System.out.println("Student with the highest score is: " + highestScoreName 
				+ "\nScore: " + highestScore);
	}
}
