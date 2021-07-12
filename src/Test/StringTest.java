package Test;

public class StringTest {

	public static void main(String[] args) {
		
		// String - In java String is class not datatypes and always save in double quotes.
		
		String myName = "Vaidehi";
		System.out.println("myName"); //Will print same as it is
		System.out.println(myName); //will print value what is on myName.
		
		String lastName = "Patel";
		System.out.println(lastName);
		System.out.println(myName+lastName);
		
		String space = " ";
		System.out.println(myName+ space +lastName);
		System.out.println(myName + " " + lastName);
		
		System.out.println(myName.charAt(5));
		System.out.println(myName.indexOf('d'));
		System.out.println(lastName.charAt(3));
		System.out.println(lastName.indexOf('a'));
		
		int i = 10;
		int j = 100;
		
		System.out.println(myName+lastName+i+j); //Our line starting with string all these consider as string
		System.out.println(i+j+myName+lastName); //Value will be added as they start with integers.
		System.out.println(myName+lastName+(i+j)); //Here it works as arithmetic operation first and then after run as string
		
		
		
	}

}
