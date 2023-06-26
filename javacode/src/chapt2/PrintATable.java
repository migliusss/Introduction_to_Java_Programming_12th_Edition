package chapt2;

/*
 * Write a program that displays a table. Calculate the middle point of two points. 
 */

public class PrintATable {
	// Calculate middle point of two points and display a table. 
	public static void main(String[] args) {
		// Calculate middle point of two points and display a table. 
		// Print header. 
		System.out.println("   a       " + "   b       " + "Middle Point");
		
		// Divide by 2.0 to get a double division. 
		System.out.println("(0, 0)     " + "(2, 1)     " + "(" + ((0 + 2) / 2.0) + ", " + ((0 + 1) / 2.0) + ")"); 
		System.out.println("(1, 4)     " + "(4, 2)     " + "(" + ((1 + 4) / 2.0) + ", " + ((4 + 2) / 2.0) + ")");
		System.out.println("(2, 7)     " + "(6, 3)     " + "(" + ((2 + 6) / 2.0) + ", " + ((7 + 3) / 2.0) + ")");
		System.out.println("(3, 9)     " + "(10, 5)    " + "(" + ((3 + 10) / 2.0) + ", " + ((9 + 5) / 2.0) + ")");
		System.out.println("(4, 11)    " + "(12, 7)    " + "(" + ((4 + 12) / 2.0) + ", " + ((11 + 7) / 2.0) + ")");
	}
}
