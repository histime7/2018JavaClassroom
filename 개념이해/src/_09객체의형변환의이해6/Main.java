package _09객체의형변환의이해4;

public class Main {
	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ClassB cb = new ClassB();
		
		System.out.println("테스트1");
		cb.method();
		
		System.out.println("테스트2");
		cb=ca;
		cb.method();
	}
}
