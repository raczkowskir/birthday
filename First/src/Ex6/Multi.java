package Ex6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multi implements CommonFunctions {
	public Scanner scanner = new Scanner(System.in);

	public int getNumberFromConsole() {
		int number = 0;
		
		System.out.println("Please type an integer:");
	
		while(true) {
			try {
				return scanner.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Wrong data type! Please type an integer: ");
				 //the command takes out the the data form the system out queue
				scanner.next();
			}
		}
	}		
	
	public void runExercise() {
		int number = getNumberFromConsole();
		double resultDouble = number * Math.PI;
		int resultInteger = (int) (number * Math.PI);

		System.out.println(
				"Result as an integer: " + resultInteger 
				+ " and a double: " + resultDouble);
	}	
}
