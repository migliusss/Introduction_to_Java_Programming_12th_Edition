/*
 * Write a program that displays all the numbers from 100 to 1,000, ten per line, 
 * that are divisible by 3 and 4, but not both.
 * Numbers are separated by exactly one space. 
 */

package chapt5;

public class DivisibleBy3Or4NotBoth {
	public static void main(String[] args) {
		final double NUMBERS_PER_LINE = 10; // Numbers per line. 
		int count = 0; // Variable to keep count for numbers per line.
		
		// Create a for loop to run a program for numbers between 100 and 1000. 
		for (int i = 100; i <= 200; i++) {
			
			// An if statement that checks if the numbers are divisible by 3 and 4, but not both. 
			if (i % 3 == 0 ^ i % 4 == 0) {
				count ++;
				
				// When count reaches 10, the program prints the numbers on a new line. 
				if (count % NUMBERS_PER_LINE == 0) {
					System.out.println(i);
				}
				else {
					System.out.print(i + " ");
				}
			}
		}
	}
}
