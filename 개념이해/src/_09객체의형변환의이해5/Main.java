package _09객체의형변환의이해3;

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
