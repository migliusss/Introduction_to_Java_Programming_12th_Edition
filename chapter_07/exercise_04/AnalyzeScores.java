package chapt7;

import java.util.Scanner;

/*
 * Write a program that reads an unspecified number of scores and determines
 * how many scores are above or equal to the average, and how many scores are below the average. 
 * Enter a negative number to signify the end of the input.
 * Assume the maximum number of scores is 100. 
 */

public class AnalyzeScores {
	public static void main(String[] args) {
		// Declare and initialize variables. 
		int[] scores = new int[100];
		int sum = 0;
		int count = 0;
		double average;
		int equalOrAboveAverage = 0;
		int belowAverage = 0;
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter scores. 
		System.out.print("Enter scores (Negative number to stop): ");
		
		// Create a while loop to get the scores until the user enter a negative number. 
		while (count < 100) {
			int score = input.nextInt();
			
			if (score < 0) { // Exit loop if the user entered a negative number. 
				break;
			}
			
			scores[count] = score; // Add value to the array. 
			sum += score; // Add the score entered to calculate sum. 
			count++; // Count the amount of scores. 
		}
		
		// Calculate average score. 
		average = (double) sum / count;
		
		// A for loop to find the amount of scores that are, above or equal or below the average. 
		for (int i = 0; i < count; i++) {
			if (scores[i] >= average) {
				equalOrAboveAverage++;
			}
			else if (scores[i] < average) {
				belowAverage++;
			}
		}
		
		// Display results. 
		System.out.println("The amount of scores that are above or equal to the average: " + equalOrAboveAverage);
		System.out.println("The amount of scores that are below the average: " + belowAverage);
	}
}
