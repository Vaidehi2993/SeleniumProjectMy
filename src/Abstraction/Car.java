package Abstraction;

public interface Car {
	
	final int wheels = 4;
	
	
	/*
	 * Inside interface when we have to define/ we have to acheive full abstraction
	 * In interface we can have only and only abstract method.
	 * In interface no method body require. 
	 * In interface no need to write "abstract"key word.
	 * When we have to execute interface method we just need to create object.
	 * We are  not define any implementation inside interface its fully abstract class.
	 * When we call this interface class in any other class need to use "implement " Keyword.
	 * can not create the object of interface
	 * Can only define "final" and "static" variable
	 *
	 */	
	
	public void start();
	public void stop();
	public void refuel();
	
	
	

}
