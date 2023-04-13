package chapt5;

import java.util.Scanner;

/*
 * Write a program that prompt the user to enter the year and first day of the year and 
 * displays the calendar table for the year on the console. 
 */

public class Calendars {
	public static void main(String[] args) {
		String month = "";
		int daysInMonth = 0;
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user.
		System.out.print("Enter a year: ");
		int userYear = input.nextInt();
		
		System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, etc.): ");
		int firstDayOfTheYear = input.nextInt();
		
		// A boolean variable to check if a year is a leap year. 
		boolean isLeapYear = (userYear % 4 == 0 && userYear % 100 != 0) || (userYear % 400 == 0);
		
		// A for loop that prints all the months 1-12. 
		for (int i = 1; i <= 12; i++) {
			// A switch statement to find out the month name and days in a month. 
			switch(i) {
			case(1): month = "January, 1 ";
			daysInMonth = 31;
			break;
			case(2): month = "February, 1 ";
			if (isLeapYear) {
				daysInMonth = 29;
			}
			else {
				daysInMonth = 28;
			}
			break;
			case(3): month = "March, 1 ";
			daysInMonth = 31;
			break;
			case(4): month = "April, 1 ";
			daysInMonth = 30;
			break;
			case(5): month = "May, 1 ";
			daysInMonth = 31;
			break;
			case(6): month = "June, 1 ";
			daysInMonth = 30;
			break;
			case(7): month = "July, 1 ";
			daysInMonth = 31;
			break;
			case(8): month = "August, 1 ";
			daysInMonth = 31;
			break;
			case(9): month = "September, 1 ";
			daysInMonth = 30;
			break;
			case(10): month = "October, 1 ";
			daysInMonth = 31;
			break;
			case(11): month = "November, 1 ";
			daysInMonth = 30;
			break;
			case(12): month = "December, 1 ";
			daysInMonth = 31;
			}
			
			System.out.println("\n       " + month + " " + userYear);
			System.out.println("-----------------------------");
			System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
			
			// Print initial spaces. 
		    	for (int j = 0; j < firstDayOfTheYear; j++) {
		    		System.out.print("    ");
		    	}
			
			// A for loop to print days in the calendar.
            		for (int j = 1; j <= daysInMonth; j++) {
            			if (j < 10) { // Print 3 blank spaces for numbers with one digit. 
            				System.out.print("   " + j);
                		} 
            			else { // Print 2 blank spaces for numbers with two digits. 
                    			System.out.print("  " + j);
                		}
                
            			if ((j + firstDayOfTheYear) % 7 == 0) { // An if statement to move to the next line. 
                     			System.out.println();
                		}
            		}
			
			// Print a new line between month calendars. 
			System.out.println();
			
			// Find out first day in each month. 
			firstDayOfTheYear = (firstDayOfTheYear + daysInMonth) % 7;
			
		}
	}
}
