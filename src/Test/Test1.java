package Test;

import Selenium.Test4; //This line will be added when we calling methods from other package.

public class Test1 { //Start class
	
	//ClassName objName = New ClassName();
	static Test1 t1 = new Test1();
	static Test2 t2 = new Test2();
	static Test3 t3 = new Test3();
	static Test4 t4 = new Test4();
	
	//If you want to run your class, you must have main method.
	//We can add N number of Methods in class
	//Java only runs Main method, Other added method we have to call in main Method to run
	//If we don't call method in main method it will not execute method.
	//Main Method is always Static Method, You can call only directly static method.
	//If we want to execute non-static method we have to create object.
	
	//Static - ClassName.MethodName();  & methodName(); - only if its in same class
	//Non static - ObjectName.MethodName();
	
	//Constructor is in any class and created object automatically run constructor first.
	
	public static void main(String[] args) { //Start Main method
	
		System.out.println("I'm in the Main Method");
		Scanme(); //Java Execute method line by line.
		Printme();  //Calling second method in main Method
		t1.testme();
		t1.Paintme(); //we can use same new object for more than one non-static method.
		Test2.red();  //Calling static method from other class we can use ClassName.Methodname()
		t2.blue();    //Calling Non - static method from other class we created object and use ObjectName.MethodName();
		Test3.BMW();
		t3.Audi();
		Test4.circle();
		t4.square();
		
	} //End Main Method
	
	public static void Printme() { //start second method
		System.out.println("Printme");
	}  // end of Second Method
	
	public static void Scanme() {    //Static Method
		System.out.println("Scanme");
	}
	
	public void testme() {           //Non-Static Method run through object
		System.out.println("testme");
	}
	
	public void Paintme() {           //Non-Static Method run through object
		System.out.println("Paintme");
	}
	
	
}// End of class

