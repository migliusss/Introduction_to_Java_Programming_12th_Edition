package chapter_07;

/*
 * (Simulation: coupon collector's problem) Coupon collector is a classic statistics
 * problem with many practical applications. The problem is to repeatedly pick
 * objects from a set of objects and find out how many picks are needed for all the 
 * objects to be picked at least once. A variation of the problem is to pick cards from 
 * a shuffled deck of 52 cards repeatedly, and find out how many picks are needed
 * before you see one of each suits. Assume a picked card is placed back in the deck
 * before picking another. Write a program to stimulate the number of picks needed 
 * to get four cards from each suit and display the four cards picked (it is possible a
 * card may be picked twice.) 
 */

public class Exercise_07_24 {
	public static void main(String[] args) {
		// Create a final variable to store the number of cards. 
		final int NUMBER_OF_CARDS = 52;
		// Arrays for storing suits and ranks. 
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", 
				"10", "Jack", "Queen", "King"};
		
		// Array for storing if a suit has been found. 
		boolean[] found = new boolean[4];
		
		int numberOfPicks = 0; 
		
		int count = 0;
		
		while (count < 4) {
			numberOfPicks++;
			
			// Random index which represents the card pick. 
			int index = (int) (Math.random() * NUMBER_OF_CARDS);
			// Has the card been found before. 
			if (!found[index / 13]) {
				found[index / 13] = true;
				count++;
				
				// Pick the cards. 
				String suit = suits[index / 13];
				String rank = ranks[index % 13];
				System.out.println(rank + " of " + suit);
			}
		}
		// Display results.
		System.out.println("Number of picks: " + numberOfPicks);
	}
}
