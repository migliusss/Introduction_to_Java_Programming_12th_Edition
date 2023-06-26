package chapt9;

/*
 * Design a class named StopWatch. 
 * 
 * Draw the UML diagram for the class then implement the class. Write a test program 
 * that measures the execution time of sorting 100,000 numbers using selection sort. 
 */

public class StopWatch {
	
	/** Private data fields. */
	private long startTime;
	private long endTime;

	/** No-arg constructor that initializes startTime with the current time. */ 
	public StopWatch() {
		this.startTime = System.currentTimeMillis();
	}
	
	/** A method that resets the startTime to the current time. */ 
	public void start() {
		this.startTime = System.currentTimeMillis();
	}
	
	/** A method that sets the endTime to the current time. */
	public void stop() {
		this.endTime = System.currentTimeMillis();
	}
	
	/** A getter method for returning startTime */
	public long getStartTime() {
		return startTime;
	}
	
	/** A getter method for returning endTime */
	public long getEndTime() {
		return endTime;
	}
	
	/** A method that returns the elapsed time for the StopWatch in milliseconds. */ 
	public long getElapsedTime() {
		return endTime - startTime; 
	}
}
