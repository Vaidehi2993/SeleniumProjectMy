package Test;

public class DataTypes {

	public static void main(String[] args) {
	
	// In Java we don't print any variable again.
		
		//int - Numbers and always save without quotes
		
		int i = 10;  
		System.out.println("i"); //It will be printed same as it is "?"
		System.out.println(i); //Will be printed value
		
		i = 20;   //In java we don't repeat variable  "int"
		System.out.println(i);
		
		i = i+10;
		System.out.println(i);
		System.out.println(i+10);
		System.out.println(i);
		
		i = i*2;
		System.out.println(i);
		System.out.println(++i);// Pre increment
		System.out.println(i++);  //Post increment
		System.out.println(i);
		
		//Char - Alphabets and numbers, always save in single quote
		char a = 'b';
		System.out.println(a);
		
		char c = '1';
		System.out.println(c);
		
		
		//Float - Decimal number and save without quotes
		double p = 20.967;
		System.out.println(p);

		//Boolean - True , False
		boolean x = true;
		System.out.println(x);
		
		x = false;
		System.out.println(x);
		
	}

}
