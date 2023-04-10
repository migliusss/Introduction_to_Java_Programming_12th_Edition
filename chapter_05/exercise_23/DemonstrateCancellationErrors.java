package chapt5;

/*
 * Write a program that compares the result of the summation of the preceding series, 
 * computing from left to right and from right to left with n = 50000.
 */

public class DemonstrateCancellationErrors {
	public static void main(String[] args) {
		// Declare and initialize variables. 
		int n = 50000;
		double sumLeftToRight = 0;
		double sumRightToLeft = 0;
		
		// A for loop for computing from left to right. 
		for (double i = 1; i <= n; i++) {
			sumLeftToRight += 1.0 / i;
		}
		// Display results. 
		System.out.println("Calculating from left to right: " + sumLeftToRight);
		
		// A for loop for computing from right to left. 
		for (double i = n; i >= 1; i--) {
			sumRightToLeft += 1.0 / i;
		}
		// Display results. 
		System.out.println("Calculating from right to left: " + sumRightToLeft);

		// Display difference. 
		System.out.println("The difference is: " + (sumRightToLeft - sumLeftToRight));
	}
}
