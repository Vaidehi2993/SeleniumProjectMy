package Test;

public class WhileLoopTest {

	public static void main(String[] args) {
		
		//While Loop Everything we have to put separately 
		//Initialization
		//Condition to stop
		//Increment

		
		int i = 1;
		while(i<=100) {
			System.out.println(i);
			i++;
		
			if(i==50) {
			System.out.println("got 50");
			break;
		}

		}
		
		System.out.println("After Loop");
	}

}
