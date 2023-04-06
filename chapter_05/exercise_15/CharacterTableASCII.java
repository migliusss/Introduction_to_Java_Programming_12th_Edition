/*
 * Write a program that prints the characters in the ASCII character table from ! to ~.
 * Display 10 characters per line. 
 */

package chapt5;

public class CharacterTableASCII {
	public static void main(String[] args) {
		
		final int NUMBER_OF_CHARACTERS = 10; // 10 characters per line
		int count = 0; // Variable for counting the number of characters per line. 
		
		// Create a loop to print characters. 
		for (int i = 33; i <= 126; i++) {
			count++;
			
			// Statements that checks if the number of characters is 10. If true print a character on a new line. 
			if (count % NUMBER_OF_CHARACTERS == 0) {
				System.out.println((char)i); 
			}
			else 
				System.out.print((char)i + " ");
		}
	}
}
