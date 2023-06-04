package chapt5;

import java.util.Scanner;

/*
 * In business applications, you 
 * are often asked to compute the mean and standard deviation of data. The mean is 
 * simply the average of numbers. The standard deviation is a statistic that tells
 * you how tightly all the various data are clustered around the mean in a set of data.
 * For example, what is the average age of the students in a class? How close are the 
 * ages? If all the students are the same age, the deviation is 0. 
 * 
 * Write a program that prompts the user to enter 10 numbers and displays the 
 * mean and standard deviation of these numbers using the formula. 
 */

public class MeanAndStandardDeviation {
	public static void main(String[] args) {
		double number = 0;
		double mean = 0;
		double standardDeviation = 0;
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter 10 numbers: ");

		for (int i = 1; i <= 10; i++) {
			number = input.nextDouble();
			mean += number; // Add the numbers to find the sum of all numbers. 
			standardDeviation += Math.pow(number, 2); // Square root of each number. 
		}
		
		// Calculate the standard deviation. 
		standardDeviation = Math.sqrt((standardDeviation - (Math.pow(mean, 2) / 10)) / (10 - 1));
		
		// Calculate the mean. 
		mean /= 10;
		
		// Display results. 
		System.out.println("The mean is " + mean);
		System.out.println("The standard deviation is " + standardDeviation);

	}
}
