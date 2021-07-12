package Abstraction;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank hb = new HDFCBank();
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		
		Bank b = new HDFCBank(); //dynamic-polymorism created object using parent abstract class object reference variable.
		b.credit();
		b.debit(); //can call abstract class method.
		b.loan(); //can call over-ridden method
		
		
		

	}

}
