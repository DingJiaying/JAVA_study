package demo1;
/**
 * @description ����ϰObject���ʹ��
 * @author ding
 *
 */
class Person{
	String name = "����";
	int age = 23;
	public String toString() {
		return "����"+this.name+"������"+this.age;
		
	}

}


public class ObjectDemo {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
		System.out.println(p.toString());
	}

}
