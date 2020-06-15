package Ex6;

public class Ex2Division extends Multi implements CommonFunctions {
	
	public void runExercise() {
		int number1 = getNumberFromConsole();
		int number2 = getNumberFromConsole();
		
		double result = (double) number1 / (double) number2;
		
		System.out.println(
				"If you divide "
				+ number1
				+ " by "
				+ number2 
				+ " then you will get: "
				+ result);
	}

}
