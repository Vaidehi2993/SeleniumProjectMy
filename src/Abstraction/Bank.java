package Abstraction;

public abstract class Bank {
	
	/*
	 * must need one abstarct method
	 * abstract class can have abstract method and non abstract method.
	 * no method boby require for abstract method
	 * Acheving partial abstraction
	 * hiding the implementation logic - is called abstraction
	 * can not create the object of abstarct class.
	 * Abstract class is faster than Interface.
	 * 
	 */
	
	public abstract void loan();
	
	//Non-abstract Method
	public void credit() {
		System.out.println("Bank--Credit");
		
	}
	
	public void debit() {
		System.out.println("Bank--Debit");
		
	}
	
}
