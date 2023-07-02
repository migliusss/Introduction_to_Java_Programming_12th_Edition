package chapter_06;

import java.util.Scanner;

/*
 * (Format an integer) Write a method with the following header to format the 
 * integer with the specified width. 
 * 
 * public static String format(int number, int width) 
 * 
 * The method returns a string for the number with one or more prefix 0s. The size
 * of the string is the width. For example format(34, 4) returns 0034 and 
 * format(34, 5) returns 00034. If the number is longer than the width, the method 
 * return the string representation for the number. For example, format(34, 1)
 * return 34. 
 * 
 * Write a test program that prompts the user to enter a number and its width, and 
 * displays a string returned by invoking format(number, width). 
 */

public class Exercise_06_37 {
	/** Main method. */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		System.out.print("Enter its width: ");
		int width = input.nextInt();
		
		// Display results. 
		System.out.print(format(number, width));
	}
	
	/** Returns a string for the number with one or more prefix 0s. */
	public static String format(int number, int width) {
		String stringNumber = String.valueOf(number);
		String prefixString = "";
		
		if (stringNumber.length() < width) {
			for(int i = 0; i < width; i++) {
				prefixString += 0;
			}
			
			return prefixString + stringNumber;
		}
		else {
			return stringNumber;
		}
	}
}
