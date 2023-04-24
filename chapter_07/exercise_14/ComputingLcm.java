package chapt7;

import java.util.Scanner;

/*
 * Writ a method that returns the lcm (least common multiple) of 
 * an unspecified numbers of integers. The method header is specified as follows 
 * 
 * public static int lcm(int[] numbers)
 * 
 * Write a test program that prompts the user to enter five numbers, invokes the
 * method to find the lcm of these numbers, and displays the lcm. 
 */

public class ComputingLcm {
	/** Main method. */
	public static void main(String[] args) {
		// Create an array of length 5. 
		int[] numbers = new int[5];
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter five numbers. 
		System.out.print("Enter 4 numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		// Display results. 
		System.out.println("The least common mulitple of the given numbers is: " + lcm(numbers));
	}
	
	/** Method for finding least common multiple for unspecified amount of numbers. */ 
	public static int lcm(int[] numbers) {
		int lcm = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			lcm = lcm(lcm, numbers[i]);
		}
		
		return lcm;
		
	}
	
	/** A method for finding least common multiple for the first two integers. */
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
	
	/** A method for finding greatest common divisor of two integers. */
	public static int gcd(int a, int b) {
		int gcd = 0;
		
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
	}
}
