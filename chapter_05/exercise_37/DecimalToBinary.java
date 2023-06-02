package chapt5;

import java.util.Scanner;

/*
 * Write a program that prompts the user to enter a decimal 
 * integer then displays its corresponding binary value. Don't use Java's Integer.toBinaryString(int) 
 * in this program. 
 */

public class DecimalToBinary {
	public static void main (String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter a decimal number: ");
		int decimal = input.nextInt();
		
		System.out.print("Binary: ");
		while (decimal != 0) {
			
			int remainder = decimal % 2; // Find the remainder. 
			decimal /= 2; // Keep dividing decimal by 2 until it is 0. 

			// Print the binary number. 
			System.out.print(remainder);
		}
	}
}
