package _09��ü������ȯ������4;

public class Main {
	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ClassB cb = new ClassB();
		
		System.out.println("�׽�Ʈ1");
		cb.method();
		
		System.out.println("�׽�Ʈ2");
		cb=ca;
		cb.method();
	}
}
