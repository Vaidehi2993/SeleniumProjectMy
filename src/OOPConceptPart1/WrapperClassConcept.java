package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		//String to integer
		String x = "100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		System.out.println(i);
		
		//String to double conversion;
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to Character  - No Method
		String s = "a";
		
		//String to boolen
		String a = "True";
		System.out.println(Boolean.parseBoolean(a));
		
		//int to String Conversion
		int j = 200;
		System.out.println(j+20);
		
		String b = String.valueOf(j);
		System.out.println(b+20);
		
		/*
		 * Interview que how you can convert value from string to int or double.
		 * 
		 * Ans - When we are using webpage and getting value in the form of string want
		 * to use as inter need to use parseint, parseDouble, parseBoolean
		 * 
		 * form int to string we have method value of
		 */		
		
		String c = "100A";   // This kind of string will through error NumberFormatException:: For input string: "100A"
		int k = Integer.parseInt(c);

	}

}
