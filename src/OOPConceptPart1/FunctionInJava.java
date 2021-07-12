package OOPConceptPart1;

public class FunctionInJava {

	public static void main(String[] args) {  //Main method must be void because main method never return a value.
		
		/*
		 * //nonstatic method we have to create object and 
		 * using reference object variable and non static method Name call in to main method;
		 */ 
		
		FunctionInJava obj = new FunctionInJava();
		obj.test();
		
		int c = obj.pqr();
		System.out.println(c);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int l = obj.division(60, 30);
		System.out.println(l);
		
		}
	
	//Non-static Methods
	
	/* remember through factory story 
	 * nike factory - give input, get output
	 * oldnavy factory - no input, get output
	 * zara factory - no input, no output
	 */
	
	//No input, no output
	public void test() {    //What is the return type of test method?  - Void
		System.out.println("test method");

	}
	
	//We can not use "return" Keyword when we are using "void" means it does not return the value;
	
	//no input, get output
	public int pqr() {   //return data type is int.
		System.out.println("PQR Method");
		
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		
	}
	
	//no input, get output
	public String qa() {  //because qa()method returning data type String.
		System.out.println("qa method");
		String s = "selenium";
		
		return s;
	}
	
	//give input, get output
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x/y;
		return d;
		
		
	}

}
