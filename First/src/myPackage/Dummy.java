package myPackage;

import myPackage_2.Dummy_p2;

public class Dummy extends Dummy_p2 {

	String funnyVariable = this.thingFromPackage2;

	public String myFunnyFunction(String x) {
		return x + "is a pebble!";
	}

	public static void main(String[] args) throws InterruptedException {
		
		
    String myFunnyArray[] = {
			"I ",
			"like ",
			"sunny ",
			"weather."
    };


//		for (int i = 0; i < 4; i++ ) {
//			System.out.println(myFunnyArray[i]);
//			Thread.sleep(1000);
//		}

//		Scanner scan = new Scanner(System.in);


    System.out.println(Thread.currentThread().getName());
    Thread.sleep(1000);






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