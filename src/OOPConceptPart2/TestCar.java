package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		/*
		 * What is method overridding?
		 * 
		 * When samme method is present in parent class as well as in child class with the same name and same number
		 * of argument, is call over Riding.
		 */		
				
		//static polymorphism -- compile-time polumorphism.

		BMW bw = new BMW();
		bw.start();  //When we have same method name from child class and parent class, it always preference child class method.
		bw.theftsafety();		
		bw.stop();
		bw.refuel();
		bw.engine();
		
		
		CarInheritance cr = new CarInheritance(); //parent can not inheritance from child.
		cr.start();
		cr.stop();
		cr.refuel();
		cr.engine();
		
		
		/* What is dynamic polymorphism or run-time polymorphism. called top Casting.
		 * 
		 * child class object referred by parent class reference variable.
		 * only & only access same method of parent & Child class and can access parent class method.
		 * 
		 */
		
		CarInheritance c1 = new BMW(); 
		
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		
		//down casting - when parent class object referred by using child class reference varible
		//will compile but at run time will through exception.
		BMW b1 = (BMW)new CarInheritance();  //ClasscastException.
	}
	
	


}
