package chapter_09;

public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	
	/** Constructor. */
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/** Getter methods. */
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	
	/** Method that returns the discriminant, which is b^2 - 4ac. */
	public double getDiscriminant() {
		return Math.pow(b * b - 4 * a * c, 0.5);
	}
	
	/** Methods that return two roots of the equation. */
	public double getRoot1() {
		if (getDiscriminant() < 0) {
			return 0;
		}
		else {
			return (- b + getDiscriminant()) / (2 * a);
		}
	}
	
	public double getRoot2() {
		if (getDiscriminant() < 0) {
			return 0;
		}
		else {
			return (- b - getDiscriminant()) / (2 * a);
		}
	}
}
