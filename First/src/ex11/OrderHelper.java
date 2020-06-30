package ex11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OrderHelper {

	public static void showProductsOnShelf() {
		System.out.println("Please chose the product you want to add to the basket.");

		for(int i = 0; i< Products.values().length; i++) {
			System.out.print(" ID:" 
					+ Products.values()[i].ordinal()
					+ "  " + String.format("%.2f", Products.values()[i].getPrice()) + " USD  " 
					+ Products.values()[i] + "\n");
		}
	}
	
	public static int getNumber() {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		try {	
			number = scan.nextInt();
		}
		catch(ArrayIndexOutOfBoundsException|InputMismatchException e) {
			System.out.println("You can only type digits (0-9).");
			number = getNumber();
		}

		return number;
	}

}
