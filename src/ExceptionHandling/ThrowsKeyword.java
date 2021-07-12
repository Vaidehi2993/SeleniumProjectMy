package ExceptionHandling;

public class ThrowsKeyword {
	

	public static void main(String[] args) throws ArithmeticException { //Throwing exception because calling sum method inside main method
		
		//Throws keyword is also used to handle any exception.
		//Who will catch the exception - JVM will catch exception and in the last code will terminate.
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();

	}
	
	
	public void sum() throws ArithmeticException {  //throwing exception because calling div method inside sum method
		div();
		
		
	}
	
	public void div() throws ArithmeticException {
		//int i = 9/0;
	}
	

}
