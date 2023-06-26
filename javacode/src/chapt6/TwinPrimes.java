package chapt6;

/*
 * Twin primes are a pair of prime numbers that differ by 2. For 
 * example, 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 an 13 are 
 * twin primes. Write a program to find all twin primes less than 1,200. Display the 
 * output. 
 */

public class TwinPrimes {
	/** Main method. */
	public static void main(String[] args) {
		// A loop iterates through numbers and checks if the numbers are prime.  
        for (int i = 1; i <= 1200; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
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
