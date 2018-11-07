package _11인터페이스의이해;

public class ClassA implements InterfaceA {
	ClassA() {
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		InterfaceA.method2();
	}
	
	public void method1() {
		System.out.println("추상메소드 method1()를 오버라이딩함");
	}
}
