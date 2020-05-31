package myPackage;

import java.util.Scanner;
import myPackage.Functions;

/**
 * @author raczkows
 *
 */
public class Dummy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.println("What you want?");
//		String firstName = scan.nextLine();
//		System.out.println("Put \"" + firstName + "\" in your ass!");
		
		String name = "Raki";
		
		System.out.println("My funny variable: " + name);
		Functions.setName(name);
	}
}