package chapter_09;

public class RegularPolygon {
	private int n = 3; // Defines number of sides in the polygon.
	private double side = 1; // Stores the length of the side. 
	private double x = 0; // Defines x-coordinates of the polygon's center. 
	private double y = 0; // Defines y-coordinates of the polygon's center. 
	
	/** A no-arg constructor that creates a regular polygon with default values. */
	RegularPolygon() {
	}
	
	/** Constructor that creates a regular polygon with the specified number of sides and length of side
	 ** centered at (0,0). */
	RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
	}
	
	/** Constructor that creates regular polygon with the specified number of sides, length of side,
	 ** and x- and y- coordinates. */
	RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	/** Getter and setter methods for all data fields. */
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	/** Method that returns the perimeter of the polygon. */
	public double getPerimeter() {
		return side * n;
	}
	
	/** Method that returns the area of the polygon. */
	public double getArea() {
		return (n * side * side) / (4 * Math.tan(Math.PI / n));
	}
}
