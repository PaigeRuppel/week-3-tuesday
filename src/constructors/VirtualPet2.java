package constructors;

public class VirtualPet2 {
	String name;

	@Override // want to have override because it's an indication of what is actually going on
	public String toString() {
		return name;
	}
}
