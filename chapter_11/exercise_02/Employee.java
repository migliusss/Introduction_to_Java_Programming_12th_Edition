package chapt11;

import chapt10.MyDate;

public class Employee extends Person {
	private String office;
	private double salary;
	private MyDate dateHired;
	
	/** Constructor for creating an employee object. */
	public Employee(String name, String address, String phonenumber, String email, String office, 
			double salary) {
		super(name, address, phonenumber, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate();
	}
	/** Get office name. */
	public String getOffice() {
		return office;
	}
	
	/** Set office name. */
	public void setOffice(String office) {
		this.office = office;
	}

	/** Set salary. */
	public String getSalary() {
		return String.valueOf(salary);
	}
	
	/** Get salary. */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/** Get date hired. */
	public String getDateHired() {
		return dateHired.getYear() + "/" + dateHired.getMonth() + "/" + dateHired.getDay();
	}
	
	/** Set date hired. */
	public void setDateHired(MyDate dateHired) {
		this.dateHired = new MyDate();
	}
	
	/** A toString description method for the class. */
	@Override
	public String toString() {
		return super.toString() + "\nOffice: " + office + "\nSalary: $" 
				+ getSalary() + "\nDate hired: " + getDateHired(); 
	}
	
}
