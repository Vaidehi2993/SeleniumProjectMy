package OOPConceptPart2;

public class HSBCBank implements InterfaceUSBANK,BrazilBank { //we are acheving multiple inheritance.
	
	/*
	 * //When we have to make relationship with with parent interface and child
	 * class we have to use "implement" Keyword.
	 * 
	 * called also Is-a-relationship.
	 * 
	 * when a class is implementing by any interface, then its mandatory to define/override all the method of interface.9
	 */
	
	//overriding from USBANK
	public void credit() {
		System.out.println("hsbc -- credit");
		
	}

	public void debit() {
		System.out.println("hsbc -- debit");
		
	}

	public void transfermoney() {
		System.out.println("hsbc -- transfermoney");
		
	}
	
	//Seperate methods of HSBC Bank
	public void educationloan() {
		System.out.println("hsbc --- education");
	}
	
	public void carloan() {
		System.out.println("hsbc --- carloan");
	}
	
	//brazilbank method : Overriding from BrazilBank
	public void mutualfund() {
		System.out.println("hsbc --- mutualfund");
	}
	
	

}
