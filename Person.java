package demo1;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("进入父类的有参构造方法");
	}
	
	public Person() {		
		System.out.println("进入父类的无参构造方法");
	}

	void speak() {
		System.out.println("我的名字"+name+"我"+age+"岁了");
	}
}
