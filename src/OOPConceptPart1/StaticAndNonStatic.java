package OOPConceptPart1;

public class StaticAndNonStatic {
	
	String Name = "Vaidehi"; //Non-static global variable
	static int age = 25; //static global variable

	public static void main(String[] args) {
		
		//how to call static methods and variable?
		//1) directly
		sum();
		//2) Calling by classname;
		StaticAndNonStatic.sum();
		
		System.out.println("age");
		System.out.println((StaticAndNonStatic.age));
	
		StaticAndNonStatic Obj = new StaticAndNonStatic();
		
		Obj.sendmail();
		System.out.println(Obj.Name);
		
		//Can we access Static methods by using object reference? yes but will give warning
		
		Obj.sum();

	}
	
	public void sendmail() { //non-static method
		System.out.println("Send mail method");
	}
	
	public static void sum() { //static method
		System.out.println("Sum Method");
	}

}
