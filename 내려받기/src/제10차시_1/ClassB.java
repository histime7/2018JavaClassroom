package 제10차시_1;

import 제10차시_2.ClassC;

public class ClassB extends ClassC {
	private int b1;
	int b2;
	protected int b3;
	public int b4;

	public ClassB() {
		this.b1=21;
		this.b2=22;
		this.b3=23;
		this.b4=24;
		this.c1=25;
		this.c2=26;
		this.c3=27;
		this.c4=28;
		System.out.println(b1 + "," + b2 + "," + b3 + "," + b4 + "," + 
		                   c1 + "," + c2 + "," + c3 + "," + c4);
	}
}