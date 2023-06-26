/*
 * Find the largest n such that n^2 < 12,000. 
 * Use a while loop. 
 */

package chapt5;

public class FindLargestNumber {
	public static void main(String[] args) {
		
		int number = 0;
		
		while (Math.pow(number + 1, 2) <= 12000) {
			number ++;
		}
		
		// Print results
		System.out.println("The largest integer: " + number);
	}
}
