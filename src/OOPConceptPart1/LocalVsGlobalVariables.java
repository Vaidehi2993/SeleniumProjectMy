package OOPConceptPart1;

public class LocalVsGlobalVariables {
	
	//Global or class Variables -  Always declare only after the class.
	String Name = "Vaidehi";
	int age = 25;

	//How to access global Variable?  - Have to create object for perticular class.
	
	public static void main(String[] args) {
	
	LocalVsGlobalVariables Obj = new LocalVsGlobalVariables();
	
	int i = 10; //local variable for main method
	System.out.println(i);
	
	System.out.println(Obj.Name);
	System.out.println(Obj.age);
	
	}
	
	public void sum() {
		int x = 25; //local variable for sum() method
		int y = 30;
		int z = 25;
	}

}
