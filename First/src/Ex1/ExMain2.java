package Ex1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExMain2 {
	public String subject = null;

	public String returnSubject(int subjectId) {   	
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

	public void printQuestion(int subjectId, int gradeId) {
		subject = returnSubject(subjectId);
		System.out.println("Type " + (gradeId + 1) + ". grade " + "you have got from " + subject + ":");
	}

	public void printResult(int subjectId, double grade) {
		subject = returnSubject(subjectId);
		System.out.println("Your average grade from " + subject + " is " + grade);
	}

	public int getDigit() {
		Scanner inputScanner = new Scanner(System.in);
		int testInt = inputScanner.nextInt();
		String testString = String.valueOf(testInt);
		Pattern myPattern = Pattern.compile("^[1-6]");
		Matcher myMatcher = myPattern.matcher(testString);

		try {
			myMatcher.find();
			testInt = Integer.parseInt(myMatcher.group(0));
		}
		catch (IllegalStateException e) {
			System.out.println("You typed: " + testString + "Grades have to be digits from a set 1-6.");
			getDigit();
		}
		return testInt;
	}

	public static void main(String... args) {
		int[][] classAndGradesArray = new int[3][4];
		int[] yourGradesSumArray = new int[3]; 
		float[] yourGradesAverageArray = new float[3];
		ExMain2 exMainObject = new ExMain2();

		for(int i = 0; i < classAndGradesArray.length; i++) {          
			for(int j = 0; j < classAndGradesArray[i].length; j++) {
				exMainObject.printQuestion(i, j);
				classAndGradesArray[i][j] = exMainObject.getDigit();
			}
		}

		for(int i = 0; i < classAndGradesArray.length; i++) {          
			for(int j = 0; j < classAndGradesArray[i].length; j++) {
				yourGradesSumArray[i] = yourGradesSumArray[i] + classAndGradesArray[i][j];
			}
			yourGradesAverageArray[i] = ((float)yourGradesSumArray[i]) / 4;
			exMainObject.printResult(i, yourGradesAverageArray[i]);           
		}
	}
}