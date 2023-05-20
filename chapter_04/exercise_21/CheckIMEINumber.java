package chapt4;

/*
 * Write a program that prompts the user to enter the 
 * International Mobile Equipment Identity (IMEI) number in the format 
 * DD-DDDDDD-DDDDDD-D, where D is a digit. Your program should check 
 * whether the input is valid. 
 */

import java.util.Scanner;

public class CheckIMEINumber {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter an IMEI number: ");
		String imeiNumber = input.nextLine();
		
		// Check that the input consists of numbers. 
		if ((imeiNumber.length() == 18) &&
			Character.isDigit(imeiNumber.charAt(0)) && 
			Character.isDigit(imeiNumber.charAt(1)) && 
			(imeiNumber.charAt(2) == '-') &&
			Character.isDigit(imeiNumber.charAt(3)) && 
			Character.isDigit(imeiNumber.charAt(4)) &&
			Character.isDigit(imeiNumber.charAt(5)) &&
			Character.isDigit(imeiNumber.charAt(6)) &&
			Character.isDigit(imeiNumber.charAt(7)) &&
			Character.isDigit(imeiNumber.charAt(8)) &&
			(imeiNumber.charAt(9) == '-') &&
			Character.isDigit(imeiNumber.charAt(10)) && 
			Character.isDigit(imeiNumber.charAt(11)) &&
			Character.isDigit(imeiNumber.charAt(12)) &&
			Character.isDigit(imeiNumber.charAt(13)) &&
			Character.isDigit(imeiNumber.charAt(14)) &&
			Character.isDigit(imeiNumber.charAt(15)) &&
			(imeiNumber.charAt(16) == '-') &&
			Character.isDigit(imeiNumber.charAt(17))) { 
			
			// Print results. 
			System.out.println(imeiNumber + " is a valid IMEI number");
		}
		else {
			System.out.println(imeiNumber + " is not a valid IMEI number");
		}
	}
}
