package chapt5;

import java.util.Scanner;

/*
 * A byte value is stored in 8 bits.
 * Write a program that prompts the user to enter a byte integer and displays the 8
 * bits for the integer. 
 * 
 * (Hint: You need to use the bitwise right shift operator (>>) and the bitwise AND 
 * operator (&), which are covered in Appendix G, Bitwise Operations.)
 */

public class BitLevelOperations {
	public static void main (String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter an integer.
		System.out.print("Enter an integer: ");
		int number = input.nextByte();
		
		System.out.print("The 8 bits are ");
		
		// Loop for printing a 8 bits.
        for (int i = 7; i >= 0; i--) {
        	
            int bit = (number >> i) & 1;
            
            System.out.print(bit);
        }
	}
}
