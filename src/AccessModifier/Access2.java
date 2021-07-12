package AccessModifier;

public class Access2 {

	public static void main(String[] args) {
		
		/*
		 * //We can access "default" access modifier inside the same
		 * package and inside different class. can not access inside inside different pacakage.
		 * "defaul" and "public" does the exact same things.
		 * For "public" keyword you just need to write public keyword in front.
		 * "private" can access only inside same class;
		 * "private" can not access inside in the same pacakge in different class.
		 * "protected" can access inside the same package and different class.
		 * If protected class is related to other class from different pacakage can allow to access.
		 * 
		 */		
		
		Access1 a = new Access1();
		System.out.println(a.hours);
		System.out.println(a.minutes);
		
		System.out.println(a.i);
		System.out.println(a.j);
		
		System.out.println(a.r);
		System.out.println(a.s);
		
		System.out.println(a.gethour());
		System.out.println(a.getlastname());
		
	}

}
