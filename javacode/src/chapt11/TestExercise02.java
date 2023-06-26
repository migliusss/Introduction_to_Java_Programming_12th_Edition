package chapt11;

public class TestExercise02 {
	// Main method.
	public static void main(String[] args) {
		// Create a Person.
		Person person = new Person("Migle", "Street, 4", "75649300", "name@gmail.com");
		
		// Create a Student. 
		Student student = new Student("Migle", "Street, 4", "75649300", "name@gmail.com", 1); 
		
		// Create an Employee. 
		Employee employee = new Employee("Migle", "Street, 4", "75649300", "name@gmail.com", "New York", 60000);
		
		// Create a Faculty. 
		Faculty faculty = new Faculty("Migle", "Street, 4", "75649300", "name@gmail.com", "New York", 60000, 
				"08:00 - 16:00", "Office Administrator");
		
		// Create a Staff. 
		Staff staff = new Staff("Migle", "Street, 4", "75649300", "name@gmail.com", "New York", 60000, 
				"Salesman");
		
		// Display results by invoking the methods. 
		System.out.println(person.toString() + "\n");
		System.out.println(student.toString() + "\n");
		System.out.println(employee.toString() + "\n");
		System.out.println(faculty.toString() + "\n");
		System.out.println(staff.toString() + "\n");
	}
}
