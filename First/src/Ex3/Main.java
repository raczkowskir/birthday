package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication();
        }
        else {
            computation = new Addition();
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Result: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Do you want to add 2 numbers (A) or multiply them (M)?");
        
        Scanner scan = new Scanner(System.in);
        String response = scan.nextLine();
        
		if (response.equals("A") || response.equals("a")) {
        	return false;
        }
        else if(response.equals("M") || response.equals("m")) {
        	return true;
        }
        else {
        	System.out.println("Sth go wrong, please try again.");
        	shouldMultiply();
        }
        return false;
    }

    private double getArgument() {
    	System.out.println("Please enter two numbers:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
    	
        return number;
    }
}