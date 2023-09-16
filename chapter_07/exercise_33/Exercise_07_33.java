package chapter_07;

import java.util.Scanner;

/*
 * (Month name) Write a program that prompts the user to enter an integer between 1 and 
 * 12 and then displays the name of the month that corresponds to the integer entered by 
 * the user. For example, if the user enter three, the program should display March. 
 */

public class Exercise_07_33 {
	public static void main(String[] args ) {
		// Array for storing month names. 
		String[] monthName = {"January", "February", "March", "April", "May", "June", 
				"July", "August", "September", "October", "November", "December"};
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter an integer between 1 and 12: ");
		
		// Display results. 
		System.out.print("The name of the month: " + monthName[input.nextInt() - 1]);
	}
}
