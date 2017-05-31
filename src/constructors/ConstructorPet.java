package constructors;

public class ConstructorPet {
	String name;
	int hunger;

	@Override
	public String toString() {
		return "Constructed pet is " + name + ". Their hunger level is " + hunger + ".";
	}

	// constructors always have the same name as their class (note the
	// uppercase - methods always start with lower, then camelCase)
	// we are *overloading* (not overriding) our constructor
	public ConstructorPet(String newName) {
		name = newName;
		hunger = 50;
	}

	// creating a constructor //(signature)
	public ConstructorPet(String newName, int initialHunger) { //additional constructor that allows you to modify hunger upon creation
		name = newName;
		hunger = initialHunger;
	}

}
