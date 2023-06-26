/*
 * Listing 5.4 SubtractionQuizLoop.java, generates five random subtraction questions. 
 * Revise the program to generate ten random multiplication questions 
 * for two integers between 1 and 12. Display the correct count and test time. 
 */

package chapt5;

import java.util.Scanner;

public class RepeatMultiplication {
	public static void main(String[] args) {
		final int NUMBER_OF_COUNTS = 10; // Number of questions.  
		int correctCount = 0; // Count the number of correct answers. 
		int count = 0; // Count the number of questions. 
		long startTime = System.currentTimeMillis();
		String output = " "; // An empty string. 
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		while (count < NUMBER_OF_COUNTS) {
			// Generate two random digit integers from 1 - 12. 
			int number1 = 1 + (int)(Math.random() * 13);
			int number2 = 1 + (int)(Math.random() * 13);
			
			// Prompt the user to answer the subtraction question. 
			System.out.print("What is " + number1 + " * " + number2 + "? ");
			int answer = input.nextInt();
			
			// Grade the answer and display the results. 
			if (number1 * number2 == answer) {
				System.out.println("You are correct!");
				correctCount++;
			}
			else {
				System.out.println("Your answer is wrong. \n" + number1 + " * " + number2 + " should be " 
						+ (number1 * number2));
			}
			
			// Increase the question count. 
			count++;
			
			output += "\n" + number1 + "*" + number2 + "=" + answer + ((number1 * number2 == answer) ? 
					" correct": " wrong");
		}
		
		// Compute the test time. 
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		// Display results.
		System.out.println("Correct count is " + correctCount + "\nTest time is " 
				+ testTime / 1000 + " seconds\n" + output);
	}
}
