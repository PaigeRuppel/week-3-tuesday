package maps;

import java.util.ArrayList;
import java.util.List;

public class StudentRecords {

	public static void main(String[] args) {
		// general type constructor concrete type
		List<Student> students = new ArrayList<>(); // <> diamond operator: same
													// as ArrayList<Student>();

		Student harvey = new Student("23A52", "Harvey Dent");
		/**
		 * we have changed the default constructor and created a constructor
		 * method (see Student.java) that allows us to directly pass arguments
		 * more efficient way to add new Students
		 */
		students.add(harvey); // adds student harvey to our list
		Student jessica = new Student("68Z29", "Jessica Jones");
		students.add(jessica);
		Student luke = new Student("57W85", "Luke Cage");
		students.add(luke);
		System.out.println(students);

		String lookingFor = "Harvey Dent";
		for (Student current : students) {
			System.out.println("Current: " + current);
			if (lookingFor.equalsIgnoreCase(current.name)) {
				System.out.println("Found my student. Their ID is: " + current.id);
				break;
			}
		}
	}

	/**
	 * public static Student createStudent(String idParam, String nameParam) {
	 * Student s = new Student(); // default constructor s.id = idParam; s.name
	 * = nameParam; return s; }
	 * 
	 * Above method - called createStudent - returns type Student accepts two
	 * parameters that are set to equal id and name (Strings that exist within
	 * Student.java) - using this type of a method directly outside of your main
	 * method achieves the same result as creating a constructor (see
	 * Student.java for this constructor and compare)
	 */
}
