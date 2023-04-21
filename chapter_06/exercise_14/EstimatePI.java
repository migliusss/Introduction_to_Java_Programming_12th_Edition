package chapt6;

/*
 * PI can be computed using the following summation: 
 * PI = 4( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + ( (-1)^(i+1) )/ (2i - 1) )
 * 
 * Write a method that returns m(i) for a given i and write a test program that displays a table.
 */

public class EstimatePI {
	public static void main(String[] args) {
		// Print header. 
		System.out.println("i\t\tm(i)");
		
		// A for loop for printing a table. 
		for (int i = 1; i <= 901; i += 100) {
			System.out.println(i + "\t\t" + m(i)); // Print i and call a method for calculating PI. 
		}
	}
	
	public static double m(int i) {
		double PI = 0;
		
		// A for loop to compute PI using a summation formula. 
		for (int j = i; j > 0; j--) {
			PI += Math.pow(-1, j + 1) / (2 * j -1); // Calculate PI. 
			
			if (j == 1) { // An if statement to multiply the last number by 4. 
				PI *= 4;
			}
		}
		
		return PI;
	}
}
