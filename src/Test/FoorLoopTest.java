package Test;

public class FoorLoopTest {

	public static void main(String[] args) {
		
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);*/
		
		//i++ = i+1 we can use for next we have to use i+2, i+3...
		
		 for(int i=1; i<=100; i++) {  //(Initialization, Condition to stop, Increment)
			System.out.println(i);   //if condition is true it execute whatever in curly brackets.
		}							 //if condition is false loop stop automatically.
		
		
		 for(int i=1; i<=100; i++) {  			
				System.out.println(i);   
			
			if(i==50) {							//here we only use if not need t use else
				System.out.println("got 50");
				break;
			}
		 }							 
			
		 	System.out.println("After for loop");
		
	}

}
