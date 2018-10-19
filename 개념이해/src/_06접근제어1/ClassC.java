package _06접근제어1;

import _06접근제어2.ClassD;

public class ClassC extends ClassD{
	private int c1;
	int c2;
	protected int c3;
	public int c4;
	
	public ClassC() {
		this.c1=31;
		this.c2=32;
		this.c3=33;
		this.c4=34;
		
		this.d3=35;
		this.d4=36;
	}
}
