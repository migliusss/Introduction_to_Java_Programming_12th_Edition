package chapt9;

/*
 * Design a class named Fan to represent a fan. 
 * 
 * Draw the UML diagram for the class then implement the class. Write a test program 
 * that creates two Fan objects. Assign maximum speed, radius 10, color yellow,
 * and turn it on to the first object. Assign maximum speed, radius 5, color blue, and
 * turn it off to the second object. Display the objects by invoking their toString method. 
 */

public class Fan {
	/** Private data fields */
	private static final int SLOW = 1;
	private static final int MEDIUM = 2;
	private static final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	
	/** No-arg constructor that creates a default fan. */
	public Fan() {
	}
	
	/** The accessor and mutator methods for speed, on, radius, color */
	public String getSpeed() {
		String stringSpeed = "";
		
		switch(speed) {
		case SLOW: stringSpeed = "Slow"; 
		break;
		case MEDIUM: stringSpeed = "Medium"; 
		break;
		case FAST: stringSpeed = "Fast"; 
		}
		
		return stringSpeed;
	}
	
	public boolean isOn() {
		return on;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setOn(boolean on) {
		this.on = on;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	/** A method that returns a string description for the fan. */
	public String toString() {
		if (on == true) {
			return "Speed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius();
		}
		else {
			return "Color: " + getColor() + "\nRadius: " + getRadius() + "\nThe fan is off.";
		}
		
	}
}
