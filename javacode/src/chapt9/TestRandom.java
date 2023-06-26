package chapt9;

import java.util.Random;

/*
 * Write a program that creates a Random object with seed
 * 1000 and displays the first 50 random integers between 0 and 100 using the 
 * nextInt(100) method. 
 */

public class TestRandom {
	public static void main(String[] args) {
		// Create a Random object.
		Random random = new Random(1000);
		
		// A for loop to print 50 random numbers. 
		for (int i = 0; i < 50; i++) {
			System.out.println(random.nextInt(100));
		}
	}
}
