package _09��ü������ȯ������2;

public class Main {
	public static void main(String[] args) {
		ClassA cc=new ClassA();
		ClassB cd=new ClassB();
		cc=(ClassA) cd;					//����ȯ ����
		cc.a1=31;
		cc.a2=32;
		cc.b1=33;
		cc.b2=34;
		cc.methodA();
		cc.methodB();
	}
}
