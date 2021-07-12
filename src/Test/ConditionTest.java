package Test;

public class ConditionTest {

	public static void main(String[] args) {
		
		// If else condition
		
		int a = 30;
		int b = 20;   //When we use integer number we use == as arithmetic operator
		
		if(a==b) { 					     //if condition is true it will print on if brackets.
			System.out.println("Pass"); 
			
		}else {  					     //if condition is false it will print on else brackets.
			System.out.println("Fail");
		
		}
		
		String expected = "Selenium";  //Java is case Sensitive
		String Real = "selenium";
		
		if(expected.equals(Real)) {          //When we use string we use .equals as string is class where .equals is methos.
			
			System.out.println("Equal");
		}else {
		
			System.out.println("Not Equal");
			
		}
	
	
	
		if(expected.equalsIgnoreCase(Real)){ //Ignore case in String
			
			System.out.println("Equal");
		}else {
		
			System.out.println("Not Equal");

	}
}

}
