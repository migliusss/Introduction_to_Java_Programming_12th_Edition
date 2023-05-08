package chapt9;

public class TestRectangle {
	public static void main(String[] args) {
		// Create the first rectangle. 
		Rectangle rectangle1 = new Rectangle(4, 40);
		// Display width, height, area and perimeter. 
		System.out.println("Width of the first rectangle: " + rectangle1.width);
		System.out.println("Height of the first rectangle: " + rectangle1.height);
		System.out.println("The area of the first rectangle: " + rectangle1.getArea());
		System.out.println("The perimeter of first the rectangle: " + rectangle1.getPerimeter());
		
		System.out.println();
		
		// Create the second rectangle. 
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		// Display width, height, area and perimeter. 
		System.out.println("Width of the second rectangle: " + rectangle2.width);
		System.out.println("Height of the second rectangle: " + rectangle2.height);
		System.out.println("The area of the second rectangle: " + rectangle2.getArea());
		System.out.println("The perimeter of second the rectangle: " + rectangle2.getPerimeter());
		
	}
}
