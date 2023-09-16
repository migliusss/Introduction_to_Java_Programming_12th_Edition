package chapter_07;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * (Game: hangman) Write a hangman game that randomly generates a word and        
 * prompts the user to guess one letter at a time, as presented in the sample run.    
 * Each letter in the word is displayed as an asterisk. When the user makes a     
 * correct guess, the actual letter is then displayed. When the user finishes a   
 * word, display the number of misses and ask the user whether to continue to     
 * play with another word.
 * 
 */

public class Exercise_07_35 {
	public static void main(String[] args) {
		String[] words = {"write", "that", "music", "program", "chicken", "lion", "paper", "airplane"};
		int randomNumber = (int)(Math.random() * words.length); // Generate random number. 
		boolean playAgain = true;
		
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// The loop continues until the user enters n. 
		while(playAgain) {
			String wordToGuess = words[randomNumber]; // Choose a random word to guess. 
            int misses = 0; // Variable for counting misses. 
            boolean[] guessedLetters = new boolean[wordToGuess.length()]; 
            boolean wordGuessed = false;
            
            while(!wordGuessed) {
                System.out.print("(Guess) Enter a letter in word ");
                // Display word. 
                displayWord(wordToGuess, guessedLetters);
                
                char guess = input.nextLine().toLowerCase().charAt(0); // User input. 
                boolean isCorrectGuess = false; // Check if the word is correct. 

                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == guess && !guessedLetters[i]) {
                        guessedLetters[i] = true;
                        isCorrectGuess = true;
                    }
                }
                // Check if the letter is in the word. 
                if (!isCorrectGuess) {
                    System.out.println(guess + " is not in the word");
                    misses++;
                }
                
                // Check if the word has been guessed, if true break the loop. 
                if (isWordGuessed(guessedLetters)) {
                    System.out.println("The word is " + wordToGuess + ". You missed " + misses + " times");
                    break;
                }
            }
            
            // Ask the user if user wants to play again.  
            System.out.print("Do you want to guess another word? Enter y or n ");
            if (input.next().charAt(0) == 'y') {
            	playAgain = true;
            }
            else {
            	playAgain = false;
            	System.out.println("Thanks for playing Hangman!");
            }
		}
	}
	
	/** Method for displaying the word and asterisk. **/
	public static void displayWord(String wordToGuess, boolean[] guessedLetters) {
		for (int i = 0; i < wordToGuess.length(); i++) {
            if (guessedLetters[i]) { // If the letter is guessed print the letter, else print asterisk. 
                System.out.print(wordToGuess.charAt(i));
            } 
            else {
            	System.out.print("*");
            }
        }
        System.out.println();
	}
	
	/** Method to check if the word is guessed. **/
	private static boolean isWordGuessed(boolean[] guessedLetters) {
		for (boolean letterGuessed : guessedLetters) {
			if (!letterGuessed) {
				return false;
			}
	    }
		
	    return true;
	}
}
