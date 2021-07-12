package Test;

public class ArgumentTest {

	public static void main(String[] args) {
		
		/*We can use same name method for different argument.
		we can't use same name method for same argument*/
		
		sum();  //4+5
		sum1();
		sum(10,13);
		sum(10,50);
		sum(19,30,85);
		sum(34,67);
		
	}
	
	public static void sum() {  // This method only general method which perform only 4+5 (single integer)
		int a = 4+5;
		System.out.println(a);
		
	}
	
	public static void sum1() {   //method with different name with same argument
	 int b = 6+6;
	 System.out.println(b);
	 
	}
	
	public static void sum(int y, int z) {   //This method is generic method which perform addition of any two Integer.
		int x = y+z;
		System.out.println(x);
	}
	
	public static void sum(int p, int q, int r) { 
		int b = p+q+r;
		System.out.println(b);
	}
}
