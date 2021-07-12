package Test;

public class ArrayTest {

	public static void main(String[] args) {
		
		String tool= "Selenium"; //if you want to save one particular value we create single Variable.
		//If we want to save more than one value/integer we create Array.
		//After variable when we put this bracket [] its Array ; i.e - tools[]
		String tools[] = {"Selenium","QTP", "Junit","TestNG", "Jenkins"};
		
		System.out.println(tools.length); // Varialble.length - will give you how many value inside array
		
		System.out.println(tools[0]);//Array has index, In java index always start with 0
		System.out.println(tools[1]); //use to Real value
		System.out.println(tools[2]);
		System.out.println(tools[3]);
		System.out.println(tools[4]);
	
		int a[] = {1,5,25,85,100};
		System.out.println(a.length);  
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		for(int i = 0; i<a.length ; i++) {
		System.out.println(a[i]);
		
		}

	}

}
