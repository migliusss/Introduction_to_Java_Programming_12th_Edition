package chapt6;

/*
 * Craps is a popular dice game played in casinos. Write a program 
 * to play a variation of the game, as follows. 
 * 
 * Roll two dice. Each dice has six faces representing values 1, 2, ..., and 6, respectively. 
 * Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
 * lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
 * (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either 
 * a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise you win. 
 * 
 * Your program acts as a single player. 
 */

public class Craps {
	/** Main method. */
	public static void main(String[] args) {
		int point = 0;
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
			}
			else {
				System.out.println("You lose");
			}
		}
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
