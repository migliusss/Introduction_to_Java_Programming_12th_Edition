package chapter_09;

/*
 * (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides have 
 * the same length and all angles have the same degree (i.e., the polygon is both 
 * equilateral and equiangular.) Design a class named RegularPolygon.
 * 
 * Draw the UML diagram for the class then implement the class. Write a test program 
 * that creates three RegularPolygon objects, created using the no-arg constructor, 
 * using RegularPolygon(6, 4), and using RegularPolygon(10, 4, 5.6, 7.8).
 * For each object, display its perimeter and area. 
 */

public class Exercise_09_09 {
	/** Main method. */
	public static void main(String[] args) {
		// Create 3 RegularPolygon objects. 
		RegularPolygon regularPolygon1 = new RegularPolygon();
		RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
		RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		// Display perimeter and area for each object. 
		System.out.println("Regular Polygon 1 \n Perimeter: " + regularPolygon1.getPerimeter() + "\n Area: " + 
		regularPolygon1.getArea());
		System.out.println("Regular Polygon 2 \n Perimeter: " + regularPolygon2.getPerimeter() + "\n Area: " + 
				regularPolygon2.getArea());
		System.out.println("Regular Polygon 3 \n Perimeter: " + regularPolygon3.getPerimeter() + "\n Area: " + 
				regularPolygon3.getArea());
	}
}
