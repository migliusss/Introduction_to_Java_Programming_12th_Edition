package chapt6;

/*
 * A prime number is called a Mersenne prime if it can be written 
 * in the form 2^p - 1 for some positive integer p. Write a program that finds all 
 * Mersenne primes with p <= 31 and displays the output. 
 */

public class MersennePrime {
	/** Main method. */
	public static void main(String[] args) {
		// Display the heading. 
		System.out.println("p\t2^p - 1");
		System.out.println("-------------------");
		
		// A loop that checks each number from 2 to 31. 
        for (int p = 2; p <= 31; p++) {
            int mersennePrime = (int) Math.pow(2, p) - 1;
            
            // Check if the number is prime. 
            if (isPrime(mersennePrime)) {
                System.out.println(p + "\t" + mersennePrime);
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
