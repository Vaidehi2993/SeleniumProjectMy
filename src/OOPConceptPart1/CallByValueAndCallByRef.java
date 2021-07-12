package OOPConceptPart1;

public class CallByValueAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValueAndCallByRef Obj = new CallByValueAndCallByRef();
		
		int x = 10;
		int y = 20;
		Obj.testSum(x, y);  //Call by Value or Pass by pass
		
		Obj.p = 50;
		Obj.q = 60;
		
		Obj.swap(Obj);
		//after swap
		System.out.println(Obj.p);
		System.out.println(Obj.q);
	
	}
	
	//call by value - We are just passing copy of argument/ input parameter inside main method.  - 
	
	public int testSum(int a, int b) {
		int c = a+b;
		return c;
	
	}
	
	//Call by Reference - we are passing the value of object reference its possible in java.
	
	public void swap(CallByValueAndCallByRef t) {
		int temp;  //I need to swap i will have to use third variable
		temp = t.p; //temp = 50;
		t.p = t.q;  //t.p = 60;
		t.q = temp; //t.q = 50;
		
		
	}

}
