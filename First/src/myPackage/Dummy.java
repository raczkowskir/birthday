package myPackage;

import java.util.Scanner;

//import myPackage.Functions;
//import myPackage.Constans;
//import myPackage.Functions;
import myPackage.*;
import myPackage_2.*;

public class Dummy extends Dummy_p2 {

	String funnyVariable = this.thingFromPackage2;

	public String myFunnyFunction(String x) {
		return x + "is a pebble!";
	}

	public static void main(String[] args) throws InterruptedException {


		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
		
//		FirstInterface myUniverslaType = new Class_2();
//		
		
//		myUniverslaType.myFunnyfunction();
//		FirstInterface mySecondObject;
//		
//		mySecondObject = myUniverslaType;
//		
//		Class c = mySecondObject.getClass();
//		
//		System.out.println(c);
		//		Object myWhatEverObject = System.console();
		//		
		//		Object myWhatEverObject2 = null; 
		//		
		//		Class whatsTheClass;

		Dummy myDummy = new Dummy();


		System.out.println(
				myDummy.funnyVariable +
				" I have an agly feet. " +
				myDummy.myFunnyFunction("Adrian ")
				);



		
	}

}