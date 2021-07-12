package AccessModifier2;

import AccessModifier.Access1;

public class Access3 extends Access1{
	
	public static void main(String[] args) {
		Access1 a = new Access1();
		Access3 a2 = new Access3();
	
	System.out.println(a.i);
	System.out.println(a.j);
	
	System.out.println(a2.r);
	System.out.println(a2.s);
	
	System.out.println(a2.getlastname());

	
	
	}
	
}
