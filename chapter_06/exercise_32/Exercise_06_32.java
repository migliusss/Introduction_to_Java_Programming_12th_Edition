package chapter_06;

/*
 * Revise Exercise 6.30 to run it 15,000 times 
 * and display the number of winning games. 
 */

public class Exercise_06_32 {
	/** Main method. */
	public static void main(String[] args) {
		int point = 0;
		int timesWon = 0;
		
		for (int i = 1; i <= 15000; i++) {
			int firstDice = firstDice();
			int secondDice = secondDice();
			
			// Display the dice numbers and sum. 
			System.out.println("You rolled " + firstDice + " + " + secondDice + 
					" = " + (firstDice + secondDice));
			
			// Check if its craps or natural. 
			if (isCraps(firstDice, secondDice)) {
				System.out.println("You lose");
			}
			else if (isNatural(firstDice, secondDice)) {
				System.out.println("You win");
				timesWon++;
			}
			// Else establish a point. 
			else {
				// Establish a point. 
				point = establishPoint(firstDice, secondDice);
				
				// Display point.
				System.out.println("Point is " + point);
				
				// Generate new dice numbers. 
				firstDice = firstDice();
				secondDice = secondDice();
				
				// Display the new numbers. 
				System.out.println("You rolled " + firstDice + " + " + secondDice + 
						" = " + (firstDice + secondDice));
				
				// Check if the rolled dice numbers has the sum of a point. 
				if ((firstDice + secondDice) == point) {
					System.out.println("You win");
					timesWon++;
				}
				else {
					System.out.println("You lose");
				}
			}
		}
		// Display times won. 
		System.out.println("Times won: " + timesWon);
	}
	
	/** A method for rolling the first dice. */ 
	public static int firstDice() {
		return (int)(1 + Math.random() * 6);
	}
	
	/** A method for rolling the second dice. */ 
	public static int secondDice() {
		return (int)(1 + Math.random() * 6);
	}
	
	/** A method for checking if the sum is craps. */
	public static boolean isCraps(int firstDice, int secondDice) {
		return firstDice + secondDice == 2 || firstDice + secondDice == 3 || firstDice + secondDice == 12;
	}
	
	/** A method for checking if the sum is natural. */
	public static boolean isNatural(int firstDice, int secondDice) {
		return firstDice + secondDice == 7 || firstDice + secondDice == 11;
	}
	
	/** A method for establishing a point. */
	public static int establishPoint(int firstDice, int secondDice) {
		return firstDice + secondDice;
	}
}

