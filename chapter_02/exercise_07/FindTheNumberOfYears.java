package chapt2;

/*
 * Write a program that prompts the user to enter the minutes 
 * and displays the maximum number of years and remaining days for the minutes.
 * A year has 365 days. 
 */

import java.util.Scanner; 

public class FindTheNumberOfYears {
	public static void main(String[] args) {
		// Create a Scanner.
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the minutes.
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
		
		// Calculate hours.
		int hours = minutes / 60; 
		
		// Calculate days.
		int days = hours / 24; 
		
		// Calculate years.
		int years = days / 365; 
		
		// Calculate remaining days.
		int daysLeft = days % 365;
		
		// Display results.
		System.out.println(minutes + " minutes is approximately " + years + " years and "
				+ daysLeft + " days.");

	}
}
