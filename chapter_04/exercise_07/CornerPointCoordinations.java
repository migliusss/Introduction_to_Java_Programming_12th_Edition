package chapt4;

/*
 * Suppose a pentagon is centered at (0, 0) with one point 
 * at the 0 o'clock position, as shown in Figure 4.4c. Write a program that prompts 
 * the user to enter the radius of the bounding circle of a pentagon and displays the
 * coordinates of the five corner points on the pentagon from p1 to p5 in this order. Use
 * console format to display two digits after the decimal point. 
 */

import java.util.Scanner;

public class CornerPointCoordinations {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user. 
		System.out.print("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();
		
		// Calculate coordinates of 5 points. 
		double x1 = radius * Math.sin(2.0 * Math.PI / 5.0 * 0);
        double y1 = radius * Math.cos(2.0 * Math.PI / 5.0 * 0);
        
        double x2 = radius * Math.sin(2.0 * Math.PI / 5.0 * 1);
        double y2 = radius * Math.cos(2.0 * Math.PI / 5.0 * 1);
        
        double x3 = radius * Math.sin(2.0 * Math.PI / 5.0 * 2);
        double y3 = radius * Math.cos(2.0 * Math.PI / 5.0 * 2);
        
        double x4 = radius * Math.sin(2.0 * Math.PI / 5.0 * 3);
        double y4 = radius * Math.cos(2.0 * Math.PI / 5.0 * 3);
        
        double x5 = radius * Math.sin(2.0 * Math.PI / 5.0 * 4);
        double y5 = radius * Math.cos(2.0 * Math.PI / 5.0 * 4);
		
		// Display results. 
		System.out.println("The coordinates of five points on the pentagon are ");
		System.out.printf("(%.2f %.2f)\n", x1, y1);
		System.out.printf("(%.2f %.2f)\n", x2, y2);
		System.out.printf("(%.2f %.2f)\n", x3, y3);
		System.out.printf("(%.2f %.2f)\n", x4, y4);
		System.out.printf("(%.2f %.2f)\n", x5, y5);
		
		
	}
}
