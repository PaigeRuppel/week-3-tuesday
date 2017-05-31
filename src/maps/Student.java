package maps;

public class Student {
	String id;
	String name;

	@Override // this overrides the toString() method from Object (normally
				// would just show hashtags)
	public String toString() {
		return "Student with ID: " + id + " - Name: " + name;
	}

	public Student() {
	}

	public Student(String id, String nameParam) {
		this.id = id;  //this specifies that it's referring to the instance variables (i.e. this.instance)
		name = nameParam;
	}
}
