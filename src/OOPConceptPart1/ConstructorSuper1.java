package OOPConceptPart1;

public class ConstructorSuper1 extends ConstructorSuper {
	
	//Super Keyword when we have to intialize parent class constructor first
	//"Super" Keyword must be first Statement
	
	
	public ConstructorSuper1() {
		
		
	}
	
	public ConstructorSuper1(int i) {
		super(i);
	}

	public ConstructorSuper1(int i, int j) {
		super(i,j);
	
	}


	public static void main(String[] args) {
		
		ConstructorSuper1 obj = new ConstructorSuper1();
		ConstructorSuper1 obj1 = new ConstructorSuper1(10);
		ConstructorSuper1 obj2 = new ConstructorSuper1(10,20);

	}

}
