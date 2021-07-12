package AccessModifier;

public class Access1 {
	
	int hours = 3;
	int minutes = 47;
	
	String name;
	String last;
	
	public int i = 25;
	public int j = 30;
	
	private int p = 1;
	private int q = 2;
	
	protected int r = 2;
	protected int s = 3;
	
	
	public int gethour() {
		return hours;
	}
	
	private String getname() {
		return name;
	}
	
	protected String getlastname() {
		return last;
	}
	
	
}
