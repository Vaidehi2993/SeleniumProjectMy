package OOPConceptPart1;

public class MethodOverloading {
	
	/*
	 * //We can not create method inside the method 
	 * //We can not create method with same name and same no. of argument not allowed. No duplicate method. 
	 * //But we can create method with same name passing different parameter.
	 * //We can see sum() method is overloading.
	 * 
	 * Defination - when the method name is same with different arguments 
	 * or input parameter with different datatype within the same calss.
	 * 
	 * Same method name, different no. of input parameter / no. of argument using different data type is allowed
	 * 
	 * Can we overload main method? - yes we can overload main method using different argument.
	 *
	 */
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(20, 30);
		
	}
	
	public void sum() {  //passing 0 input parameter
		System.out.println("sum method - zero parameter");
	}
	
	public void sum(int i) { //passing 1 input parameter
		System.out.println("sum method - one parameter");
		System.out.println(i);
	}
	
	public void sum(int i, int j) { //passing 2 input parameter.
		System.out.println("sum method - two parameter");
		System.out.println(i+j);
		
	
	}

}
