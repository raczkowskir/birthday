package Ex1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import com.sun.beans.decoder.ValueObject;

public class ExMain2 {
	
	

	public static String subject = null;
	
    public static String returnSubject(int subjectId) {   	
    	switch(subjectId) {
    		  case 0:
    			  subject = "Biology";
    		    break;
    		  case 1:
    			  subject = "Math";
    		    break;
    		  case 2:
    			  subject = "Physics";
      		    break;
    		  default:
    		    System.out.println("Array with subjects/classes should has 3 elemts only.");	
    			break;
    		}
    	return subject;
    }
	
    public static void printResult(int subjectId, double grade) {
    	subject = returnSubject(subjectId);
    	System.out.println("Your average grade from " + subject + " is " + grade);
    }
	
    public static void printQuestion(int subjectId, int gradeId) {
    	subject = returnSubject(subjectId);
        System.out.println("Type " + (gradeId + 1) + ". grade " + "you have got from " + subject + ":");
    }
    
    public static void main(String... args) {
    	int[][] classAndGradesArray = new int[3][4];
    	int[] yourGradesSumArray = new int[3]; 
    	float[] yourGradesAverageArray = new float[3];     	
    	
        Scanner inputScanner = new Scanner(System.in);
        ////////////////
        System.out.println("Type:");
        int testInt = inputScanner.nextInt();
        String testString = String.valueOf(testInt);
        
        Pattern myPattern = Pattern.compile("^[1-6]");
        Matcher myMatcher = myPattern.matcher(testString);
        System.out.println("Result: " + myMatcher);
        
        System.out.println(myMatcher.find());
        System.out.println(myMatcher.group(0));
        
        
        // RR: to add protection for typing number instead of digits
        /////////////
 
//        for(int i = 0; i < classAndGradesArray.length; i++) {          
//            for(int j = 0; j < 4; j++) {
//            	printQuestion(i, j);
//                classAndGradesArray[i][j] = inputScanner.nextInt();
//            }
//        }
//         
//        for(int i = 0; i < classAndGradesArray.length; i++) {          
//            for(int j = 0; j <= 3; j++) {
//            	yourGradesSumArray[i] = yourGradesSumArray[i] + classAndGradesArray[i][j];
//            }
//            
//            yourGradesAverageArray[i] = ((float)yourGradesSumArray[i]) / 4;
//            printResult(i, yourGradesAverageArray[i]);
            
            
            
        }    
    }
//}