package Test;

public class Test3 {

	static Test3 t3 = new Test3();
	static Test1 t1 = new Test1();
	
	public static void main(String[] args) {
		
		BMW();
		t3.Audi();
		Test1.Scanme();
		t1.testme();

	}
	
	public static void BMW() {
		System.out.println("BMW");
	}
	
	public void Audi() {
		System.out.println("Audi");
	}
}

