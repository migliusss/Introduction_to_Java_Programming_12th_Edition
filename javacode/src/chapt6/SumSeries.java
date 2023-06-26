package chapt6;

/*
 * Write a method to compute the following series:
 * m(i) = 1/3 + 2/4 + ... + i / i + 2
 * 
 * Write a test program that displays a table. 
 */

public class SumSeries {
	public static void main(String[] args) {
		// Call the method. 
		sumSeries(20);
	}
	
	// Create a method that sums a series. 
	public static void sumSeries(int i) {
		// Print header. 
		System.out.println("I\t\tm(i)");
		System.out.println("-----------------------");
		
		double sum = 0; 
		
		// A for loop that sums a series. 
		for (int j = 1; j <= i; j++) {
			sum += 1.0 *  j / (j + 2); 
			// Display table. 
			System.out.printf("%d\t\t%.4f\n", j, sum);
		}
		
	}
}
