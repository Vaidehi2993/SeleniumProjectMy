package Test;

public class ReturnTypeTest {

	//Public - modifier
	//Static - static or non-static
	//Void - Return type, Void means no return
	
	public static void main(String[] args) {
		
		int x = sum();
		System.out.println(sum());
		System.out.println(x);
		
		int z = sum1(6,7);
		System.out.println(sum1(6,7));
		System.out.println(z);
	
		
		String y = hello();
		System.out.println(y);

	}
	
	/*public static void sum() {   //if method is return type we can not return the method
		int a = 4+5;
	}*/

	public static int sum() {     //if method is integer or string we can call return type and use our code.
		int a = 5+5;
		return a;
		
	}
	
	public static int sum1(int x , int y) {
		int a = x+y;
		return a;
	}
	
	public static String hello() {
		String b = "Hello World";
		return b;
		
	}
}
