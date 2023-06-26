package chapt6;

/*
 * An emirp (prime spelled backwards) is a nonpalindromic prime number
 * whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 
 * 17 and 71 are emirps. Write a program that displays the first 120 emirps. Display 
 * 10 numbers per line, separated  by exactly one space. 
 */

public class Emirp {
	/** Main method. */
	public static void main(String[] args) {
		int count = 0; 
		
		for (int i = 2; count <= 120; i++) {
			if (isPrime(i)) {
				
				int reversed = reverseNumber(i);
				
				if (reversed != i && isPrime(reversed)) {
					System.out.print(i + " ");
					
					count++; // Count the number of numbers per line. 
					
					// New line after 10 numbers. 
					if (count % 10 == 0) {
						System.out.println(i);
					}
				}
			}
		}
	}
	
	/** A method for checking if a number is a prime. */
	public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime.
        }
        
		for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false; // Found a factor, hence not prime. 
            }
        }
		
        return true; // No factors found, so prime.
	}
	
    /** A method for reversing the digits of a number. */
    public static int reverseNumber(int number) {
        int reversed = 0;
        
        while (number != 0) {
            int digit = number % 10;
            
            reversed = reversed * 10 + digit;
            
            number /= 10;
        }
        
        return reversed;
    }
}
