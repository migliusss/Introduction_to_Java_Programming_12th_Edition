package chapt6;

/*
 * A palindromic prime is a prime number and also palindromic. 
 * For example, 131 is a prime and also a palindromic prime, as are 313 
 * and 757. Write a program that displays the first 120 palindromic prime numbers. 
 * Display 10 numbers per line, separated by exactly one space. 
 */

public class PalindromicPrime {
	/** Main method. */
	public static void main(String[] args) {
		int count = 0; 
		
		for (int i = 2; count <= 120; i++) {
			if (isPalindrome(i) && isPrime(i)) {
				
				System.out.print(i + " ");
				count++; // Count the number of numbers per line. 
				
				// New line after 10 numbers. 
				if (count % 10 == 0) {
					System.out.println(i);
				}
			}
		}
	}
	
	/** A method for finding if a number is a palindromic prime. */
	public static boolean isPalindrome(int number) {
        String strNumber = Integer.toString(number);
        
        for (int i = 0; i < strNumber.length() / 2; i++) {
            if (strNumber.charAt(i) != strNumber.charAt(strNumber.length() - 1 - i)) {
                return false; // Characters at symmetric positions don't match, hence not a palindrome. 
            }
        }
        
        return true; // All characters match, so palindrome.
	}
	
	/** A method for checking if a number is a prime. */
	public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime.
        }
        
		for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a factor, hence not prime. 
            }
        }
		
        return true; // No factors found, so prime.
	}
}
