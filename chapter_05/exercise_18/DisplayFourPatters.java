/*
 * Use nested loops that display the 4 different patterns. 
 */

package chapt5;

public class DisplayFourPatters {
	public static void main(String[] args) {
		
		int num = 6; // Variable for the number of lines in a pattern.  
		
		// A pyramid.
		
		// A looping for printing a new line.  
		for (int i = 1; i <= num; i++) {
			// A loop for printing characters. 
			for (int j = 1; j <= i; j++) {
				System.out.print("* "); 
			}
			System.out.println(); 
		}
		
		System.out.println();
		
		// Upside down pyramid.
		
		// A looping for printing a new line.  
		for (int i = num; i >= 1; i--) { 
			// A loop for printing characters. 
			for (int j = 1; j <= i; j++) {
				System.out.print("* "); 
			}
			System.out.println(); 
		}
		
		System.out.println();
		
		// Mirrored pyramid. 
		
		// A looping for printing a new line.  
		for (int i = 1; i <= num; i++) {
			// A loop for printing spaces first. 
			for (int j = 2 * (num - i); j >= 0; j--) {
				System.out.print(" "); 
			}
			// A loop for printing characters. 
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
            		System.out.println();
		}
		
		System.out.println();
		
		// Upside down and mirrored pyramid. 
		
		// A looping for printing a new line.  
		for (int i = num; i >= 1; i--) {
			// A loop for printing spaces first.
			for (int j = 2 * (num - i); j >= 0; j--) {
				System.out.print(" ");
			}
			// A loop for printing characters. 
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
