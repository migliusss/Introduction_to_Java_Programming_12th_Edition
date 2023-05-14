package chapt11;

public class Student extends Person {
	private final static String[] STATUS = {"Freshman", "Sophmore", "Junior", "Senior"};
	private int classStatus;
	
	/** Constructor for creating a student object. */
	public Student(String name, String address, String phonenumber, String email, int status) {
		super(name, address, phonenumber, email);
		this.classStatus = status;
	}
	
	/** Set classStatus. */
	public void setClassStatus(int classStatus) {
		this.classStatus = classStatus;
	}
	
	/** Get classStatus. */
	public String getClassStatus() {
		switch(classStatus) {
		case 1: return STATUS[0];
		case 2: return STATUS[1];
		case 3: return STATUS[2];
		case 4: return STATUS[3];
		default: return "Unknown";
		}
	}
	
	/** A method toString to print class name a person's name. */
	@Override
	public String toString() {
		return super.toString() + "\nStatus: " + getClassStatus();
	}
		
}
