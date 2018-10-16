package 제10차시_1;

import 제10차시_2.ClassC;

public class Main {
	public static void main(String[] args) {
		ClassA oA = new ClassA();
		oA.a1=11;					//private int a1;
		oA.a2=12;					//int a2;
		oA.a3=13;					//protected int a3;
		oA.a4=14;					//public int a4;
		System.out.println(oA.a1 + "," + oA.a2 + "," + oA.a3 + "," + oA.a4);
		
		ClassC oC = new ClassC();
		oC.c1=31;					//private int c1;
		oC.c2=32;					//int c2;
		oC.c3=33;					//protected int c3;
		oC.c4=34;					//public int c4;
		System.out.println(oC.c1 + "," + oC.c2 + "," + oC.c3 + "," + oC.c4);
		
	    ClassB oB = new ClassB();
	    oB.b1=21;					//private int b1;
	    oB.b2=22;					//int b2;
	    oB.b3=23;					//protected int b3;
	    oB.b4=24;					//public int b1;
	    oB.c1=25;					//private int c1;
	    oB.c2=26;					//int c2;
	    oB.c3=27;					//protected int c3;
	    oB.c4=28;					//public int c1;
		System.out.println(oB.b1 + "," + oB.b2 + "," + oB.b3 + "," + oB.b4 + "," + 
				           oB.c1 + "," + oB.c2 + "," + oB.c3 + "," + oB.c4);
	}
}
