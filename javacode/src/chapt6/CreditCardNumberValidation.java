package chapt6;

import java.util.Scanner;

/*
 * Credit card numbers follow certain 
 * patterns. A credit card number must have between 13 and 16 digits. It must start 
 * with 
 * 4 for Visa cards. 
 * 5 for Master cards. 
 * 37 for American Express cards
 * 6 for Discover cards
 * 
 * In 1954, Hans Luhn of IBM propose an algorithm for validating credit card
 * numbers. The algorithm is useful to determine whether a card number is entered
 * correctly, or whether a credit card is scanned correctly by a scanner. Credit card
 * numbers are generated following this validity check, commonly known as the 
 * Luhn check or the Mod 10 check, which can be described as follows (for illustration,
 * consider the card number 4388576018402626:
 * 
 * 1. Double every second digit from right to left. If doubling of a digit results in a 
 * 	two-digit number, add up the two digits to get a single-digit number. 
 * 
 * 2. Now add all single-digit numbers from Step 1. 
 * 	4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
 * 
 * 3. Add all digits in the odd places from right to left in the card number. 
 * 	6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
 * 
 * 4. Sum the results from Step 2 and Step 3. 
 * 	37 + 38 = 75
 * 
 * 5. If the results from Step 4 is divisible by 10, the card number is valid; otherwise, 
 * 	it is invalid. For example, the number 4388576018402626 is invalid,
 * 	but the number 4388576018410707 is valid. 
 * 
 * Write a test program that prompts the user to enter a credit card number as long 
 * integer. Display whether the number is valid or invalid. Design your program to 
 * use the following methods: 
 * 
 * Return true if the card number is valid. 
 * public static boolean isValid(long number) 
 * 
 * Get the result from Step 2. 
 * public static int sumOfDoubleEvenPlace(long number)
 * 
 * Return this number if it is a single digit, otherwise,
 * return the sum of the two digits. 
 * public static int getDigit(int number) 
 * 
 * Return sum of odd-place digits in number. 
 * public static int sumOfOddPlace(long number) 
 * 
 * Return true if the number d is a prefix for number.
 * public static boolean prefixMatched(long number, int d)
 * 
 * Return the number of digits in d.
 * public static int getSize(long d)
 * 
 * Return the first k number of digits from number. If the 
 * number of digits in number is less than k, return number. 
 * public static long getPrefix(long number, int k) 
 */

public class CreditCardNumberValidation {
	/** Main method. */
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a credit card number as a long integer: ");
		long number = input.nextLong();
		
		// Display results. 
		if (prefixMatched(number, 4) || prefixMatched(number, 5)
			|| prefixMatched(number, 37) || prefixMatched(number, 6)) {
			
			if (getSize(number) >= 13 && getSize(number) <= 16) {
				
				if (isValid(number)) {
					System.out.println(number + " is valid");
				}
				else {
					System.out.println(number + " is not valid");
				}
			}
		}
	}
	
	/** Return true if the card number is valid. */ 
	public static boolean isValid(long number) {
		int result = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		
		if (result % 10 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/** Get the result from Step 2. */
	public static int sumOfDoubleEvenPlace(long number) {
		String strNumber = Long.toString(number);
		
		int sum = 0;
		int digit = 0;
		
		for (int i = 0; i < strNumber.length(); i += 2) {
			digit = Character.getNumericValue(strNumber.charAt(i));
			
			if (digit * 2 >= 10) {
				sum += getDigit(digit * 2);
			}
			else {
				sum += digit * 2;
			}
		}
		
		return sum;
	}
	
	/** Return this number if it is a single digit, otherwise,
	 * return the sum of the two digits. */
	public static int getDigit(int number) {
		if (number >= 10) {
			return (number / 10) + (number % 10);
		}
		else return number;
	}
	
	/** Return sum of odd-place digits in number. */
	public static int sumOfOddPlace(long number) {
		String strNumber = Long.toString(number);
		
		int sum = 0;
		int digit = 0;
		
		for (int i = 1; i < strNumber.length(); i+=2) {
			digit = Character.getNumericValue(strNumber.charAt(i));
			
			sum += digit;
		}
		
		return sum;
	}
	
	/** Return true if the number d is a prefix for number. */
	public static boolean prefixMatched(long number, int d) {
		String strNumber = Long.toString(number);
		
		if (strNumber.startsWith(String.valueOf(d))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/** Return the number of digits in d. */
	public static int getSize(long d) {
		String strNumber = Long.toString(d);
		
		return strNumber.length();
	}
	
	/** Return the first k number of digits from number. If the 
	 * number of digits in number is less than k, return number. */
	public static long getPrefix(long number, int k) {
		
	}
}
