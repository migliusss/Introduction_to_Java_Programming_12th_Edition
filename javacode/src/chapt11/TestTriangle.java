package chapt11;

import java.util.Scanner;

/*
 * Design a class named Triangle that extends GeometricObject. 
 * 
 * Draw the UML diagram for the classes Triangle and GeometricObject and 
 * implement the classes. Write a test program that prompts the user to enter three
 * sides of the triangle, a color, and a Boolean value to indicate whether the triangle 
 * is filled. The program should create a Triangle object with these sides and set
 * the color and filled properties using the input. The program should display 
 * the area, perimeter, color, and true or false to indicate whether it is filled or not.
 */

public class TestTriangle {
	public static void main(String[] args) {
		// Create a Scanner. 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter 3 side of a triangle. 
		System.out.print("Enter 3 sides of a triangle: ");
		
		// Create a Triangle object with user input. 
		Triangle triangle = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
		
		// Prompt the user to enter a color and a boolean value. 
		System.out.print("Enter a color: ");
		triangle.setColor(input.next());
		
		System.out.print("Enter if a triangle is filled (true or false): ");
		triangle.setFilled(input.nextBoolean());
		
		// Display results. 
		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Filled: " + triangle.isFilled()); 
		
		
	}
}
