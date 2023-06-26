package chapt7;

import java.util.Scanner;

/*
 * Write a program that reads students scores, gets the best score, and then assigns grades. 
 * 
 * The program prompts the user to enter the total number of students, and then prompts the user to enter
 * all of the scores, and concludes by displaying the grades. 
 */

public class AssignGrades {
	public static void main(String[] args) {
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the number of students. 
		System.out.print("Enter the number of students: ");
		int[] scores = new int[input.nextInt()]; // Create an array variable. 
		char[] grades = new char[scores.length]; // Create an array for storing the grades for the scores. 
		
		// Prompt the user to enter the scores. 
		System.out.print("Enter " + scores.length + " scores: "); 
		// Assign values to the score array. 
		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
		}
		
		// Get the grade letter based on the score. 
		getGrade(scores, grades);
		
		// Display results. 
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);
		}
	}
	
	// Create a method for getting a grade based on the best score. 
	public static void getGrade(int[] scores, char[] grades) {
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= best(scores) - 5) {
				grades[i] = 'A';
			}
			else if (scores[i] >= best(scores) - 10) {
				grades[i] = 'B';
				
			}
			else if (scores[i] >= best(scores) - 15) {
				grades[i] = 'C';
			}
			else if (scores[i] >= best(scores) - 20) {
				grades[i] = 'D';
			}
			else {
				grades[i] = 'F';
			}
		}
	}
	// Create a method for finding the best grade. 
	public static int best(int[] scores) {
		int best = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > best) { // If statement for checking if the number is greater than the best, if true assign new value. 
				best = scores[i]; 
			}
		}
		// Return the best grade. 
		return best;
	}
}
