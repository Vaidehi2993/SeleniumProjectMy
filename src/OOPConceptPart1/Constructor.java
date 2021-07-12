package OOPConceptPart1;

public class Constructor {
	
	String Name;
	int Age;
	
	/*What is constuctor?
	 * method name and classname are same that method called Constructor
	 * Construcor has no return type.
	 * 
	 * we just need to create object for consturctor no need to call.
	 * 
	 * Constructor can be overloading by using same constructor name and using different 
	 * no. of argument/no. of input parameter.
	 */
	public Constructor() {
		System.out.println("Default Constructor");
	}
	
	public Constructor(int i) {
		System.out.println("passing 1 parameter");
		System.out.println(i);
	}
	
	public Constructor(int x, int y) {
		System.out.println("passing 2 parameter");
		System.out.println(x+" "+y);
	}
	
	//"this" keyword we use when we have to intialize the global variable.
	public Constructor(String name, int age) {
		this.Name = name; //this.classvar = localvar
		this.Age = age; //this.classvar = localvar
		
		//Name = name;
		//Age = age;
	}
	
	

	public static void main(String[] args) {
		
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor(10);
		Constructor obj2= new Constructor(20,30);
		Constructor obj3= new Constructor("Tom",25);
		
		System.out.println(obj3.Name);
		System.out.println(obj3.Age);

	}

}
