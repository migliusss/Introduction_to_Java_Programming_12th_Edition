package chapt4;

/*
 * Write a program that prompts the user to enter three 
 * countries and displays them in descending order. 
 */

import java.util.Scanner;

public class CountriesDescendingOrder {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter 3 countries. 
		System.out.print("Enter the first country: ");
		String firstCountry = input.nextLine();
		char firstCountryCh = firstCountry.charAt(0);
		
		System.out.print("Enter the second country: ");
		String secondCountry = input.nextLine();
		char secondCountryCh = secondCountry.charAt(0);
		
		System.out.print("Enter the third country: ");
		String thirdCountry = input.nextLine();
		char thirdCountryCh = thirdCountry.charAt(0);
		
		System.out.print("The three countries in descending order are ");
		
		// If else statements to find the descending order. 
		if (Character.toUpperCase(firstCountryCh) > Character.toUpperCase(secondCountryCh) &&
			Character.toUpperCase(secondCountryCh) > Character.toUpperCase(thirdCountryCh)) {
			System.out.println(firstCountry + " " + secondCountry + " " + thirdCountry);
		}
		else if (Character.toUpperCase(firstCountryCh) > Character.toUpperCase(thirdCountryCh) &&
				Character.toUpperCase(thirdCountryCh) > Character.toUpperCase(secondCountryCh)) {
			System.out.println(firstCountry + " " + thirdCountry + " " + secondCountry);
		}
		else if (Character.toUpperCase(secondCountryCh) > Character.toUpperCase(firstCountryCh) &&
				Character.toUpperCase(firstCountryCh) > Character.toUpperCase(thirdCountryCh)) {
			System.out.println(secondCountry + " " + firstCountry + " " + thirdCountry);
		}
		else if (Character.toUpperCase(secondCountryCh) > Character.toUpperCase(thirdCountryCh) &&
				Character.toUpperCase(thirdCountryCh) > Character.toUpperCase(firstCountryCh)) {
			System.out.println(secondCountry + " " + thirdCountry + " " + firstCountry);
		}
		else if (Character.toUpperCase(thirdCountryCh) > Character.toUpperCase(secondCountryCh) &&
				Character.toUpperCase(secondCountryCh) > Character.toUpperCase(firstCountryCh)) {
			System.out.println(thirdCountry + " " + secondCountry + " " + firstCountry);
		}
		else {
			System.out.println(thirdCountry + " " + secondCountry + " " + firstCountry);
		}
	}
}
