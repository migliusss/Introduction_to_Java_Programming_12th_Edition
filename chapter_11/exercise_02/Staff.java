package chapt11;

public class Staff extends Employee {
	private String title;
	
	/** A constructor to create a Staff object. */
	public Staff(String name, String address, String phonenumber, String email, String office, 
			double salary, String title) {
		super(name, address, phonenumber, email, office, salary);
		this.title = title;
	}
	
	/** Get a title */ 
	public String getTitle() {
		return title;
	}

	/** Set a title. */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/** A toString description method for the class. */
	@Override
	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
	
}
