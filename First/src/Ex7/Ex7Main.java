package Ex7;

import Ex7.Human.ColourOfEyes;
import Ex7.Human.ColourOfHair;

public final class Ex7Main {

	public static void main(String[] args) {
		/*
		 * Human myHuman = new Human();
		 * 
		 * myHuman.setAge(32); myHuman.setName("Raki");
		 * 
		 * System.out.println( "This is your human: " + "\n name: " +
		 * myHuman.getName() + "\n age: " + myHuman.getAge() +
		 * "\n colour of eyes: " + ColourOfEyes.blue + "\n colour of hair: " +
		 * ColourOfHair.brown );
		 */
		
		System.out.println(
			"Thats your divide result: "
			+ Computation.DIVIDE.perform(2,5)
			+ "\n Thats your add result: "
			+ Computation.ADD.perform(2,5));
	}
}

