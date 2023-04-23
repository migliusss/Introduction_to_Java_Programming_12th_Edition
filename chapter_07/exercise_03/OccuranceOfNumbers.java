package chapt7;

import java.util.Scanner;

/*
 * Write a program that reads the integers between 1 and 50 and counts the occurrences of each. 
 * Assume the input ends with 0. 
 */

public class OccuranceOfNumbers {
	public static void main(String[] args) {
		int[] occurrence = new int[50];

		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter integers between 1 and 50. 
		System.out.print("Enter the integers between 1 and 50: ");
		
		int number = input.nextInt();
		
		// A while loop to increase amount of occurrence of a number. 
		while (number != 0) {
			if (number >= 1 && number <= 50) {
				occurrence[number] ++;
			}
			
			number = input.nextInt();
		}
		
		// Create a for loop to print the amount of occurrence. 
		for (int i = 0; i < occurrence.length; i++) {
			if (occurrence[i] > 0) { // Print only those values that have a value higher than 0. 
				if (occurrence[i] > 1) { // If the occurrence is more than once print plural word "times", else print "time". 
					System.out.println(i + " occurs " + occurrence[i] + " times");
				}
				else {
					System.out.println(i + " occurs " + occurrence[i] + " time");
				}
			}
		}
	}
}
