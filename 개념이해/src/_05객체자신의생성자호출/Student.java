package _05객체자신의생성자호출;

public class Student {
	String name;
	int age;

	Student() {
		this("모름", -1);
	}

	Student(String name) {
		this(name, -1);
	}

	Student(int age) {
		String name="모름";
		this(name, age);
	}

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void print() {
		System.out.println(name + "," + age);
	}
}
