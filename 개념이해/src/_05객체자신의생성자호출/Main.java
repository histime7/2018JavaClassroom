package _05객체자신의생성자호출;

public class Main {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.print();

		Student stu2 = new Student("홍길동");
		stu2.print();

		Student stu3 = new Student(17);
		stu3.print();

		Student stu4 = new Student("홍길동", 17);
		stu4.print();
	}
}
