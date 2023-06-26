package chapt5;

/*
 * Write nested for loop that prints numbers in a pyramid.  
 */
public class NumbersInAPyramidPattern {
	public static void main(String[] args) {
		int numberOfRows = 8; // Number of rows in a pyramid. 
	    int currentNumber = 1; // Start value for a number to be printed. 
		
		// Outer loop for printing rows.
		for (int i = 0; i < numberOfRows; i++) {
		    // Print spaces for indentation.
		    for (int j = 0; j < (numberOfRows - i - 1) * 2; j++) {
		        System.out.print("   ");
		    }
		    
		    // Inner loop for printing numbers in ascending order.
		    for (int j = 0; j <= i; j++) {
		        System.out.printf("%-6d", currentNumber);
		        currentNumber *= 3; // Multiply by 3 to increase each printed number by number * 3. 
		    }
		   
		    currentNumber /= 3; // Divide by 3 to obtain the number the loop before printed. 
		    
		    // Inner loop for printing number in reverse order.
		    for (int j = 0; j < i; j++) {
		    	currentNumber /= 3; // Divide by 3 again to get the value lower by 3. 
		        System.out.printf("%-6d", currentNumber);
		    }
		    
		    // Move to next line.
		    System.out.println();
		}
	}
}
