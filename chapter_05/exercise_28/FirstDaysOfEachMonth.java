package chapt5;

import java.util.Scanner;

/*
 * Write a program that prompts the user to enter the year and first day of the year, 
 * then displays the first day of each month in the year. 
 */

public class FirstDaysOfEachMonth {
	public static void main(String[] args) {
		String month = "";
		// Create a Scanner.
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a year: ");
		int userYear = input.nextInt();
		
		System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, etc.): ");
		int firstDayOfTheYear = input.nextInt();
		
		// A boolean variable to check if a year is a leap year. 
		boolean isLeapYear = (userYear % 4 == 0 && userYear % 100 != 0) || (userYear % 400 == 0);
		
		// A for loop for printing first day of each month in the year. 
		for (int i = 1; i <= 12; i++) {
			
			// A switch statement to find out the month name. 
			switch(i) {
			case(1): month = "January, 1 ";
			break;
			case(2): month = "February, 1 ";
			break;
			case(3): month = "March, 1 ";
			break;
			case(4): month = "April, 1 ";
			break;
			case(5): month = "May, 1 ";
			break;
			case(6): month = "June, 1 ";
			break;
			case(7): month = "July, 1 ";
			break;
			case(8): month = "August, 1 ";
			break;
			case(9): month = "September, 1 ";
			break;
			case(10): month = "October, 1 ";
			break;
			case(11): month = "November, 1 ";
			break;
			case(12): month = "December, 1 ";
			}
			
			// Switch statement for printing the right weekday based on the if statement. 
			switch(firstDayOfTheYear) {
			case(0): System.out.println(month + userYear + " is Sunday");
			break;
			case(1): System.out.println(month + userYear + " is Monday");
			break;
			case(2): System.out.println(month + userYear + " is Tuesday");
			break;
			case(3): System.out.println(month + userYear + " is Wednesday");
			break;
			case(4): System.out.println(month + userYear + " is Thursday");
			break;
			case(5): System.out.println(month + userYear + " is Friday");
			break;
			case(6): System.out.println(month + userYear + " is Saturday");
			break;
			}
			
			// If statement to check how many days there are in a month. 
			if (i == 4 || i == 6 || i == 9 || i == 11) {
				firstDayOfTheYear = (firstDayOfTheYear + 30) % 7;
			}
			else if (i == 2) {
				if (isLeapYear) {
					firstDayOfTheYear = (firstDayOfTheYear + 29) % 7;
				}
				else {
					firstDayOfTheYear = (firstDayOfTheYear + 28) % 7;
				}
			}
			else {
				firstDayOfTheYear = (firstDayOfTheYear + 31) % 7;
			}
			
		}

	}
}
