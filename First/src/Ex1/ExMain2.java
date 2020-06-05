package Ex1;

import java.util.Scanner;

public class ExMain2 {
	
	
// 3 przedmioty 
// 4 oceny
	
// add average, check result/ handle exceptions
	
	
    public static void main(String... args) {
    	int[][] classAndRatesArray = new int[3][4];
    	int[] averageRateAdday = new int[3]; 
        Scanner inputScanner = new Scanner(System.in);
 
        for(int i = 0; i < classAndRatesArray.length; i++) {          
            for(int j = 0; j < 4; j++) {
                System.out.println("Type " + j + " grade " + "of the class no. " + i + ":");
                classAndRatesArray[i][j] = inputScanner.nextInt();
  
            }
        }
 

        
        for(int i = 0; i < classAndRatesArray.length; i++) {          
            for(int j = 0; j <= 3; j++) {
            	averageRateAdday[i] = averageRateAdday[i] + classAndRatesArray[i][j];
            }
        }
        System.out.println("Twoje oceny wynosza: ");
        System.out.println(averageRateAdday);
    }
}