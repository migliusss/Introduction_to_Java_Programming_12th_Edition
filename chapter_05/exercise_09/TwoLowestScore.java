/*
 * Write a program that prompts the user to enter the number of students each student's name and scors,
 * and finally display the names of students with the lowest and second-lowest scores. 
 */

package chapt5;

import java.util.Scanner;

public class TwoLowestScore {
	public static void main(String[] args) {
		
		// Declare and initialize variables. 
		String nameLowest = "";
		String nameSecondLowest = "";
		int lowestScore = 0;
		int secondLowestScore = 0;
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the number of students. 
		System.out.print("Enter a number of students: ");
		int numberOfStudents = input.nextInt();
		
		// Create a for loop that runs a program for the number of students.  
		for (int i = 1; i <= numberOfStudents; i++) {
			System.out.print("Enter student's name: ");
			String name = input.next();
			
			System.out.print("Enter sudent's score: ");
			int score = input.nextInt();
			
			// The first score is the lowest score. 
			if (i == 1) {
				lowestScore = score; 
				nameLowest = name;
			}
			
			// If the score is lower than the current lowest score the new score becomes the lowest score. 
			else if (score < lowestScore) {
				secondLowestScore = lowestScore;
				nameSecondLowest = nameLowest;
				
				lowestScore = score;
				nameLowest = name;
			}
		}
		
		// Display results. 
		System.out.println("Student with the lowest score: " + nameLowest);
		System.out.println("Student with the second lowest score: " + nameSecondLowest);
	}
}
