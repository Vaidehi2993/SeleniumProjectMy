package Abstraction;

public class Testcar {

	public static void main(String[] args) {
		
		BMW b1 = new BMW();
		b1.start();
		b1.stop();
		b1.refuel();
		b1.healthSafety();
		
		
		Car c = new BMW();
		c.start();
		c.stop();
		c.refuel();

	}

}
