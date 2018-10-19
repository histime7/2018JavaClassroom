package _06접근제어1;

public class ClassB extends ClassA {
	private int b1;
	int b2;
	protected int b3;
	public int b4;
	
	public ClassB() {
		this.b1=21;
		this.b2=22;
		this.b3=23;
		this.b4=24;
		
		this.a2=25;
		this.a3=26;
		this.a4=27;
	}
}
