package _09��ü������ȯ������3;

public class Main {

	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ClassB cb = new ClassB();
		cb=ca;
		ca=(ClassA) cb;
		
		ca.a1=21;
		ca.a2=22;
		ca.b1=23;
		ca.b2=24;
		ca.methodA();
		ca.methodB();
	}
}
