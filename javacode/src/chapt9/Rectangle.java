package chapt9;

/*
 * Following the example of the Circle class in Section 9.2,
 * design a class names Rectangle to represent a rectangle. 
 * 
 * Draw UML diagram for the class then implement the class. Write a test program
 * that creates two Rectangle objects-one with width 4 and height 40, and 
 * the other with width 3.5 and height 35.9. Display the width, height, area, and 
 * perimeter of each rectangle in this order. 
 */

public class Rectangle {
	/** The width and height of the rectangle, with a default value of 1 */
	double width = 1;
	double height = 1;
	
	/** Construct a rectangle object */
	Rectangle() {
	}
	
	/** Construct a rectangle object */
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/** Return the area of this rectangle */
	double getArea() {
		return width * height;
	}
	
	/** Return the perimeter of this rectangle */ 
	double getPerimeter() {
		return 2 * (width + height);
	}
}
