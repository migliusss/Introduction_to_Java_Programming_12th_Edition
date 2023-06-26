package chapt10;

import java.util.GregorianCalendar;

/*
 * Design a class named MyDat. 
 * 
 * Draw the UML diagram for the class then implement the class. Write a test
 * program that creates two MyDate objects (using new MyDate() and new 
 * MyDate(34355555133101L)) and displays their year, month and day. 
 */

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	/** A constructor that creates a MyDate object for the current time. */
	public MyDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		this.year = calendar.get(GregorianCalendar.YEAR);
		this.month = calendar.get(GregorianCalendar.MONTH);
		this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH); 
	}
	
	/** A constructor that creates a MyDate object with a specified elapsed time. */
	public MyDate(long elapsedTime) {
		setDate(elapsedTime);
	}
	
	/** A getter method for year. */
	public int getYear() {
		return year;
	}
	
	/** A getter method for month. */
	public int getMonth() {
		return month + 1;
		
	}
	
	/** A getter method for day. */
	public int getDay() {
		return day;
	}
	
	/** A method that sets a new date time for the object using the elapsed time. */ 
	public void setDate(long elapsedTime) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime); 
		this.year = calendar.get(GregorianCalendar.YEAR);
		this.month = calendar.get(GregorianCalendar.MONTH);
		this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH); 
	}
}
