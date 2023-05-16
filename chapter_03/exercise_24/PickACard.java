package chapt3;

/*
 * Write a program that stimulates picking a card from a deck 
 * of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
 * Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card. 
 */

public class PickACard {
	public static void main(String[] args) {
		int rank = 1 + (int) (Math.random() * 13); // Generate a random number that picks a rank. 
		int suit = 1 + (int) (Math.random() * 4); // Generate a random number that picks a suit. 
		
		System.out.print("The card you picked is ");
		
		// A switch statement that picks a card based on the number. 
		switch(rank) {
		case(1): System.out.print("Ace"); break;
		case(2): System.out.print("Two"); break;
		case(3): System.out.print("Three"); break;
		case(4): System.out.print("Four"); break;
		case(5): System.out.print("Five"); break;
		case(6): System.out.print("Six"); break;
		case(7): System.out.print("Seven"); break;
		case(8): System.out.print("Eight"); break;
		case(9): System.out.print("Nine"); break;
		case(10): System.out.print("Ten"); break;
		case(11): System.out.print("Jack"); break;
		case(12): System.out.print("Queen"); break;
		case(13): System.out.print("King"); 
		}
		
		System.out.print(" of ");
		
		// A switch statement that picks a suit based on the number. 
		switch(suit) {
			case(1): System.out.print("Clubs"); break;
			case(2): System.out.print("Diamonds"); break;
			case(3): System.out.print("Hearts"); break;
			case(4): System.out.print("Spades");
		}
	}
}
