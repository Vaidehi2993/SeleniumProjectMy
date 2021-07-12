package Test;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//Array has Fix Size
		//ArrayList doesn't has to mentioned the size. we can add and remove value any time.
		
		//ClassName objName = new ClassName();
		ArrayList<String> tools = new ArrayList<String>();
		
		tools.add("selenium");  //We add in Array List
		tools.add("QTP");
		tools.add("Junit");
		tools.add("TesttNG");  //We can add N number of line
		
		
		System.out.println(tools.size()); //ArrayList - Varialble.size()
		
		System.out.println(tools.get(0));   //To read from Array List
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));

		System.out.println(tools);
		
		tools.add("Jenkins");
		System.out.println(tools.size());
		System.out.println(tools);
		
		tools.remove(2);
		System.out.println(tools.remove(2));
		
		for(int i=0; i<tools.size();i++) {
		System.out.println(tools.get(i));
	}
		
	}

}
