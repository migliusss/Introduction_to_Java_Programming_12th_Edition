package chapter_06;

/*
 * (Generate random characters) Use the method in RandomCharacter in 
 * Listing 6.10 to print 200 uppercase letters and then 200 single digits, printing ten
 * per line.
 */

public class Exercise_06_38 {
	/** Main method. */
	public static void main(String[] args) {
		final int NUMBER_OF_CHARS = 200;
		final int CHARS_PER_LINE = 10;
		
		// Print random uppercase letters. 
		for (int i = 0; i < NUMBER_OF_CHARS; i++) {
			char ch = getRandomUpperCaseLetter();
			if ((i + 1) % CHARS_PER_LINE == 0) {
				System.out.println(ch);
			}
			else {
				System.out.print(ch);
			}
		}
		
		// Print random digits. 
		for (int i = 0; i < NUMBER_OF_CHARS; i++) {
			char ch = getRandomDigitCharacter();
			if ((i + 1) % CHARS_PER_LINE == 0) {
				System.out.println(ch);
			}
			else {
				System.out.print(ch);
			}
		}
	}
	
	/** Get random uppercase letters. */
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}
	
	/** Get random digit letters. */
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}
	
	/** Generate a random character between ch1 and ch2. */
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
}
