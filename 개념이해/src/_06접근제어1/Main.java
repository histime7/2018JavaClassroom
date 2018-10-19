package _06접근제어1;

import _06접근제어2.ClassD;

public class Main {
	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ClassB cb = new ClassB();
		ClassC cc = new ClassC();
		ClassD cd = new ClassD();
		
		ca.a2=111;
		ca.a3=112;
		ca.a4=113;
		
		cb.b2=211;
		cb.b3=212;
		cb.b4=213;
		cb.a2=214;
		cb.a3=215;
		cb.a4=216;
		
		cc.c2=311;
		cc.c3=312;
		cc.c4=313;
		cc.d4=314;
		
		cd.d4=314;
	}
}
