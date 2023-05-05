package chapt3;

/*
 * Write a program that prompts the user 
 * to enter the month and year and displays the number of days in the month. For 
 * example, if the user entered month 2 and year 2012, the program should display 
 * that February 2012 has 29 days. If the user entered month 3 and year 2015, the
 * program should display that March 2015 gas 31 days. 
 */

import java.util.Scanner;

public class NumberOfDaysInAMonth {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the month number and year: ");
		int month = input.nextInt();
		int year = input.nextInt();
		
		// Calculate if a year is a leap year. 
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		// If else statements for printing days in a month. 
		if (month == 1) {
			System.out.println("January " + year + " has 31 days");
		}
		else if (month == 2) {
			if (isLeapYear) {
				System.out.println("February " + year + " has 29 days");
			}
			else {
				System.out.println("February " + year + " has 28 days");
			}
		}
		else if (month == 3) {
			System.out.println("March " + year + " has 31 days");
		}
		else if (month == 4) {
			System.out.println("April " + year + " has 30 days");
		}
		else if (month == 5) {
			System.out.println("May " + year + " has 31 days");
		}
		else if (month == 6) {
			System.out.println("June " + year + " has 30 days");
		}
		else if (month == 7) {
			System.out.println("July " + year + " has 31 days");
		}
		else if (month == 8) {
			System.out.println("August " + year + " has 31 days");
		}
		else if (month == 9) {
			System.out.println("September " + year + " has 30 days");
		}
		else if (month == 10) {
			System.out.println("October " + year + " has 31 days");
		}
		else if (month == 11) {
			System.out.println("November " + year + " has 30 days");
		}
		else if (month == 12) {
			System.out.println("December " + year + " has 31 days");
		}	
		else {
			System.out.println("Error");
		}
	}
}
