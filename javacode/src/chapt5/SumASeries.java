package chapt5;

/*
 * Write a program to compute a summation showed in the book. 		
 * 1/3 + 3/5 + 5/7 + 9/11...
 */

public class SumASeries {
	public static void main(String[] args) {
		double sum = 0;
		
		// Create a for loop to calculate a sum of a number series. The numbers are increased by 2.
		for (int i = 1 ; i <= 97; i += 2) {
			sum += 1.0 * i / (i + 2); // Multiply by 1.0 to cast to double due to division. 
		}
		
		// Display results. 
		System.out.println("Sum is: " + sum);
	}
}
