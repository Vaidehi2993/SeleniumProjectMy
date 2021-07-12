package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.educationloan();
		hs.carloan();
		
		/*
		 * dynamic polymorphism: 
		 * child class object can be refereed by parent interace reference variable.
		 * if u1Always overridden method can call.
		 */		
		InterfaceUSBANK u1 = new HSBCBank();
		u1.credit();
		u1.debit();
		u1.transfermoney();
		

	}

}
