package chapter_07;

import java.util.Scanner;

/*
 * (Sort students) Write a program that prompts the user to enter the number of 
 * students, the students' names, and their scores and print student names in decreasing 
 * order of their scores. Assume the name is a string without spaces, use the 
 * Scanner's next() method to read a name. 
 */

public class Exercise_07_17 {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the number of students. 
		System.out.print("Enter the number of students: ");
		// Store the number of students in a variable. 
		int numberOfStudents = input.nextInt();
		
		// Create name array and score array. 
		String [] name = new String[numberOfStudents];
		int[] score = new int[numberOfStudents];
		
		for (int i = 0; i < numberOfStudents; i++) {
			// Prompt the user to enter student's name. 
			System.out.print("Enter student's name: ");
			
			// Add student's name to the list. 
			name[i] = input.next();
			
			// Prompt the user to enter student's score. 
			System.out.print("Enter student's score: ");
			
			// Add student's score to the name. 
			score[i] = input.nextInt();
		}
		
		// Sort the names and scores in decreasing order. 
		for (int i = 0; i < numberOfStudents - 1; i++) {
			for (int j = i + 1; j < numberOfStudents; j++) {
				if (score[i] < score[j]) {
					// Swap scores. 
					int tempScore = score[i];
					score[i] = score[j];
					score[j] = tempScore;
					
					// Swap names. 
					String tempName = name[i];
					name[i] = name[j];
					name[j] = tempName;
					
				}
			}
		}
		
		// Display results. 
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Name: " + name[i]);
			System.out.println("Score: " + score[i] + "\n");
		}
		
	}
}
