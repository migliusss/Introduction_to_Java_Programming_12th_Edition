package chapt4;

/*
 * Write a program that prompts the user to enter the year and the 
 * first three letters of a month name (with the first letter in uppercase) and displays 
 * the number of days in a month. If the input for month is incorrect, display a 
 * message as presented in the following sample runs. 
 */

import java.util.Scanner;

public class DaysOfAMonth {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a year: ");
		String yearString = input.nextLine();
		int year = Integer.parseInt(yearString);
		
		System.out.print("Enter a month: ");
		String month = input.nextLine();
		
		// A boolean to check if year is a leap year. 
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		// if else statements to print results. 
		if (month.equals("Jan")) {
			System.out.println(month + " " + year + " has 31 days");
		}
		else if (month.equals("Feb")) {
			if (isLeapYear) {
				System.out.println(month + " " + year + " has 29 days");
			}
			else {
				System.out.println(month + " " + year + " has 28 days");
			}
		}
		else if (month.equals("Mar")) {
			System.out.println(month + " " + year + " has 31 days");
		}
		else if (month.equals("Apr")) {
			System.out.println(month + " " + year + " has 30 days");
		}
		else if (month.equals("May")) {
			System.out.println(month + " " + year + " has 31 days");
		}
		else if (month.equals("Jun")) {
			System.out.println(month + " " + year + " has 30 days");
		}
		else if (month.equals("Jul")) {
			System.out.println(month + " " + year + " has 31 days");
		}
		else if (month.equals("Aug")) {
			System.out.println(month + " " + year + " has 31 days");
		}
		else if (month.equals("Sep")) {
			System.out.println(month + " " + year + " has 30 days");
		}
		else if (month.equals("Oct")) {
			System.out.println(month + " " + year + " has 31 days");
		}
		else if (month.equals("Nov")) {
			System.out.println(month + " " + year + " has 30 days");
		}
		else if (month.equals("Des")) {
			System.out.println(month + " " + year + " has 31 days");
		}
		else {
			System.out.println(month + " is not a correct month name");
		}
		
	}
}
