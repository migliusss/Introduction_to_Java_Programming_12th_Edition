package chapt6;

/*
 * Write a method that prints numbers using the following header:
 * public static void printNumbers(int num1, int num2, int number Per Line)
 * 
 * This method prints the characters between num1 and num2 with specified numbers per line. 
 * Write a test program that prints ten characters per line from 1 to 100. Numbers are separated by exactly one space. 
 */

public class DisplayNumbers {
	public static void main(String[] args) {
		printNumbers(1, 100, 10);
	}
	
	// Create a method for printing numbers. 
	public static void printNumbers(int num1, int num2, int numberPerLine) {
		int count = 0; // Variable for counting the amount of numbers in one line. 
		
		// A for loop to print number from num1 to num2.
		for (int i = num1; i <= num2; i++) {
			count ++; // Increase count by 1 for each number. 
			
			if (count % numberPerLine == 0) { // If true print the number and move to the next line. 
				System.out.println(i + " ");
			}
			else {
				System.out.print(i + " "); // If false print the number in the same line. 
			}
		}
	}
}
