package OOPConceptPart2;

public class CarInheritance extends Vehicle {

		
		/*
		 * What is inheritance?
		 * 
		 * child class inheritance some properties from parent.  Parent can not inheritance from child.
		 * 
		 * child extends parent.
		 * 
		 * Concept of parent may have multiple child classes but child has only and only one parent class.
		 */

	public void start() {
		
		System.out.println("car start");
	}
	
	public void stop() {
		
		System.out.println("car stop");
	}
	
	public void refuel() {
		
		System.out.println("Car fuel");
	}
	
}
