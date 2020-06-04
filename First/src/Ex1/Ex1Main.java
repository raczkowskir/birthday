package Ex1;
// exercise with throwing exceptions
import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please type a number:");
		String strNumber = scan.nextLine();
		int number = Integer.parseInt(strNumber);
		try {
			if (number <0) {
				throw new IllegalArgumentException("number must be >= 0: " + number);
			}

		}
		catch(IllegalArgumentException e) {
			number = number * -1;
			System.out.println("Moran");
		}

		double sqNumber = Math.sqrt(number);
		System.out.println("The square of " + number + " is " + sqNumber);
	}
}
