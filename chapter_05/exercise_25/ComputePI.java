package chapt5;

/*
 * Write a program that displays the PI value for i = 10000, 20000, ..., and 100000.
 * PI = 4( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + ( (-1)^(i+1) )/ (2i - 1) )
 */

public class ComputePI {
	public static void main(String[] args) {
		double PI = 0;
		
		// A nested for loop to increase i value. 
		for (int i = 10000; i <= 100000; i += 10000) {
			for (int j = i; j > 0; j--) {
				PI += Math.pow(-1, j + 1) / (2 * j -1); // Calculate PI. 
				
				if (j == 1) { // An if statement to multiply the last number by 4. 
					PI *= 4;
				}
			}
			// Display results. 
			System.out.println(PI);
		}
	}
}
