package chapt11;

/*
 * (The Person, Student, Employee, Faculty, and Staff classes) Design a           
 * class named Person and its two subclasses named Student and Employee.          
 * Make Faculty and Staff subclasses of Employee. A person has a name,            
 * address, phone number, and email address. A student has a class status         
 * (freshman, sophomore, junior, or senior). Define the status as a constant. An  
 * employee has an office, salary, and date hired. Use the MyDate class defined   
 * in Programming Exercise 10.14 to create an object for date hired. A faculty    
 * member has office hours and a rank. A staff member has a title. Override the   
 * toString method in each class to display the class name and the person’s name. 
 * Draw the UML diagram for the classes and implement them. Write a test program  
 * that creates a Person, Student, Employee, Faculty, and Staff, and invokes      
 * their toString() methods. 
*/

public class Person {
	private String name;
	private String address;
	private String phonenumber;
	private String email;
	
	/** A default constructor to create a Person object. */
	public Person() {
		this.name = "";
		this.address = "";
		this.phonenumber = "";
		this.email = "";
	}
	
	/** A constructor that creates a Person with specified parameters. */
	public Person(String name, String address, String phonenumber, String email) {
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
		this.email = email;
	}
	
	/** Get a name. */ 
	public String getName() {
		return name;
	}
	
	/** Set a name. */
	public void setName(String name) {
		this.name = name;
	}
	
	/** Get an address. */
	public String getAddress() {
		return address;
	}
	
	/** Set an address. */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/** Get a phonenumber. */
	public String getPhonenumber() {
		return phonenumber;
	}
	
	/** Set a phonenumber. */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	/** Get an email. */
	public String getEmail() {
		return email;
	}
	
	/** Set an email. */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/** A toString method to display a class name and a person's name. */
	public String toString() {
		return "Name: " + name + "\nAddress: " + address 
				+ "\nPhonenumber: " + phonenumber + "\nE-mail address: " + email;
	}
	
}
