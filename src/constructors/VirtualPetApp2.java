package constructors;

public class VirtualPetApp2 {

	public static void main(String[] args) {
		VirtualPet2 myPet = new VirtualPet2();
		myPet.name = "Hope";
		
		System.out.println("My pet is " + myPet);
		
		ConstructorPet constructedPet = new ConstructorPet("Sheeba"); //instance variables are blue
																	//local variables are purple/brown
		System.out.println("My pet is " + constructedPet);
		
		ConstructorPet hungryPet = new ConstructorPet ("Garfield", 70);
		
		System.out.println("My pet is " + hungryPet);
	}

}
