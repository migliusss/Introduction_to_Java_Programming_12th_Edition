package chapt5;

/*
 * Write a program to compute a summation.
 */

public class Summation {
	public static void main(String[] args) {
		double sum = 0.0;
		
		// Sum numbers using a loop. 
		for(double i = 1.0; i < 1000; i++) {
			sum += 1 / Math.sqrt(i) + Math.sqrt(i + 1);
		}
		
		// Display results. 
		System.out.println("Summation: " + sum);
	}
}
