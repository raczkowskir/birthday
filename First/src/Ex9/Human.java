package Ex9;

public class Human {
	
	private String name;
	private String surname;
	private int dnaCode;
	
	public Human(String name, String surname, int dnaCode) {
		this.name = name;
		this.surname = surname;
		this.dnaCode = dnaCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Human) {
			Human otherHuman = (Human) obj;
					
		return name.equals(otherHuman.name) &&
				surname.equals(otherHuman.surname) &&
				dnaCode == otherHuman.dnaCode; 
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return 49 * name.hashCode() + 88 * surname.hashCode() + 8 * dnaCode;
	}

	public static void printHashcode(Human human) {
		System.out.println("The hash code for human : " + human 
			+ " is: " + human.hashCode());
	}
	
	public static void main(String[] args) {

		Human myFirstHuman = new Human("John", "Holden", 9090909);
		Human mySecondHuman = new Human("Amos", "Daw", 6969697);
		Human myThirdHuman = new Human("Boby", "Draper", 467457);
		Human myFourthHuman = new Human("John", "Holden", 9090909);
		
		Human[] human = {myFirstHuman, mySecondHuman, myThirdHuman, myFirstHuman};
		
//		System.out.println("Is myFirstHuman equals to mySecondHuman: " 
//				+ myFirstHuman.equals(mySecondHuman));
//		System.out.println("Is mySecondHuman equals to myFirstHuman: " 
//				+ mySecondHuman.equals(myFirstHuman));
//		System.out.println("Is myFirstHuman equals to myThirdHuman: " 
//				+ myFirstHuman.equals(myFourthHuman));
//		System.out.println("Is myFourHuman equals to myThirdHuman: " 
//				+ myFirstHuman.equals(myFirstHuman));
		
		for (int i = 0; i <= 3; i++) {
			printHashcode(human[i]);
		}
		
		
	}

}
