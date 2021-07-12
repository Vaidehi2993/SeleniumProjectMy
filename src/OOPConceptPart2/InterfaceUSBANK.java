package OOPConceptPart2;

public interface InterfaceUSBANK {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transfermoney();
	
	//only method declarion
	//no method body = only method prototype
	//in interface , we can declare the variables, variable are by default in static in nature
	//vars value will not be changed
	//no static method in interface.
	//no main method in interface
	//we can not create the object of interface.
	//interface is abstarct in nature.

}
