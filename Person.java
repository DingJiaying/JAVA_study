package demo1;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("���븸����вι��췽��");
	}
	
	public Person() {		
		System.out.println("���븸����޲ι��췽��");
	}

	void speak() {
		System.out.println("�ҵ�����"+name+"��"+age+"����");
	}
}
