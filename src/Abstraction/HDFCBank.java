package Abstraction;

public class HDFCBank extends Bank{
	
	public void loan() {  //override method same method name as parent abstract class
		System.out.println("HDFC loan Method");
	}
	
	public void funds() {
		System.out.println("HDFC Funds");
	}

}
