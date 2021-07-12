package OOPConceptPart1;

public class Car {
	
	//What is class ? - is entities where we have to define No. properties(in the form of method & Variable)
	
	//car Class vars:
	
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		//Object - object created by using "new" keyword
		
		Car a = new Car();   //a is refereing the object (new car), a,b,c
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;  //intializing value with reference value & class variable
		a.wheel = 4;
		
		b.mod = 2014;
		b.wheel = 5;
		
		c.mod = 2016;
		c.wheel = 4;
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		
		System.out.println("after shifting the references");
		
		
		
		
	}

}
