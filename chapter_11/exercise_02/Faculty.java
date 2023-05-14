package chapt11;

public class Faculty extends Employee {
	private String officeHours;
	private String rank;
	
	/** A constructor to create a Faculty object. */ 
	public Faculty(String name, String address, String phonenumber, String email, String office, 
			double salary, String officeHours, String rank) {
		super(name, address, phonenumber, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	/** Get office hours. */
	public String getOfficeHours() {
		return officeHours;
	}

	/** Set office hours. */ 
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	
	/** Get rank. */
	public String getRank() {
		return rank;
	}

	/** Set rank. */
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	/** A toString description method for the class. */
	@Override
	public String toString() {
		return super.toString() + "\nOffice hours: " + officeHours + "\nRank: " + rank;
	}
	
}
