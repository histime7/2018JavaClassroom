package _09객체의형변환의이해2;

public class Main {
	public static void main(String[] args) {
		ClassA cc=new ClassA();
		ClassB cd=new ClassB();
		cc=(ClassA) cd;					//형변환 오류
		cc.a1=31;
		cc.a2=32;
		cc.b1=33;
		cc.b2=34;
		cc.methodA();
		cc.methodB();
	}
}
