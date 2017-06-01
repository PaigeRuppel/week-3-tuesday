package maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StudentRecordsWithMap {

	public static void main(String[] args) {

		// Student harvey = new Student("23A52", "Harvey Dent");
		// Student jessica = new Student("68Z29", "Jessica Jones");
		// Student luke = new Student("57W85", "Luke Cage");

		Map<String, String> students = new HashMap<String, String>();
		students.put("68Z29", "Jessica Jones");
		System.out.println("hashcode for Jessica is " + "68Z29".hashCode());
		System.out.println(students);

		students.put("23A52", "Harvey Dent");
		System.out.println("hashcode for Harvey  is " + "23A52".hashCode());
		System.out.println(students);

		String studentName = students.get("23A52");
		System.out.println("I found student " + studentName);

		students.put("57W85", "Luke Cage");

		// Common map methods:
		// Collection Views:
		// keySet() - returns keys for the map (remember that keys represent a
		// Set)
		// values() - returns values for the map
		// entrySet() - returns key/value pairs for the map (this
		// accomplishes the same thing as iterating over all the keys and
		// get() the values, but is a lot more efficient in terms of
		// performance)

		System.out.println("Student ids (the keys in this map) are " + students.keySet());
		System.out.println("Student names (the values in this map) are " + students.values());
		System.out.println("Student entries (key/value pairs for this map) are " + students.entrySet());

		System.out.println("Iterating over student names:");
		for (String currentName : students.values()) {
			System.out.println(currentName);
		}
		
		System.out.println("Iterating over entries:");
		for(Entry<String, String> entry: students.entrySet()) {
			String key = entry.getKey(); // student id
			String value = entry.getValue(); // student name
			System.out.println("The key is: " + key + ", the value is: " + value);
		}
		System.out.println();
		
		// sorting a list (sidebar)
		System.out.println("Sorting a list:");
		List<String> listOfClasses = new ArrayList<>();
		listOfClasses.add("Philosophy");
		listOfClasses.add("Botany");
		listOfClasses.add("French Literature");
		System.out.println(listOfClasses);
	}

}
