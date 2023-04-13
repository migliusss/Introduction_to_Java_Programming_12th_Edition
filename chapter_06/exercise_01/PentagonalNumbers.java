package chapt6;

/*
 * A pentagonal number is defined as n(3n-1)/2 for n = 1, 2, ..., and so on. 
 * Therefore, the first few numbers are 1, 5, 12, 22, ....
 * Write a method with the following header that returns a pentagonal number.
 * public static int getPentagonalNumber(int n)
 * 
 * Write a test program that uses this method to display the first 100 pentagonal numbers with 10 numbers on each line.
 * Use the %7d format to display each number. 
 */

public class PentagonalNumbers {
	public static void main(String[] args) {
		// Create and initialize variables. 
		int count = 0; 
		final int NUMBERS_ON_EACH_LINE = 10; 
		int pentagonalNumber = 0;
		
		// A for loop to print first 100 pentagonal numbers. 
		for (int i = 1; i <= 100; i++) {
			pentagonalNumber = getPentagonalNumber(i); // Get the pentagonal number. 
			count++; // Add 1 for each number. When the count is 10, that means a line has 10 numbers.
			
			// Print 10 numbers on each line. 
			if (count % NUMBERS_ON_EACH_LINE == 0) {
				System.out.printf("%7d\n", pentagonalNumber); // Print a new line. 
			}
			else {
				System.out.printf("%7d", pentagonalNumber); // Print on the same line. 
			}
		}

	}
	// Create a method. 
	public static int getPentagonalNumber(int n) {
		// Calculate pentagonal number. 
		int pentagonalNumber = n * (3 * n - 1) / 2;
		
		return pentagonalNumber;
		
	}
}
