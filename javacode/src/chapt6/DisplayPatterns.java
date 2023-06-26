package chapt6;

/*
 * Write a program to display a pattern by using a method. 
 */

public class DisplayPatterns {
	// Main method
	public static void main(String[] args) {
		// Call displayPattern method to print a pattern. 
		displayPattern(6);
	}
	
	// displayPattern method that prints a pattern based on n. 
	public static void displayPattern(int n) {
		int padding = n - 1;
		
		// Outer loop for printing a new line. 
		for (int i = 1; i <= n; i++) {
			// Inner loop for printing blank spaces. 
			for (int j = 0; j < padding; j++) {
				System.out.print("  ");
			}
			// Inner loop for printing numbers. 
			for (int j = i; j > 0; j--) {
				System.out.print(j + " ");
			}
			
			System.out.println(); // Print new line. 
			
			padding--; // Decrement padding. 
		}
	}
}
