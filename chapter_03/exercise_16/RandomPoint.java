package chapt3;

/*
 * Write a program that displays a random coordinate in a rectangle.
 * The rectangle is centered at (0, 0) with width 50 and height 150. 
 */

public class RandomPoint {
	public static void main(String[] args) {
		// Generate a random number from 50 - 150.
		int coordinate1 = 50 + (int) (Math.random() * 100);
		int coordinate2 = 50 + (int) (Math.random() * 100);
		
		// Display the coordinates. 
		System.out.println("(" + coordinate1 + ", " + coordinate2 + ")");
	}
}
