package OOPConceptPart1;

public class SwappingValue {

	public static void main(String[] args) {
		
		// 1. Method  - Using Extra Variable and store into java memory.
		int x = 10;
		int y = 20;
		int z;
		
		z=x;
		x=y;
		y=z;
		
		System.out.println(x);
		System.out.println(y);
		
		//2.Method - using addition and substraction argorithem;
		
		int i = 10;
		int q = 20;
		
	
		i = i+q;
		q = i-q;
		i = i-q;
		
		System.out.println(i);
		System.out.println(q);
		
		//3.Method - using charet symbol ^
		
		int x1 = 10;
		int y1 = 20;
		
		x1 = x1^y1;
		y1 = x1^y1;
		x1 = x1^y1;
		
		System.out.println(x1);
		System.out.println(y1);
		
		// to swap three we need extra integer.
		int a = 10;
		int b = 20;
		int c = 30;
		
		a = b;
		b = c;
		c = a;
		
		System.out.println(a +"  "+ b +" "+ c);


	}

}
