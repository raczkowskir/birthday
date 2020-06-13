package Ex6;

import java.util.Scanner;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      Integer number = scanner.nextInt();
	
      double resultDouble = number * Math.PI;
//      int resultInteger = (int) (number * Math.PI);
      
      System.out.println("Result as an integer: " + (int) (number * Math.PI) + " and a double: " + resultDouble);
      

	}

}
