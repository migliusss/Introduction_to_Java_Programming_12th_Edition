package chapt6;

/*
 * Write a method hat computes the commission, using the scheme in Programming Exercise 5.39. 
 * The header of the method is as follows: 
 * public static double computeCommission(double salesAmount)
 * 
 * Write a test program that displays a table of Sales Amount and Commission. 
 */

public class ComputeComissions {
	public static void main(String[] args) {
		// Print header. 
		System.out.println("Sales Amount\tCommision");
		// A for loop that calls the method and displays results. 
		for (int i = 10000; i <= 100000; i += 5000) { // i = salesAmount. 
			System.out.println(i + "\t\t" + computeCommission(i));
		}
	}
	
	// A method that calculates and returns commission. 
	public static double computeCommission(double salesAmount) {
		// Commission is 10%. 10% / 100 = 0,10.
		return salesAmount * 0.10;
	}
}
