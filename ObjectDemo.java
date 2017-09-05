package demo1;
/**
 * @description ，练习Object类的使用
 * @author ding
 *
 */
class Person{
	String name = "张三";
	int age = 23;
	public String toString() {
		return "我是"+this.name+"，今年"+this.age;
		
	}

}


public class ObjectDemo {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
		System.out.println(p.toString());
	}

}
